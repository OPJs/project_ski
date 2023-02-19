package entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = { "entity" })
public enum Couleur {
    bleu, noir, rouge, vert


}
