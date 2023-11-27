package com.meva.finance.controller;

import com.meva.finance.dto.LifeCostDto;
import com.meva.finance.service.LifeCostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/cost")
public class LifeCostController {

    private final LifeCostService service;

    @Autowired
    public LifeCostController(LifeCostService service) {
        this.service = service;
    }

    @PostMapping("/registrar")
    public ResponseEntity<LifeCostDto> registerLifeCost(@RequestBody LifeCostDto lifeCostDto){

        service.registerCost(lifeCostDto);
        return ResponseEntity.ok(lifeCostDto);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<LifeCostDto> update(@RequestBody LifeCostDto lifeCostDto){

        service.update(lifeCostDto);
        return ResponseEntity.ok(lifeCostDto);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<LifeCostDto> delete(@RequestBody Long id, LifeCostDto lifeCostDto){

        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
