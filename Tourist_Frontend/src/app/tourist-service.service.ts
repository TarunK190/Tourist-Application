import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Tourist } from './tourist';

@Injectable({
  providedIn: 'root'
})
export class TouristServiceService {
private baseUrl="http://localhost:9092/tourist";
  constructor(private httpClient:HttpClient) { }

  createTourist(tourists:Tourist): Observable<Object>{
    return this.httpClient.post(`${this.baseUrl}`,tourists);
  }

  getTouristList():Observable<Tourist>{
    return this.httpClient.get<Tourist>(`${this.baseUrl}`);

  }
}
