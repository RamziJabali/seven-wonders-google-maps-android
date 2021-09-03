package com.eljabali.sevenwondersgooglemaps.model

import com.eljabali.sevenwondersgooglemaps.R
import com.google.android.gms.maps.model.LatLng

enum class SevenWonders(val location: LatLng, val description: String, val wonderOfTheWorldImageURL: String) {
    PyramidsOfGiza(LatLng(29.97730524865085, 31.13249479583215), "Pyramids Of Giza","https://www.planetware.com/photos-large/EGY/egypt-cairo-pyramids-of-giza-and%20camels-2.jpg"),
    StatueOfZeus(LatLng(37.63806220183685, 21.630222000818012), "Statue Of Zeus", "https://images.squarespace-cdn.com/content/v1/57125c2c2b8dde54a34b537f/1602873843893-F2BXXQAAU4V431PD10D8/chryselephantine-statue-of-Zeus+What+Happened+to+the+Statue+of+Zeus+at+Olympia.jpg"),
    HangingGardenOfBabylon(LatLng(34.99142465790425, 42.40516143736894), "Garden Of Babylon","https://i.natgeofe.com/n/18b80fef-63f4-4423-8da0-d99ad9b614df/babylonian-oasis-artist-rendering.jpg"),
    TheTempleOfArtemis(LatLng(37.949668894238485, 27.36392057253303), "The Temple Of Artemis","https://drivethruhistory.com/wp-content/uploads/2018/10/3_Temple-of-Artemis-A11.jpg"),
    MausoleumHalicarnassus(LatLng(37.038058662866646, 27.42410566937252), "Mausoleum at Halicarnassus","https://wilstar.com/wp-content/uploads/2017/07/mausoleum-1.jpg"),
    ColossusOfRhodes(LatLng(36.45114258824363, 28.22582485586854), "Colossus Of Rhodes","https://gemtravel.gr/wp-content/uploads/2017/02/colossusofrhodes.jpg"),
    LighthouseOfAlexandria(LatLng(31.214423294920753, 29.891364913457224), "Lighthouse Of Alexandria","https://lh3.googleusercontent.com/proxy/ed17SWb4eMwM3F9CDXhrOu5fWwj82iQaS2F6C63gIksUDNZiqyI632chkvD05arABMq4PUa26zf6t8a_kprLajaJGwwkBBKoxA");
    companion object{
        fun getListOfSevenWonders(): List<SevenWonders> = listOf(PyramidsOfGiza, StatueOfZeus, HangingGardenOfBabylon, TheTempleOfArtemis, MausoleumHalicarnassus, ColossusOfRhodes, LighthouseOfAlexandria)
    }
}

