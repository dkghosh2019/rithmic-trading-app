package com.dkghosh.trading.controller;

import com.dkghosh.trading.dto.TradeRequest;
import com.dkghosh.trading.dto.TradeResponse;
import com.dkghosh.trading.service.TradeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/trades")
public class TradeController {

    private final TradeService tradeService;

    public TradeController(TradeService tradeService) {
        this.tradeService = tradeService;
    }

    @PostMapping
    public TradeResponse placeTrade(@Valid @RequestBody TradeRequest request) {
        return tradeService.executeTrade(request);
    }
}