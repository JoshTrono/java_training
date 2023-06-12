import { Injectable } from '@angular/core';
import { Task } from '../models/Task';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TaskServiceService {

  private api = "http://www.localhost:4200"

  constructor(private http: HttpClient) { }

  postTask(task: Task) {
    return this.http.post<any>(`${this.api}/tasks/save`, task);
  }
}
