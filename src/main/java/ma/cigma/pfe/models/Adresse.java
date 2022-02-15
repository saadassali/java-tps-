package ma.cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

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
    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn
    Client client;

    public Adresse( String avenue, String ville, String pays) {
        this.avenue = avenue;
        this.ville = ville;
        this.pays = pays;

    }
}
