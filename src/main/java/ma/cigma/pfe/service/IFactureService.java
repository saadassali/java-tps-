package ma.cigma.pfe.service;

import ma.cigma.pfe.models.Facture;

public interface IFactureService  {
    public Facture save(Facture f);
    public void deleteById(long idFacture);
    public Facture findById(long idFacture);
    public Facture update(long newFacture,double amount);
}
