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


public class conge {
    @Id
    private String TypeConge;
    private Timestamp DateDebut;
    private Timestamp DateFin;
    private String Statut;

    @ManyToMany
    @JoinTable(name = "CONGE_EMPLO")
    private List<Employe> employes_conge = new ArrayList<>();


}
