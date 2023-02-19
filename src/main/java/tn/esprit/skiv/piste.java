package tn.esprit.skiv;





import entity.Couleur;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import  javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Piste")
public class piste implements Serializable {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    @Column(name = "idPiste")
    private Integer idPiste;
    private Long numPiste;
    private String nomPiste;

    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private Integer longeur;
    private Integer pente;
}
