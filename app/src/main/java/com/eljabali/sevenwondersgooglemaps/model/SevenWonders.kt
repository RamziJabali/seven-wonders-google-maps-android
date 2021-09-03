package com.eljabali.sevenwondersgooglemaps.model

import com.google.android.gms.maps.model.LatLng

enum class SevenWonders(val location: LatLng, val description: String) {
    pyramidsOfGiza(LatLng(29.97730524865085, 31.13249479583215), "Pyramids Of Giza"),
    statueOfZeus(LatLng(37.63806220183685, 21.630222000818012),"Statue Of Zeus"),
    hangingGardenOfBabylon(LatLng(34.99142465790425, 42.40516143736894), "Hanging Garden Of Babylon"),
    theTempleOfArtemis(LatLng(37.949668894238485, 27.36392057253303), "The Temple Of Artemis"),
    mausoleumHalicarnassus(LatLng(37.038058662866646, 27.42410566937252), "Mausoleum at Halicarnassus"),
    colossusOfRhodes(LatLng(36.45114258824363, 28.22582485586854), "Colossus Of Rhodes"),
    lighthouseOfAlexandria(LatLng(31.214423294920753, 29.891364913457224), "Lighthouse Of Alexandria");
}

