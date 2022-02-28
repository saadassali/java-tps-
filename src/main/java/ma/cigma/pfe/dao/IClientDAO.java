package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientDAO  extends CrudRepository<Client,Long> {

}
