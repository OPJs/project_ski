package tn.esprit.skiv;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import  javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Skieur")
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numSkieur")
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private String ville;
    private Date datenaissance;
}
