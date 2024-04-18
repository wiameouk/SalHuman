package com.example.salhuman_rh.enities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ElementSalaire {
    @Id
    private String Type ;
    private Number montant;
    @ManyToMany
    @JoinTable(name = "FICHE_SALAIRE")
    private List<Fiche_de_paie> FichePaieSalaire = new ArrayList<>();

}

