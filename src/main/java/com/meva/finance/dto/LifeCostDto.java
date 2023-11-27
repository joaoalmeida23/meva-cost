package com.meva.finance.dto;

import com.meva.finance.model.LifeCost;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LifeCostDto {

    private Long idLifeCost;
    private String description;
    private double value;
    private Date month;
    private Long idFamily;
    private Long idCategory;

    public LifeCost convert(){
        return LifeCost.builder().idCost(idLifeCost).description(description).value(value).month(month).idFamily(idFamily).idCategory(idCategory).build();
    }
}
