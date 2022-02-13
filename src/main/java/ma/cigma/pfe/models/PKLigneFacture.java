package ma.cigma.pfe.models;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PKLigneFacture implements Serializable {
    long id_Produit;
    long id_Facture;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PKLigneFacture)) return false;
        PKLigneFacture that = (PKLigneFacture) o;
        return id_Produit == that.id_Produit && id_Facture == that.id_Facture;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_Produit, id_Facture);
    }
}
