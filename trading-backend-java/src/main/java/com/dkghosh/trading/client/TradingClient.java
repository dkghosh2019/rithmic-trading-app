package com.dkghosh.trading.client;

import com.dkghosh.trading.dto.TradeRequest;
import com.dkghosh.trading.dto.TradeResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TradingClient {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${trading.python-backend.base-url}")
    private String baseUrl;

    public TradeResponse placeTrade(TradeRequest request) {
        String url = baseUrl + "/trades";
        System.out.println("Calling FastAPI URL: " + url);
        return restTemplate.postForObject(url, request, TradeResponse.class);
    }
}