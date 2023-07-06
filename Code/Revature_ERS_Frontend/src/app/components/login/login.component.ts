import { Component } from '@angular/core';
import { AuthenticationService } from 'src/app/services/authentication.service';
import { NavbarComponent } from '../navbar/navbar.component';

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

  status: String | undefined;



  constructor(private authentication: AuthenticationService) { }
  login() {
    const { email, password } = this.loginForm;
    this.authentication.login(email, password).subscribe(
      (response) => {
        localStorage.setItem('token', response.token);
        this.status = 'Login successful!';
        this.authentication.getRole(response.token).subscribe(
          (response2) => {
            localStorage.setItem('role', response2);
          },
          (error) => {
            console.error('Error getting role:', error);
            // Display error message to user
            this.status = 'Error getting role. ' + (error?.error?.message || 'Unknown error') + '.';
          }
        );
      },
      (error) => {
        console.error('Error logging in:', error);
        // Display error message to user
        this.status = 'Error logging in. ' + (error?.error?.message || 'Unknown error') + '.';
      }
    );
  }
}
