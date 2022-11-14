import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddTouristComponent } from './add-tourist/add-tourist.component';
import { AppComponent } from './app.component';

import { SuccessComponent } from './success/success.component';
import { ViewTouristComponent } from './view-tourist/view-tourist.component';



const routes: Routes = [
  

  {path:'',redirectTo:'homepage',pathMatch:'full'},
  {path:'addTourist',component:AddTouristComponent},
  {path:'success',component:SuccessComponent},
  {path:'viewTourist',component:ViewTouristComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
