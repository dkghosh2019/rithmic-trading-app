
from fastapi import FastAPI
from fastapi.middleware.cors import CORSMiddleware

from services.market_data_service import MarketDataService
from services.trade_service import TradeService
from schemas import TradeCreate


app = FastAPI()

market_data_service = MarketDataService()
trade_service = TradeService()

app.add_middleware(
    CORSMiddleware,
    allow_origins=["http://localhost:4200"],
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

@app.get("/health")
def health():
    return {"status": "ok"}

@app.get("/market-data/test")
def market_data_test():
    return market_data_service.get_test_market_data()

@app.get("/trades")
def get_trades():
    return trade_service.get_all_trades()

@app.post("/trades")
def create_trade(trade: TradeCreate):
    return trade_service.create_trade(trade.model_dump())