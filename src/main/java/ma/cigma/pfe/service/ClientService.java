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
    public Client save(Client c) {

        return cDAO.save(c);
    }
}
