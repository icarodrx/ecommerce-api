package com.mdvb.ecommerce_api.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class ClickCount {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "click_count_id_seq")
    @SequenceGenerator(name = "click_count_id_seq", sequenceName = "click_count_id_seq", allocationSize = 1)
    Integer id;

    Integer count;

    public ClickCount(Integer id, Integer count) {
        this.id = id;
        this.count = count;
    }

    public ClickCount() {
    }

    public Integer getId() {
        return id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
