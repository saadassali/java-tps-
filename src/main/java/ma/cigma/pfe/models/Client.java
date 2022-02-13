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
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String nom;
    String prenom;
    String tel;
    @Enumerated(EnumType.STRING)
    Genre genre;
    @OneToOne(cascade = CascadeType.ALL)
    Adresse adresse;

}
