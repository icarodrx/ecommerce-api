package com.mdvb.ecommerce_api.service;

import com.mdvb.ecommerce_api.model.entities.ClickCount;
import com.mdvb.ecommerce_api.repository.ClickCountRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ClickCountService {
    private final ClickCountRepository clickCountRepository;

    public ClickCountService(ClickCountRepository clickCountRepository) {
        this.clickCountRepository = clickCountRepository;
    }

    public Integer getClickCount() {
        return clickCountRepository
                .findAll()
                .stream()
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundException("No click_count records exist"))
                .getCount();
    }

    public ClickCount updateClickCount() {
        ClickCount clickCount =  clickCountRepository
                .findAll()
                .stream()
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundException("No click_count records exist"));

        clickCount.setCount(clickCount.getCount() + 1);

        return clickCountRepository.save(clickCount);
    }
}
