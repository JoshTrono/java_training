import { Component } from '@angular/core';
import { SessionService } from 'src/app/services/session.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  constructor(private sessionService: SessionService) { }

  userForm = {
    username: '',
    password: '',
  };

  login() {
    const { username, password } = this.userForm;
    let observable = this.sessionService.login(username, password);
    observable.subscribe((response) => {
      console.log(response);
    });
    //console.log(username, password)
  }
}
