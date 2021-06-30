package com.excelsior.cloud.member.service.imp;


import com.excelsior.cloud.member.api.MemberServiceApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberService implements MemberServiceApi {


    public String test(){

        return "this is memberService test";
    }


}
