package org.exchange.server.currencyconversionserver;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	FeignExchangeServiceProxy proxy;

	@GetMapping("/conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean getConversion(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		return new CurrencyConversionBean(1000L, from, to, BigDecimal.valueOf(70), BigDecimal.ONE, quantity, 70);
	}
	
	@GetMapping("/conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean getFeignConversion(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		CurrencyConversionBean response=proxy.exchangeDb(from, to);
		return new CurrencyConversionBean(1000L, from, to, response.getConversionRate(), quantity,quantity.multiply(response.getConversionRate()), 70);
	}
}
