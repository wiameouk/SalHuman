package com.example.salhuman_rh.enities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Fiche_de_paie {
    @Id

    private Timestamp periode;
    private Number MontantBrut;
    private Number MontantNet;
    private String detailsDeductions;
    @ManyToOne
    private Employe employe;
    @ManyToMany(mappedBy = "FichePaieSalaire", fetch = FetchType.LAZY)
    private List<ElementSalaire> elementSalaires= new ArrayList<>();


}
