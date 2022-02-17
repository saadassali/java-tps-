package ma.cigma.pfe.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@PrimaryKeyJoinColumn(name="normal_id")
@Entity
@NoArgsConstructor

public class ClientNormal extends Client{
    private int importanceLevel;

    public ClientNormal(String nom, String prenom, String tel, Genre genre, int importanceLevel) {
        super(nom, prenom, tel, genre);
        this.importanceLevel = importanceLevel;
    }
}
