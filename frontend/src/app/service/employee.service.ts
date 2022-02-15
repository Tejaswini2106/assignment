import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http/http';
import { Employee } from '../model/employee';
import {  } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  URL: string = 'http://localhost:8080/employees/';

  constructor(private http: HttpClient) { }

  getEmployees() {
    this.http.get(this.URL + "getEmployees");
  }
}
