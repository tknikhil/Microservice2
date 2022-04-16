package currencyexchangemicroservices.repository_interface;

import org.springframework.data.jpa.repository.JpaRepository;

import currencyexchangemicroservices.bean.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	
	CurrencyExchange findByFromAndTo(String from,String to);

}
