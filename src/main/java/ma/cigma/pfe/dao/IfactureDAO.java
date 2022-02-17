package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.models.Facture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IfactureDAO extends CrudRepository<Client,Long> {

 public void deleteById(long idFacture);
 Facture save(Facture f);
 public Facture findById(long idFacture);
 public Facture update(long newFacture,double amount);

}
