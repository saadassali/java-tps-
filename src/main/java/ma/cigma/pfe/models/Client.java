package ma.cigma.pfe.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String nom;
    String prenom;
    String tel;
    @Enumerated(EnumType.STRING)
    Genre genre;
    @OneToMany(cascade = CascadeType.PERSIST,mappedBy = "client")
     @JoinColumn
    List<Adresse> adresse;

    public Client(String nom, String prenom, String tel, Genre genre) {

        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.genre = genre;


    }


}
