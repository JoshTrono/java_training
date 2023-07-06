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

  constructor(private authenticationService: AuthenticationService) { }

  register() {
    const { username, password, confirmPassword } = this.registerForm;
    if (password !== confirmPassword) {
      alert('Password and Confirm Password do not match');
      return;
    }
    this.authenticationService.register(this.registerForm.username, this.registerForm.password)
      .subscribe(
        (data) => {
          console.log(data);
        },
        (error) => {
          console.log(error);
        }
      );
  }



}
