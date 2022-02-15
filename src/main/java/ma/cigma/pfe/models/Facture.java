package ma.cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    Date date;
    double amount;
    @OneToMany
    List<LigneFacture> ligneFacture;

    public Facture(Date date,double amount) {
        this.date = date;
        this.amount=amount;
    }
    public Facture() {

    }
    @Override
    public String toString() {
        return "facture{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }


}
