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
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Transactional
@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    IClientService cs;


    public Client save(Client clt) {
        return cs.save(clt);
    }
    @PutMapping
    public Client modify(@RequestBody Client clt) {
        return cs.modify(clt);
    }
    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") long idClt) {
        cs.remove(idClt);
    }
    @GetMapping("/{id}")
    public Client getOne(@PathVariable("id") long idClt) {
        return cs.getOne(idClt);
    }
    @GetMapping("/all")
    public List<Client> getAll() {
        return cs.getAll();
    }

}
