import { Component, ChangeDetectorRef } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from 'src/app/services/authentication.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {


  Admin = this.auth.Admin;

  constructor(private route: Router, private cdr : ChangeDetectorRef, private auth: AuthenticationService) {

  }
  ngOnInit() {
    window.onstorage = () => {
      // Update component logic
      this.cdr.detectChanges();
    };
  }


  clickedButton(nav: String) {
    this.route.navigate([nav]);
  }

  refresh() {
    this.cdr.detectChanges();
  }

}
