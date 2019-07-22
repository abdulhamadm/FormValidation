import { Component } from '@angular/core';
import {AppService} from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Form Validation App';
  error  =false;
  success =  false;
  inputValue = "";
  customPattern = "^[a-zA-Z]*$";
  
  constructor(public appService : AppService ){

  }
  
  inputCheck(){
    this.error = false;
    if(this.inputValue.match(this.customPattern)){
      return true;
     }else{          
       this.error = true;
     }
  }
  validate(){
    this.success = true;
    this.appService.validate(this.inputValue).subscribe(res=>{
      if(res=="Failed"){
        this.error = true;
      }else{
        this.success = true;
      }
     
    });
  }
  
}
