package com.dkghosh.trading.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TradeRequest(
        @NotBlank(message = "Symbol is required")
        String symbol,

        @NotBlank(message = "Side is required")
        String side,

        @NotNull(message = "Entry price is required")
        double entry_price,

        @NotNull(message = "Exit price is required")
        double exit_price,

        @Min(value = 1, message = "Quantity must be at least 1")
        int quantity,

        @NotNull(message = "PnL is required")
        double pnl,

        @NotBlank(message = "Notes are required")
        String notes
) {}