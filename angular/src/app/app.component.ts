import { Component, OnInit } from '@angular/core';
import { MatTabsModule } from '@angular/material/tabs';
import { Subscription } from 'rxjs';
import { MatIconModule } from '@angular/material/icon';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatMenuModule } from '@angular/material/menu';
import { MatListModule } from '@angular/material/list';
import { AuthService } from './services/Account/auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  
})

export class AppComponent implements OnInit {
  title = 'Ebank';


  constructor(public authService: AuthService) {}
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }


  logout() {
    this.authService.logout();
  }
}
