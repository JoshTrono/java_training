import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { User } from 'src/app/models/User';
import { UserServiceService } from 'src/app/services/user-service.service';

@Component({
  selector: 'app-session-component',
  templateUrl: './session-component.component.html',
  styleUrls: ['./session-component.component.css']
})
export class SessionComponentComponent {

  constructor(private http: HttpClient, private userService: UserServiceService) {}

  private api = "http://www.localhost:8080"

  user: any;

  userForm = {
    username: '',
    password: '',
    email: '',
  }

  //userForm: User | undefined;

  saveUser(){
    const { username, password, email} = this.userForm;
    let observable = this.userService.postRegisterUser(new User(username, password, email));
    observable.subscribe((response) => {
      console.log(response);
      this.user = response;
    });
    return this.user;
  }

}
