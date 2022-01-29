package ma.cigma.pfe.service;

import ma.cigma.pfe.dao.IfactureDAO;
import ma.cigma.pfe.models.Facture;

public class FactureServiceimpl implements IFactureService {


    public FactureServiceimpl(IfactureDAO fdao) {
        this.fdao = fdao;
    }

    public FactureServiceimpl() {
    }


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

        return fdao.findById(idFacture);
    }

    @Override
    public Facture update(long newFacture,double amount) {
        fdao.update(newFacture,amount);
        return null;
    }
}
