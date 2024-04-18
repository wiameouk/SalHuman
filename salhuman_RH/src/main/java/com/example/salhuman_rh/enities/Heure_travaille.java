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
public class Heure_travaille {
    @Id
    private Timestamp date;
    private Number nombreHeures;
    private String type;
    @ManyToMany
    @JoinTable(name = "HEURE_EMP")
    private List<Employe>  employes_HeureTrav = new ArrayList<>();


}
