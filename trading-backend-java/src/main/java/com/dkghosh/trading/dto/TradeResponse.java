package com.dkghosh.trading.dto;

public record TradeResponse(
        String message,
        TradeData trade
) {}