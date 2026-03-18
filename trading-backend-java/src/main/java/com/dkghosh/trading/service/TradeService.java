package com.dkghosh.trading.service ;

import com.dkghosh.trading.client.TradingClient;
import com.dkghosh.trading.dto.TradeRequest;
import com.dkghosh.trading.dto.TradeResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TradeService {

    private static final Logger log = LoggerFactory.getLogger(TradeService.class);

    private final TradingClient tradingClient;

    public TradeService(TradingClient tradingClient) {
        this.tradingClient = tradingClient;
    }

    public TradeResponse executeTrade(TradeRequest request) {
        log.info("Executing trade: {}", request);
        TradeResponse response = tradingClient.placeTrade(request);
        log.info("Trade response: {}", response);
        return response;
    }
}