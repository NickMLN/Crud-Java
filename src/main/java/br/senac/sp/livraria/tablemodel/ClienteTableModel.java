package br.senac.sp.livraria.tablemodel;

import br.senac.sp.livraria.model.Cliente;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ClienteTableModel extends AbstractTableModel {
    private List<Cliente> lista;

    private String[] cabecalho = {"ID", "Nome", "CPF", "E-mail"};

    public ClienteTableModel(List<Cliente> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalho.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Cliente c = lista.get(linha);
        switch (coluna) {
            case 0:
                return c.getId();
            case 1:
                return c.getNome();
            case 2:
                return c.getCpf();
            case 3:
                return c.getEmail();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int coluna) {
        return cabecalho[coluna];
    }

    public void setLista(List<Cliente> lista) {
        this.lista = lista;
    }
}
