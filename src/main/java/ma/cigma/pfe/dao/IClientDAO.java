package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Client;
import org.springframework.stereotype.Repository;

public interface IClientDAO {
    Client save(Client c);

}
