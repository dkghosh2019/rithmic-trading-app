import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: 'market-data',
    loadComponent: () =>
      import('./market-data/market-data-page/market-data-page')
        .then(m => m.MarketDataPage)
  },
  {
    path: 'trades',
    loadComponent: () =>
      import('./trades/trades-page/trades-page')
        .then(m => m.TradesPage)
  },
  {
    path: 'journal',
    loadComponent: () =>
      import('./journal/journal-page/journal-page')
        .then(m => m.JournalPage)
  },
  {
    path: 'copier',
    loadComponent: () =>
      import('./copier/copier-page/copier-page')
        .then(m => m.CopierPage)
  },
  {
    path: '',
    redirectTo: 'market-data',
    pathMatch: 'full'
  }
];