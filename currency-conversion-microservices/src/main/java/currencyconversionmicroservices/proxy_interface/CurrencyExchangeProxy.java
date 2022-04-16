package currencyconversionmicroservices.proxy_interface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import currencyconversionmicroservices.bean.CurrencyConverion;

@FeignClient(name="currency-exchange",url="localhost:8000")
public interface CurrencyExchangeProxy {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConverion retriveExchangeValue(
			@PathVariable("from") String from,
			@PathVariable("to") String to);
}