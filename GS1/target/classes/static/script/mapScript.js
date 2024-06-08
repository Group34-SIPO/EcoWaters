async function initMap() {
  var iconUrl = "../assets/pin.png";

  const {
    Map
  } = await google.maps.importLibrary("maps");


  //
  var mapTra = new Map(document.getElementById('mapa30'), {
    center: {
      lat: -22.5679,
      lng: -48.1624
    },
    zoom: 13,
  });



  var locationsTra = [
  ];

var campos = document.getElementById('navios');
console.log(campos.childElementCount)
console.log(campos.length)
for(let i=0; i<campos.childElementCount; i++){
let lats = document.querySelectorAll('.lat');
let lons = document.querySelectorAll('.lon');
console.log(lats[i].value)
console.log(lons[i].value)
locationsTra.push({
                        lat: Number(lats[i].value),
                        lng: Number(lons[i].value)
                      })
}
console.log(locationsTra)

  locationsTra.forEach(element => {
    new google.maps.Marker({
      position: element,
      icon: iconUrl,
      map: mapTra
    });

    new google.maps.Circle({
      strokeColor: '#ef4444',
      strokeOpacity: 0.8,
      strokeWeight: 2,
      fillColor: '#ef4444',
      fillOpacity: 0.35,
      map: mapTra,
      center: element,
      radius: 500000,
    });
  });
};

// Adiciona um ouvinte ao evento de carregamento da janela
window.addEventListener('load', initMap);