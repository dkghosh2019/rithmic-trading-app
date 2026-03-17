
import { Injectable, inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface MarketData {
  symbol: string;
  bid: number;
  ask: number;
  last: number;
}

@Injectable({
  providedIn: 'root'
})
export class MarketDataService {
  private http = inject(HttpClient);
  private baseUrl = 'http://127.0.0.1:8000';

  getTestMarketData(): Observable<MarketData> {
    return this.http.get<MarketData>(`${this.baseUrl}/market-data/test`);
  }
}