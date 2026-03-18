from pydantic import BaseModel

class TradeCreate(BaseModel):
    symbol: str
    side: str
    entry_price: float
    exit_price: float
    quantity: int
    pnl: float
    notes: str