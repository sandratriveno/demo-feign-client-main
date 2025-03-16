package pe.edu.idat.demo_feign_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class DemoFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFeignClientApplication.class, args);
	}

}
