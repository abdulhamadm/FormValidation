import { Injectable } from '@angular/core';
 
import { HttpClient } from '@angular/common/http';
 
import 'rxjs/add/operator/map';
 
import 'rxjs/add/operator/catch';
 
import { Observable } from 'rxjs/Observable';
 

 
@Injectable()
export class AppService {
  constructor(private http: HttpClient) { }
 
validate(input): Observable<string> {
  try {
    return this.http.get('http://localhost:8080/validate?input='+input) .map(res=>res) ;
  }catch (error) { 
    console.log(error);
  }  
}


}
