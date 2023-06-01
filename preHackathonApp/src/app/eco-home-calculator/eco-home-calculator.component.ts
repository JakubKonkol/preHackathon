import { Component } from '@angular/core';
import {Device} from "../Device";
export interface Day{
  day: number;
  powerUsage: number;
}
@Component({
  selector: 'app-eco-home-calculator',
  templateUrl: './eco-home-calculator.component.html',
  styleUrls: ['./eco-home-calculator.component.css']
})
export class EcoHomeCalculatorComponent {
  devices: Device[] = [
    new Device(1, 'TV', 150, 'assets/tv.webp'),
    new Device(2, 'Laptop', 50, 'assets/laptop.webp'),
    new Device(3, 'Fridge', 200, 'assets/fridge.avif'),
    new Device(4, 'Washing Machine', 300, 'assets/wash.webp')
  ]
  yourDevices: Device[] = [];
  days: Day[] = [];

  constructor() { }
  calculateTotalDailyPowerUsage(){
    let total = 0;
    for (let device of this.yourDevices){
      total += device.powerUsage * 12; //12 hours per day
    }
    return total;
  }

  addDevice(device: Device) {
    this.yourDevices.push(device);
  }

  skipDay() {
    this.days.push({day: this.days.length + 1, powerUsage: this.calculateTotalDailyPowerUsage()});
    this.yourDevices = [];
  }
}
