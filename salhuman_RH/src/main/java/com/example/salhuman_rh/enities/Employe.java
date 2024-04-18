package com.example.salhuman_rh.enities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_empl;
    private String Nom;
    private String Prenom;
    private String Departement;
    private String poste;
    private Date DateEmbauche;
    @OneToMany(mappedBy = "employe", fetch = FetchType.LAZY)
    private List<Fiche_de_paie> Employes = new ArrayList<>();
    @ManyToMany(mappedBy = "employes_conge", fetch = FetchType.LAZY)
    private List<conge> conges = new ArrayList<>();
    @ManyToMany(mappedBy = "employes_HeureTrav", fetch = FetchType.LAZY)
    private List<Heure_travaille> HeureTravaille = new ArrayList<>();






}
