package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.models.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientDAO implements IClientDAO{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_factures");
    EntityManager em = emf.createEntityManager();

    @Override
    public Client save(Client c) {

        em.getTransaction().begin();
        em.refresh(c);
        em.getTransaction().commit();


        return c;
    }
}
