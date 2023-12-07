package org.ENSAJ.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.ENSAJ.Client;

import javax.persistence.*;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@Table(name = "voiture")
public class Voiture {
    @Id
    @GeneratedValue
    private Integer id;
    private String matricule;
    private String marque;
    private String model;
    private Integer client_id;

}
