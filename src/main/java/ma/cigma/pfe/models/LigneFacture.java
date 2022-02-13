package ma.cigma.pfe.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class LigneFacture {
    @EmbeddedId
    PKLigneFacture id;
    int qte;

}
