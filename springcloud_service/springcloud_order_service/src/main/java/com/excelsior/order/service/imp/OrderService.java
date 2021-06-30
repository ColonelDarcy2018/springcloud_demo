package com.excelsior.order.service.imp;

import com.excelsior.order.api.OrderServiceApi;
import com.excelsior.order.service.feign.MemberServiceFeign;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderService implements OrderServiceApi {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private MemberServiceFeign memberServiceFeign;


//    @GetMapping("/test")
//    public String getMemberInfo(){
//
//        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-member");
//
//        String url=instances.get(0).getUri().toString()+"/test";
//
//        System.out.println(url);
//        return restTemplate.getForObject(url,String.class);
//    }

    public String getMember(){

        return memberServiceFeign.test();
    }


}
