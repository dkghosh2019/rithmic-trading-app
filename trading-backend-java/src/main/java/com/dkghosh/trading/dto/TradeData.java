package com.dkghosh.trading.dto;

public record TradeData(
        String symbol,
        String side,
        double entry_price,
        double exit_price,
        int quantity,
        double pnl,
        String notes
) {}