import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'my-app',
  templateUrl: './app.component.html',
  styleUrls: [ './app.component.css' ]
})
export class AppComponent {
  links = [
    {path:'/main',label:'main',active:'button-active'},
    {path:'/chat',label:'chat',active:'button-active'}
  ]
isOpen:boolean =false;
 openCart():void{
    this.isOpen = true;
  }
  closeCart():void{
    this.isOpen = false;
  }
}
