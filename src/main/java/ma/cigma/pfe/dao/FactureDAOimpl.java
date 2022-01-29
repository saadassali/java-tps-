package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactureDAOimpl implements IfactureDAO{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_factures");
    EntityManager em = emf.createEntityManager();


    public FactureDAOimpl() {
        System.out.println("dao created");
    }




    @Override
    public Facture findById(long idF) {

        return  em.find(Facture.class,idF);
    }

    @Override
    public Facture update(long idF,double amount) {
        em.getTransaction().begin();
        Facture currentFacture =
        em.find(Facture.class,idF);
        currentFacture.setAmount(amount);
        em.persist(currentFacture);
        em.getTransaction().commit();
        return null;
    }
    @Override
    public void deleteById(long idFacture) {
        em.getTransaction().begin();
        Facture clientInDataBase = em.find(Facture.class,idFacture);
        System.out.println(clientInDataBase.toString());
        em.remove(clientInDataBase);
        em.getTransaction().commit();
    }
    @Override
    public Facture save(Facture f) {

        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();


        return null;
    }
}
