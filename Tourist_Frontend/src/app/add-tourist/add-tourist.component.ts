import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Tourist } from '../tourist';
import { TouristServiceService } from '../tourist-service.service';

@Component({
  selector: 'app-add-tourist',
  templateUrl: './add-tourist.component.html',
  styleUrls: ['./add-tourist.component.css']
})
export class AddTouristComponent implements OnInit {
tourists : Tourist =new Tourist();
  constructor(private touristservice:TouristServiceService, private router:Router) { }

  ngOnInit(): void {
   
  }
  
  saveTourist(){
    this.touristservice.createTourist(this.tourists).subscribe(data =>{
      console.log(data);
      this.savetourist();
    },
    error => console.log(error));
  };

  savetourist(){
    this.router.navigate(['success']);
  }
  onSubmit(){
console.log(this.tourists);
    this.saveTourist();
  }
}