package tn.esprit.skiv;

import entity.TypeAbonnement;
import lombok.*;
import  javax.persistence.*;
import java.io.Serializable;
import java.util.Date;




@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Abonnement")
public class Abonnement implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "numAbon")
    private Long numAbon;
    private Float prixAbon;
    @Enumerated (EnumType.STRING)
    private TypeAbonnement typeAbon;
    private Date dateDebut;
    private Date dateFin;


}
