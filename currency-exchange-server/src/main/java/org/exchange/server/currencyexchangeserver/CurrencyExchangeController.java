package org.exchange.server.currencyexchangeserver;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	@Autowired
	ExchangeRepository repo;
	

	@GetMapping("/exchange/from/{from}/to/{to}")
	public Exchange exchange(@PathVariable String from, @PathVariable String to) {
		return new Exchange(1000L,from,to,BigDecimal.valueOf(70));
	}
	
	@GetMapping("/exchange-db/from/{from}/to/{to}")
	public Exchange exchangeDb(@PathVariable String from, @PathVariable String to) {
		
		Exchange e=		repo.findByFromAndTo(from, to);
		return e;
	}
}
