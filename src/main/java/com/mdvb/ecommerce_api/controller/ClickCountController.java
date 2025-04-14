package com.mdvb.ecommerce_api.controller;

import com.mdvb.ecommerce_api.model.entities.ClickCount;
import com.mdvb.ecommerce_api.service.ClickCountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/click-count")
public class ClickCountController {
    private final ClickCountService clickCountService;

    public ClickCountController(ClickCountService clickCountService) {
        this.clickCountService = clickCountService;
    }

    @GetMapping()
    public Integer getClickCount() {
        return clickCountService.getClickCount();
    }

    @PostMapping()
    public ClickCount updateClickCount() {
        return clickCountService.updateClickCount();
    }
}
