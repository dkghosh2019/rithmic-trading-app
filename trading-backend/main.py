from fastapi import FastAPI
from fastapi.middleware.cors import CORSMiddleware

app = FastAPI()

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
    return {
        "symbol": "ESZ6",
        "bid": 7156.75,
        "ask": 7157.00,
        "last": 7157.00
    }