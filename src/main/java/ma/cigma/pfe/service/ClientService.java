package ma.cigma.pfe.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.cigma.pfe.dao.IClientDAO;
import ma.cigma.pfe.models.Client;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientService implements IClientService
{
    IClientDAO cDAO;
    @Override
    public Client save(Client c) {

        return cDAO.save(c);
    }
}
