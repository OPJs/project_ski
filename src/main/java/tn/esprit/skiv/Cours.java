package tn.esprit.skiv;

import entity.Support;
import entity.TypeCours;
import lombok.*;

import  javax.persistence.*;
import java.io.Serializable;



@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Cours")
public class Cours implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numCours")
    private Long numCours;
    private Integer niveau;
    @Enumerated (EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    private Support support;
    private Float prix;
    private Integer creneau;
}
