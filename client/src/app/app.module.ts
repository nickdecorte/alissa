import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NbThemeModule, NbLayoutModule, NbButtonModule, NbInputModule, NbListModule, NbSidebarModule, NbDialogModule, NbMenuModule, NbIconModule, NbSidebarService, NbCardModule } from '@nebular/theme';
import { NbEvaIconsModule } from '@nebular/eva-icons';
import { SettingsComponent } from './settings/settings.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { BudgettingComponent } from './settings/budgetting/budgetting.component';
import { CategoriesComponent } from './settings/budgetting/categories/categories.component';
import { AccountsComponent } from './settings/budgetting/accounts/accounts.component';

@NgModule({
  declarations: [
    AppComponent,
    SettingsComponent,
    DashboardComponent,
    BudgettingComponent,
    CategoriesComponent,
    AccountsComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    NbThemeModule.forRoot({ name: 'default' }),
    NbLayoutModule,
    NbEvaIconsModule,
    NbButtonModule,
    NbMenuModule.forRoot(),
    NbDialogModule.forRoot(),
    NbSidebarModule,
    NbListModule,
    NbIconModule,
    NbInputModule,
    NbCardModule
  ],
  providers: [NbSidebarService],
  bootstrap: [AppComponent]
})
export class AppModule { }
