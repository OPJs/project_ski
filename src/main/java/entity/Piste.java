package entity;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import  javax.persistence.*;
import java.io.Serializable;

@EntityScan(basePackages = { "entity" })
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Piste")
public class Piste implements Serializable {
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
