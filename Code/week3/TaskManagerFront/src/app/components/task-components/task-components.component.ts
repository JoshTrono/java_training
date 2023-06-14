import { Component } from '@angular/core';
import { Task } from 'src/app/models/Task';
import { TaskServiceService } from 'src/app/services/task-service.service';

@Component({
  selector: 'app-task-components',
  templateUrl: './task-components.component.html',
  styleUrls: ['./task-components.component.css']
})
export class TaskComponentsComponent {

  tasks: Task[] | undefined = undefined;

    constructor(private taskService: TaskServiceService) { }


    taskForm = {
      description: '',
      status: '',
      assignedTo: '',


    }

    saveTask(){
      const { description, status, assignedTo} = this.taskForm;
      console.log(assignedTo)

      let observable = this.taskService.postTask(description,status, assignedTo);
      observable.subscribe((response) => {
        console.log(response);
      });
    }
    ShowMyTasks(){
      let observable = this.taskService.getTasks();
      observable.subscribe((response) => {
        console.log(response);
        this.tasks = response;
      });

    }
}
