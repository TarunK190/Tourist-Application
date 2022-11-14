import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { AddTouristComponent } from './add-tourist/add-tourist.component';
import {HttpClientModule} from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { SuccessComponent } from './success/success.component';
import { ViewTouristComponent } from './view-tourist/view-tourist.component';



@NgModule({
  declarations: [
    AppComponent,

    AddTouristComponent,
     SuccessComponent,
     ViewTouristComponent
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
