import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../models/User';


@Injectable({
  providedIn: 'root'
})
export class UserServiceService {
  private apiURL = 'http://localhost:3000'


  constructor(private http: HttpClient) { }

  postRegisterUser(user: User) {
    console.log("postRegisterUser");
    console.log(user);
    return this.http.post<any>(`${this.apiURL}/user/add`, user);
  }
}
