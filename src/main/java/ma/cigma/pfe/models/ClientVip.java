package ma.cigma.pfe.models;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.List;
@PrimaryKeyJoinColumn(name="vip_id")
@Entity
@NoArgsConstructor
public class ClientVip extends Client{
    int importanceLevel;


    public ClientVip( String nom, String prenom, String tel, Genre genre,  int importanceLevel) {
        super( nom, prenom, tel, genre);
        this.importanceLevel = importanceLevel;
    }
}
