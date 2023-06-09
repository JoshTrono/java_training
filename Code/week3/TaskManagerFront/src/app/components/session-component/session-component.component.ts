import { Component } from '@angular/core';
import { User } from 'src/app/models/User';

@Component({
  selector: 'app-session-component',
  templateUrl: './session-component.component.html',
  styleUrls: ['./session-component.component.css']
})
export class SessionComponentComponent {

  user: any;

  userForm = {
    username: '',
    password: '',
    firstName: '',
    lastName: '',
    role: ''
  }

  //userForm: User | undefined;

  saveUser(){
    const { username, password, firstName, lastName, role } = this.userForm;
    console.log({ username, password, firstName, lastName, role});
  }

}
