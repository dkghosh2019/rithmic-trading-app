package com.dkghosh.trading.client;

import com.dkghosh.trading.dto.TradeRequest;
import com.dkghosh.trading.dto.TradeResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import java.time.Duration;

@Component
public class TradingClient {

    private final WebClient webClient;

    public TradingClient(@Value("${trading.python-backend.base-url}") String baseUrl) {
        this.webClient = WebClient.builder()
                .baseUrl(baseUrl)
                .build();
    }

    public TradeResponse placeTrade(TradeRequest request) {
        return webClient.post()
                .uri("/trades")
                .bodyValue(request)
                .retrieve()
                .bodyToMono(TradeResponse.class)
                .timeout(Duration.ofSeconds(5))
                .block();
    }
}