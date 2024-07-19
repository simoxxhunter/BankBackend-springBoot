import { Component, OnInit } from '@angular/core';
import { account } from 'src/app/Models/account';
import { AccountServicesService } from 'src/app/services/Account/account-services.service';
import { Router } from '@angular/router';

@Component({
  selector: 'home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  accounts: account[] = [];

  constructor(private service: AccountServicesService, private router: Router) { }

  ngOnInit(): void {
    this.getlistAccounts();
  }

  private getlistAccounts() {
    this.service.getAccount().subscribe(data => {
      this.accounts = data;
    });
  }
}
