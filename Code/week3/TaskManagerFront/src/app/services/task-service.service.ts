import { Injectable } from '@angular/core';
import { Task } from '../models/Task';
import { HttpClient, HttpParams } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TaskServiceService {


  private api = "http://www.localhost:8080"

  constructor(private http: HttpClient) { }

  postTask(description: String, status: String, assignedTo: String) {
    const params = new HttpParams()
    .set ('assign', assignedTo.toString());
    console.log("Assigned to: " + assignedTo);
    return this.http.post<any>(`${this.api}/tasks/save`, { description, status, assignedTo }, {params});
  }

  getTasks() {
    return this.http.get<any>(`${this.api}/tasks`);
    //throw new Error('Method not implemented.');
  }
}
