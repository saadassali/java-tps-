package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Facture;
import org.springframework.stereotype.Repository;


public interface IfactureDAO {

 public void deleteById(long idFacture);
 Facture save(Facture f);
 public Facture findById(long idFacture);
 public Facture update(long newFacture,double amount);

}
