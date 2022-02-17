package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Client;
import org.springframework.stereotype.Repository;
@Repository

public interface IClientDAO {
    Client save(Client c);

}
