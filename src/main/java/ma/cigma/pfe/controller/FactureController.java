package ma.cigma.pfe.controller;

import ma.cigma.pfe.models.Facture;
import ma.cigma.pfe.service.IFactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("factureCtrl")
public class FactureController {
    @Autowired
    IFactureService fservice;

    public FactureController(IFactureService fservice) {

        this.fservice = fservice;
    }

    public FactureController() {
    }



    public Facture save(Facture f)
    {
        fservice.save(f);
        return  null;
    }
    public Facture update(long f,double amount )
    {
        fservice.update(f,amount);
        return  null;
    }
    public Facture delete(long id)
    {
        fservice.deleteById(id);
        return  null;
    }
    public Facture find(long id)
    {
       Facture f= fservice.findById(id);
        return  f;
    }
}
