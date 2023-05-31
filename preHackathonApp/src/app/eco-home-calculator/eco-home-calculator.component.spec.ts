import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EcoHomeCalculatorComponent } from './eco-home-calculator.component';

describe('EcoHomeCalculatorComponent', () => {
  let component: EcoHomeCalculatorComponent;
  let fixture: ComponentFixture<EcoHomeCalculatorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EcoHomeCalculatorComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EcoHomeCalculatorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
