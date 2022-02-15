package ma.cigma.pfe.models;

import lombok.*;

import javax.persistence.*;

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
//    @Enumerated(EnumType.STRING)
//    Genre genre;
//    @OneToOne(cascade = CascadeType.ALL)
//    Adresse adresse;

}
