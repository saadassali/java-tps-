package ma.cigma.pfe.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.cigma.pfe.dao.IClientDAO;
import ma.cigma.pfe.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Service
@Transactional

public class ClientService implements IClientService
{
    @Autowired
    IClientDAO cDAO;
    @Override
    @Transactional
    public Client save(Client clt) {
        return cDAO.save(clt);
    }
    @Override
    @Transactional
    public Client modify(Client newClt) {
        Client oldClt = cDAO.findById(newClt.getId()).get();
        oldClt.setNom(newClt.getNom());

        return cDAO.save(oldClt);
    }
    @Override
    @Transactional
    public void remove(long idClt) {
        cDAO.deleteById(idClt);
    }
    @Override
    public Client getOne(long idClt) {
        return cDAO.findById(idClt).get();
    }
    @Override
    public List<Client> getAll() {
        return (List<Client>) cDAO.findAll();
    }
}
