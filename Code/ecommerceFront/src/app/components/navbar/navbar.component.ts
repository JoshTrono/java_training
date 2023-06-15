import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {
  localStorage: Storage;

  constructor(private router: Router) {
    this.localStorage = localStorage;
  }


  clickButton(path: String) {
    this.router.navigate([path]);
  }
  logout() {
    localStorage.removeItem('token');
    this.router.navigate(['/login']);
  }
}
