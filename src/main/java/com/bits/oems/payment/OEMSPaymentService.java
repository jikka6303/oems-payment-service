package com.bits.oems.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = "com.bits")
@EnableFeignClients(basePackages = "com.bits")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class OEMSPaymentService {

	public static void main(String[] args) {
		SpringApplication.run(OEMSPaymentService.class, args);
	}

}
