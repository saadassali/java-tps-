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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Transactional
@Controller("clientCtrl")
public class ClientController {
    @Autowired
    IClientService cs;


   public Client save(Client c)
    {
        return cs.save(c);
    }

}
