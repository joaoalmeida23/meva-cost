package com.meva.finance.repository;

import com.meva.finance.model.LifeCost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LifeCostRepository extends JpaRepository<LifeCost, Long> {

}
