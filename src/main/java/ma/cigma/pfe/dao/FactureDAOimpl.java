package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Facture;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class FactureDAOimpl implements IfactureDAO{
    @PersistenceContext
    EntityManager em ;


    public FactureDAOimpl() {
        System.out.println("dao created");
    }




}
