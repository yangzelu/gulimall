package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "gulimall-coupon", url = "127.0.0.1:7001")
public interface CouponFeignService {

	@RequestMapping("/coupon/coupon/member/list")
	R membercoupons();
}
