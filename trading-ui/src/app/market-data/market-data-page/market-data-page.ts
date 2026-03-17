
import { Component, OnInit, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MarketData, MarketDataService } from '../../core/market-data.service';

@Component({
  selector: 'app-market-data-page',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './market-data-page.html',
  styleUrl: './market-data-page.css'
})
export class MarketDataPage implements OnInit {
  private marketDataService = inject(MarketDataService);

  marketData: MarketData | null = null;
  loading = true;
  error = '';

  ngOnInit(): void {
    console.log('MarketDataPage loaded');

    this.marketDataService.getTestMarketData().subscribe({
      next: (data: MarketData) => {
        console.log('API response:', data);
        this.marketData = data;
        this.loading = false;
      },
      error: (err: unknown) => {
        console.error('API error:', err);
        this.error = 'Failed to load market data';
        this.loading = false;
      }
    });
  }
}