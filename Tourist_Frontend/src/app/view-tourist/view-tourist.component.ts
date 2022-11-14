import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Tourist } from '../tourist';
import { TouristServiceService } from '../tourist-service.service';

@Component({
  selector: 'app-view-tourist',
  templateUrl: './view-tourist.component.html',
  styleUrls: ['./view-tourist.component.css']
})
export class ViewTouristComponent implements OnInit {
  tourists:any=[]; 
  constructor(private touristsevice:TouristServiceService,private router:Router) { }

  ngOnInit(): void {
    this.getTourist();
  }

  private getTourist(){
    this.touristsevice.getTouristList().subscribe(data =>{
      this.tourists=data;
    });
  }

  Onsubmit(){
    console.log(this.tourists);
  }
}
