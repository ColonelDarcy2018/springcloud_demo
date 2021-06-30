package com.excelsior.order.api;

import org.springframework.web.bind.annotation.GetMapping;

public interface OrderServiceApi {

    @GetMapping("/getMember")
    String getMember();
}