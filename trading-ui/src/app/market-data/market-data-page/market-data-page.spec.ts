import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MarketDataPage } from './market-data-page';

describe('MarketDataPage', () => {
  let component: MarketDataPage;
  let fixture: ComponentFixture<MarketDataPage>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MarketDataPage]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MarketDataPage);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
