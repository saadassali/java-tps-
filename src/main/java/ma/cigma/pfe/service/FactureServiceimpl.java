package ma.cigma.pfe.service;

import ma.cigma.pfe.dao.IfactureDAO;
import ma.cigma.pfe.models.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class FactureServiceimpl implements IFactureService {


    public FactureServiceimpl(IfactureDAO fdao) {
        this.fdao = fdao;
    }

    public FactureServiceimpl() {

    }

    @Autowired
    IfactureDAO fdao;

    @Override
    public Facture save(Facture f) {

       fdao.save(f);

        return null;
    }

    @Override
    public void deleteById(long idFacture) {
        fdao.deleteById(idFacture);
    }

    @Override
    public Facture findById(long idFacture) {

        return fdao.findById(idFacture).get();
    }

    @Override
    public Facture update(long newFacture,double amount) {
//        fdao.save(newFacture,amount);
        return null;
    }
}
