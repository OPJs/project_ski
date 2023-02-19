package tn.esprit.skiv;

import lombok.*;

import  javax.persistence.*;
import java.io.Serializable;
import java.util.Date;



@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Moniteur")
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numMoniteur")
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date dateRecru;
}
