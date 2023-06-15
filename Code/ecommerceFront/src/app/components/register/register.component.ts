import { Component } from '@angular/core';
import { SessionService } from 'src/app/services/session.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {

  constructor(private sessionService: SessionService) { }

  success: boolean | undefined;
  error: boolean | undefined;

  registerForm = {
    firstName: '',
    lastName: '',
    username: '',
    password: '',
    email: ''
  };
  register() {
    let observable = this.sessionService.register(this.registerForm);
    observable.subscribe((response: any) => {
      console.log(response);
      if (response.token == 'register failed') {
        alert('register failed');
      } else {
        this.success = true;
        this.error = false;
      }
    });
  }
}
