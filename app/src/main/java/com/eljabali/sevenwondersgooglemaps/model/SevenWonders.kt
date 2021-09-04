package com.eljabali.sevenwondersgooglemaps.model

import androidx.annotation.StringRes
import com.eljabali.sevenwondersgooglemaps.R
import com.google.android.gms.maps.model.LatLng

enum class SevenWonders(val location: LatLng, @StringRes val locationName: Int, @StringRes val description: Int, val wonderOfTheWorldImageURL: String) {
    PYRAMIDS_OF_GIZA(LatLng(29.979402, 31.134566), R.string.pyramids_of_giza, R.string.pyramids_of_giza_description, "https://www.planetware.com/photos-large/EGY/egypt-cairo-pyramids-of-giza-and%20camels-2.jpg"),
    STATUE_OF_ZEUS(LatLng(37.63806220183685, 21.630222000818012), R.string.statue_of_zeus, R.string.statue_of_zeus_description, "https://images.squarespace-cdn.com/content/v1/57125c2c2b8dde54a34b537f/1602873843893-F2BXXQAAU4V431PD10D8/chryselephantine-statue-of-Zeus+What+Happened+to+the+Statue+of+Zeus+at+Olympia.jpg"),
    HANGING_GARDEN_OF_BABYLON(LatLng(34.99142465790425, 42.40516143736894), R.string.garden_of_babylon, R.string.garden_of_babylon_description, "https://i.natgeofe.com/n/18b80fef-63f4-4423-8da0-d99ad9b614df/babylonian-oasis-artist-rendering.jpg"),
    THE_TEMPLE_OF_ARTEMIS(LatLng(37.949668894238485, 27.36392057253303), R.string.the_temple_of_artemis, R.string.the_temple_of_artemis_description, "https://drivethruhistory.com/wp-content/uploads/2018/10/3_Temple-of-Artemis-A11.jpg"),
    MAUSOLEUM_HALICARNASSUS(LatLng(37.038058662866646, 27.42410566937252), R.string.mausoleum_at_halicarnassus, R.string.mausoleum_at_halicarnassus_description, "https://wilstar.com/wp-content/uploads/2017/07/mausoleum-1.jpg"),
    COLOSSUS_OF_RHODES(LatLng(36.45114258824363, 28.22582485586854), R.string.colossus_of_rhodes, R.string.colossus_of_rhodes_description, "https://gemtravel.gr/wp-content/uploads/2017/02/colossusofrhodes.jpg"),
    LIGHTHOUSE_OF_ALEXANDRIA(LatLng(31.214423294920753, 29.891364913457224), R.string.lighthouse_of_alexandria, R.string.lighthouse_of_alexandria_description, "https://www.konnecthq.com/wp-content/uploads/2019/07/Lighthouse-of-Alexandria-31-12-1.jpg");
}

