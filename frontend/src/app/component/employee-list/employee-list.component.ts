import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/model/employee';
import { EmployeeService } from 'src/app/service/employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employees: Employee[] = [];

  constructor(private employeeService: EmployeeService) { }

  ngOnInit(): void {
    this.employeeService.getEmployees().subscribe(
      (resp: Employee[]) => {
        this.employees = resp;
      }, (err: string) => {
        console.log(err);
      }
    );
  }

}
