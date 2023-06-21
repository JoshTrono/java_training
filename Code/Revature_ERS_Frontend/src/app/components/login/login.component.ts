import { Component } from '@angular/core';
import { AuthenticationService } from 'src/app/services/authentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  loginForm = {
    email: '',
    password: ''
  }

  constructor(private authentication: AuthenticationService) { }
  login() {
    const { email, password } = this.loginForm;
    this.authentication.login(email, password).subscribe((response) => {
      localStorage.setItem('token', response.token);
    });
  }

}
