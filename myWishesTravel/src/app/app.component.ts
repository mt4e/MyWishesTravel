import { Component, OnInit } from '@angular/core';
import * as L from 'leaflet';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'myWishesTravel';

// Fonction d'initialisation du composant.
ngOnInit() {
  // Déclaration de la carte avec les coordonnées du centre et le niveau de zoom.
  const myMap = L.map('myMap').setView([50.6311634, 3.0599573], 12);

  L.tileLayer('http://{s}.tile.osm.org/{z}/{x}/{y}.png', {
    attribution: 'My map'
  }).addTo(myMap);
}
}
