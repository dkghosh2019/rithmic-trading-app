import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CopierPage } from './copier-page';

describe('CopierPage', () => {
  let component: CopierPage;
  let fixture: ComponentFixture<CopierPage>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CopierPage]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CopierPage);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
