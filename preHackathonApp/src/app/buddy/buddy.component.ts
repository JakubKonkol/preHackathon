import { Component } from '@angular/core';
import { Task } from '../task';
@Component({
  selector: 'app-buddy',
  templateUrl: './buddy.component.html',
  styleUrls: ['./buddy.component.css']
})
export class BuddyComponent {
  tasks: Task[] = [];
  constructor() {

  }
  generateTask() {
    this.tasks.push(new Task(1, "Posprzataj w pokoju", "PRIORITY: LOW"))
  }
}
