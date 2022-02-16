package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.models.Facture;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Repository
public class ClientDAO implements IClientDAO{
@PersistenceContext
EntityManager emClient;

    @Override
    public Client save(Client c) {

        emClient.merge(c);


        return c;
    }
}
