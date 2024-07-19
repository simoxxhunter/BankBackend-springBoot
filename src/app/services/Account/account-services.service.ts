import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { account } from 'src/app/Models/account';

@Injectable({
  providedIn: 'root'
})
export class AccountServicesService {

  [x: string]: any;

  private baseURL = "http://localhost:9090/compte";


  constructor(private httpClient: HttpClient) { }

  getAccount(): Observable<account[]> {
    return this.httpClient.get<account[]>(`${this.baseURL}`);
  }
}




