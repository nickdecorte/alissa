import { Component } from '@angular/core';
import { NbMenuItem } from '@nebular/theme';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  sidebarState: string;

  items: NbMenuItem[] = [{
    link: '/',
    title: 'Dashboard',
    icon: 'home-outline',
  }, {
    link: '/budgetting',
    title: 'Budgetting',
    icon: 'credit-card-outline',
  }, {
    link: '/settings',
    title: 'Settings',
    icon: 'settings-2-outline',
  }];

  constructor() {
    this.sidebarState = 'expanded';
  }

  toggle() {
    if (this.sidebarState == 'collapsed') {
      this.sidebarState = 'expanded';
    } else {
      this.sidebarState = 'collapsed';
    }
  }
}
