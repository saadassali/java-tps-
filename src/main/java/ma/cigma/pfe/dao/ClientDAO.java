package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.models.Facture;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Repository

public class ClientDAO implements IClientDAO{
@PersistenceContext
EntityManager em;

    @Override
    public Client save(Client c) {

        em.getTransaction().begin();
        em.merge(c);
        em.getTransaction().commit();


        return c;
    }
}
