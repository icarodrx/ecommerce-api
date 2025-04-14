package com.mdvb.ecommerce_api.repository;

import com.mdvb.ecommerce_api.model.entities.ClickCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClickCountRepository extends JpaRepository<ClickCount, Integer> {
}
