package ma.cigma.pfe.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Transactional
@Controller("clientCtrl")
public class ClientController {
    @Autowired
    IClientService cs;


    public Client save(Client clt) {
        return cs.save(clt);
    }
    public Client modify(Client clt) {
        return cs.modify(clt);
    }
    public void remove(long idClt) {
        cs.remove(idClt);
    }
    public Client getOne(long idClt) {
        return cs.getOne(idClt);
    }
    public List<Client> getAll() {
        return cs.getAll();
    }

}
