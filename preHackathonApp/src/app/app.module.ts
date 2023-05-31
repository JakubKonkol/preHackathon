import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { BuddyComponent } from './buddy/buddy.component';
import { StatsComponent } from './stats/stats.component';
import { SummaryComponent } from './summary/summary.component';
import { HeaderComponent } from './header/header.component';
import { UserComponent } from './user/user.component';
import { EcoHomeCalculatorComponent } from './eco-home-calculator/eco-home-calculator.component';

@NgModule({
  declarations: [
    AppComponent,
    BuddyComponent,
    StatsComponent,
    SummaryComponent,
    HeaderComponent,
    UserComponent,
    EcoHomeCalculatorComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
