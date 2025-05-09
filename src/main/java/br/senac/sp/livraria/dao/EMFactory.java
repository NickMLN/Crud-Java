package br.senac.sp.livraria.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

// Equivale ao ConnectionFactory
public class EMFactory {
    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("senac");

    // Equivale a pegar uma conexão com o banco
    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}
