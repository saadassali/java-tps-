package ma.cigma.pfe.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String nom;
    String prenom;
    String tel;
    @Enumerated(EnumType.STRING)
    Genre genre;

    public Client(String nom)
    {
        this.nom=nom;
    }
    public Client(String nom, String prenom, String tel, Genre genre) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.genre = genre;

    }


}
