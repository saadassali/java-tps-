package ma.cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String avenue;
    String ville;
    String pays;
    @OneToOne(mappedBy = "adresse")
    Client client;

    public Adresse(long id, String avenue, String ville, String pays) {
        this.id = id;
        this.avenue = avenue;
        this.ville = ville;
        this.pays = pays;
    }
}
