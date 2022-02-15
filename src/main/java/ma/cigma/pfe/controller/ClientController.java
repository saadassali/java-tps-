package ma.cigma.pfe.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.service.IClientService;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientController {
    IClientService cs;


   public Client save(Client c)
    {
        return cs.save(c);
    }

}
