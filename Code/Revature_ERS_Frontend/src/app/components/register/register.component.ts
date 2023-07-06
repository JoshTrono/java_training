import { Component } from '@angular/core';
import { AuthenticationService } from 'src/app/services/authentication.service';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  registerForm = {
    username: '',
    password: '',
    confirmPassword: ''
  };
  status: string = '';

  constructor(private authentication: AuthenticationService) {}

  register() {
    const { username, password, confirmPassword } = this.registerForm;
    if (password !== confirmPassword) {
      this.status = 'Error: Passwords do not match.';
      return;
    }
    this.authentication.register(username, password).subscribe(
      () => {
        this.status = 'Registration successful.';
      },
      (error: { error: { message: any; }; }) => {
        console.error('Error registering:', error);
        this.status = 'Error registering. ' + (error?.error?.message || 'Unknown error') + '.';
      }
    );
  }
}
