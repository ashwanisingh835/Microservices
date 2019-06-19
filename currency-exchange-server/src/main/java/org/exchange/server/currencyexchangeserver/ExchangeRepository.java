package org.exchange.server.currencyexchangeserver;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRepository extends JpaRepository<Exchange, Long>{
 Exchange findByFromAndTo(String from,String to);
}
