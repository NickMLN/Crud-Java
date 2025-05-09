package br.senac.sp.livraria.dao;

import br.senac.sp.livraria.model.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.sql.SQLException;
import java.util.List;

public class ClienteJpaDao implements InterfaceDao<Cliente> {
    private EntityManager maneger;

    public ClienteJpaDao(EntityManager maneger) {
        this.maneger = maneger;
    }

    @Override
    public void inserir(Cliente objeto) throws SQLException {
        this.maneger.persist(objeto);
        this.maneger.getTransaction().begin();
        this.maneger.getTransaction().commit();
    }

    @Override
    public void alterar(Cliente objeto) throws SQLException {
        this.maneger.persist(objeto);
        this.maneger.getTransaction().begin();
        this.maneger.getTransaction().commit();
    }

    @Override
    public void excluir(int id) throws SQLException {
        Cliente c = buscar(id);
        this.maneger.remove(c);
        this.maneger.getTransaction().begin();
        this.maneger.getTransaction().commit();
    }

    @Override
    public List<Cliente> listar() throws SQLException {
        List<Cliente> lista;
        TypedQuery<Cliente> query = maneger.createQuery("select c from Cliente c", Cliente.class);
        return query.getResultList();
    }

    @Override
    public Cliente buscar(int id) throws SQLException {
        return maneger.find(Cliente.class, id);
    }

    public List<Cliente> buscar(String nome) {
        TypedQuery<Cliente> query = maneger.createNamedQuery( "select c from Cliente c where c.nome like :nome", Cliente.class);
        query.setParameter("nome", "%" + nome + "%");
        return query.getResultList();
    }
}
