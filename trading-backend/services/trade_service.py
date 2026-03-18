class TradeService:
    def __init__(self):
        self.trades = []
        self.next_id = 1

    def get_all_trades(self):
        return self.trades

    def create_trade(self, trade_data: dict):
        trade = {
            "id": self.next_id,
            "symbol": trade_data["symbol"],
            "side": trade_data["side"],
            "entry_price": trade_data["entry_price"],
            "exit_price": trade_data["exit_price"],
            "quantity": trade_data["quantity"],
            "pnl": trade_data["pnl"],
            "notes": trade_data["notes"],
        }
        self.trades.append(trade)
        self.next_id += 1
        return trade
    