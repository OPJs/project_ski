package entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = { "entity" })
public enum TypeCours {
    COLLECTIF_ENFANT,COLLECIF_ADULTE,PARTICULIER
}
