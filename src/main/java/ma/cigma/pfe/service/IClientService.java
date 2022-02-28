package ma.cigma.pfe.service;

import ma.cigma.pfe.models.Client;
import org.springframework.stereotype.Service;

import java.util.List;
public interface IClientService {
    Client save(Client c);
    Client modify(Client clt);
    void remove(long idClt);
    Client getOne(long idClt);
    List<Client> getAll();

}
