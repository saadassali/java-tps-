package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Facture;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
@Repository


public class FactureDAOimpl implements IfactureDAO{
    @PersistenceContext
    EntityManager em ;


    public FactureDAOimpl() {
        System.out.println("dao created");
    }




    @Override
    public Facture findById(long idF) {

        return  em.find(Facture.class,idF);
    }

    @Override
    public Facture update(long idF,double amount) {
        Facture currentFacture =
        em.find(Facture.class,idF);
        currentFacture.setAmount(amount);
        em.persist(currentFacture);
        return null;
    }
    @Override
    public void deleteById(long idFacture) {
        Facture clientInDataBase = em.find(Facture.class,idFacture);
        System.out.println(clientInDataBase.toString());
        em.remove(clientInDataBase);
    }
    @Override
    public Facture save(Facture f) {

        em.persist(f);


        return null;
    }
}
