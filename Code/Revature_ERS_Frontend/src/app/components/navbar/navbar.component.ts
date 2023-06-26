import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {


  Admin: boolean = false;

  constructor(private route: Router) {

  }

  clickedButton(nav: String) {
    this.route.navigate([nav]);
  }
  isAdmin() {
    if (localStorage.getItem('role') === 'ADMIN') {
      this.Admin = true;
    } else {
      this.Admin = false;
    }
  }

}
