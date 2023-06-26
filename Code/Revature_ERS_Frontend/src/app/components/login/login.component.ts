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

  private navbar: NavbarComponent | undefined;


  constructor(private authentication: AuthenticationService) { }
  login() {
    const { email, password } = this.loginForm;
    this.authentication.login(email, password).subscribe((response) => {
      localStorage.setItem('token', response.token);
      this.authentication.getRole(response.token).subscribe((response2) => {
        localStorage.setItem('role', response2);
        if (this.navbar) {
          if (localStorage.getItem('role') === 'ADMIN') {
            this.navbar.Admin = true;
          } else {
            this.navbar.Admin = false;
          }
        }
      });
    });
  }

}
