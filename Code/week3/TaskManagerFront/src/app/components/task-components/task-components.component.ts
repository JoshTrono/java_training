import { Component } from '@angular/core';
import { Task } from 'src/app/models/Task';
import { TaskServiceService } from 'src/app/services/task-service.service';

@Component({
  selector: 'app-task-components',
  templateUrl: './task-components.component.html',
  styleUrls: ['./task-components.component.css']
})
export class TaskComponentsComponent {

    constructor(private taskService: TaskServiceService) { }

    taskForm = {
      description: '',
      status: '',
      assigned_to: '',
    }

    saveTask(){
      const { description, status, assigned_to} = this.taskForm;

      console.log(description, status, assigned_to);
      let observable = this.taskService.postTask(new Task(description, status, assigned_to));
      observable.subscribe((response) => {
        console.log(response);
      });
    }
}
