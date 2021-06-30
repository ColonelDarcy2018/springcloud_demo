package com.excelsior.order.service.feign;


import com.excelsior.cloud.member.api.MemberServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("cloud-member")
public interface MemberServiceFeign extends MemberServiceApi {
}
