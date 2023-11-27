package com.meva.finance.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "life_cost")
public class LifeCost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "life_cost")
    private Long idCost;
    private String description;
    private double value;
    private Date month;

    @Column(name = "id_family")
    private Long idFamily;

    @Column(name = "id_category")
    private Long idCategory;
}
