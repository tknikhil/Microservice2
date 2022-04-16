package currencyconversionmicroservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class CurrencyConversionMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionMicroservicesApplication.class, args);
	}

}
