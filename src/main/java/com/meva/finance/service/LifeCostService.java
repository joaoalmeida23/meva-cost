package com.meva.finance.service;


import com.meva.finance.client.CategoryFeign;
import com.meva.finance.dto.LifeCostDto;
import com.meva.finance.model.LifeCost;
import com.meva.finance.repository.LifeCostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class LifeCostService {

    private final LifeCostRepository lifeCostRepository;
    private final CategoryFeign client;



    public Long registerCost(LifeCostDto lifeCostDto){

       lifeCostDto.setIdCategory(client.buscarPorId(lifeCostDto.getDescription()));


       LifeCost lifeCost = lifeCostDto.convert();


        return lifeCostRepository.save(lifeCost).getIdCategory();
    }




    public LifeCost update(LifeCostDto lifeCostDto){

        LifeCost lifeCost = lifeCostDto.convert();
        return lifeCostRepository.save(lifeCost);
    }

    public void delete(Long id){

        lifeCostRepository.deleteById(id);
    }


}
