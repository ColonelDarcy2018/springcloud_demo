package com.excelsior.cloud.member.api;

import org.springframework.web.bind.annotation.GetMapping;

public interface MemberServiceApi {

    @GetMapping("/test")
    String test();
}
