package com.dkghosh.trading.service;

import com.dkghosh.trading.client.TradingClient;
import com.dkghosh.trading.dto.TradeRequest;
import com.dkghosh.trading.dto.TradeResponse;
import org.springframework.stereotype.Service;

@Service
public class TradeService {

    private final TradingClient tradingClient;

    public TradeService(TradingClient tradingClient) {
        this.tradingClient = tradingClient;
    }

    public TradeResponse executeTrade(TradeRequest request) {
        return tradingClient.placeTrade(request);
    }
}