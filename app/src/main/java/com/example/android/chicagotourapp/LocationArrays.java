package com.example.android.chicagotourapp;

import java.util.ArrayList;

// All descriptions are thanks to Google.com
// After you search a location, you will find a quick
// description. This description was used in this app.

public class LocationArrays extends ArrayList {

    // Was able to get this done with the help of this link http://bit.ly/2y2OVFm
    //

    // Food
    // Giordanos Strings
    private String gioName = MyApp.getContext().getResources().getString(R.string.giordanos_name);
    private String gioDescription = MyApp.getContext().getResources().getString(R.string.giordanos_description);
    private String gioPhone = MyApp.getContext().getResources().getString(R.string.giordanos_phone);
    private String gioAddress = MyApp.getContext().getResources().getString(R.string.giordanos_address);
    // Picture credit to Vegaseater.com URL: http://bit.ly/2xH8LXA
    // Direct image URL: http://bit.ly/2N4G5N0
    private int gioImage = R.drawable.giordanos;
    // Jims Srtings
    private String jimName = MyApp.getContext().getResources().getString(R.string.jims_name);
    private String jimDescription = MyApp.getContext().getResources().getString(R.string.jims_description);
    private String jimPhone = MyApp.getContext().getResources().getString(R.string.jims_phone);
    private String jimAddress = MyApp.getContext().getResources().getString(R.string.jims_address);
    // Picture credit to Wikipedia URL: http://bit.ly/2xFeAor
    // Direct image URL: http://bit.ly/2DzUa5H
    private int jimImage = R.drawable.jims_original;
    // Portillos Strings
    private String porName= MyApp.getContext().getResources().getString(R.string.portillos_name);
    private String porDescription= MyApp.getContext().getResources().getString(R.string.portillos_description);
    private String porPhone= MyApp.getContext().getResources().getString(R.string.portillos_phone);
    private String porAddress= MyApp.getContext().getResources().getString(R.string.portillos_address);
    // Picture credit to WGLT.org URL: http://bit.ly/2OaHK8n
    // Direct image URL: http://bit.ly/2DuQ2DM
    private int porImage = R.drawable.portillos;
    // Burger Point Strings
    private String burName= MyApp.getContext().getResources().getString(R.string.burger_point_name);
    private String burDescription = MyApp.getContext().getResources().getString(R.string.burger_point_description);
    private String burPhone= MyApp.getContext().getResources().getString(R.string.burger_point_phone);
    private String burAddress= MyApp.getContext().getResources().getString(R.string.burger_point_address);
    // Picture credit to thrillist.com URL: http://bit.ly/2xNSY8k
    // Direct image URL: http://bit.ly/2R20LZc
    private int burImage = R.drawable.burger_point;
    // Martinez Strings
    private String marName = MyApp.getContext().getResources().getString(R.string.martinez_supermarket_name);
    private String marDescription = MyApp.getContext().getResources().getString(R.string.martinez_supermarket_description);
    private String marPhone = MyApp.getContext().getResources().getString(R.string.martinez_supermarket_phone);
    private String marAddress = MyApp.getContext().getResources().getString(R.string.martinez_supermarket_address);
    // Picture credit to southsideweekly.com URL: http://bit.ly/2NM3Xdx
    // Direct image URL: http://bit.ly/2OT6M97
    private int marImage = R.drawable.martinez_supermarket;

    // Museums
    // Art Institute Strings
    private String artName = MyApp.getContext().getResources().getString(R.string.art_institute_name);
    private String artDescription = MyApp.getContext().getResources().getString(R.string.art_institute_description);
    private String artPhone = MyApp.getContext().getResources().getString(R.string.art_institute_phone);
    private String artAddress = MyApp.getContext().getResources().getString(R.string.art_institute_address);
    private int artImage = R.drawable.art_institute_of_chicago;
    // Picture credit to Timeout.com URL: http://bit.ly/2xRBd8s
    //Direct image URL: http://bit.ly/2OS7hjD
    // Science and Industry Strings
    private String sciName = MyApp.getContext().getResources().getString(R.string.science_and_industry_name);
    private String sciDescription = MyApp.getContext().getResources().getString(R.string.science_and_industry_description);
    private String sciPhone = MyApp.getContext().getResources().getString(R.string.science_and_industry_phone);
    private String sciAddress = MyApp.getContext().getResources().getString(R.string.science_and_industry_address);
    private int sciImage = R.drawable.museum_of_science_and_industry;
    // Picture credit to Timeout.com URL: http://bit.ly/2DyWrxU
    // Direct image URL: http://bit.ly/2DuQUZ4
    // Contemporary Strings
    private String conName = MyApp.getContext().getResources().getString(R.string.contemporary_art_name);
    private String conDescription = MyApp.getContext().getResources().getString(R.string.contemporary_art_description);
    private String conPhone = MyApp.getContext().getResources().getString(R.string.contemporary_art_phone);
    private String conAddress = MyApp.getContext().getResources().getString(R.string.contemporary_art_address);
    // Picture credit to Timeout.com URL: http://bit.ly/2QdjEY2
    // Direct image URL: http://bit.ly/2xDKuBC
    private int conImage = R.drawable.museum_of_contemporary_art;
    // Field Museum Strings
    private String fieName = MyApp.getContext().getResources().getString(R.string.the_field_museum_name);
    private String fieDescription = MyApp.getContext().getResources().getString(R.string.the_field_museum_description);
    private String fiePhone = MyApp.getContext().getResources().getString(R.string.the_field_museum_phone);
    private String fieAddress = MyApp.getContext().getResources().getString(R.string.the_field_museum_address);
    // Picture credit to Timeout.com URL: http://bit.ly/2NHlKlX
    // Direct image URL: http://bit.ly/2IloKOS
    private int fieImage = R.drawable.the_field_museum;
    // Mexican Fine Arts Strings
    private String mexName = MyApp.getContext().getResources().getString(R.string.mexican_fine_arts_name);
    private String mexDescription = MyApp.getContext().getResources().getString(R.string.mexican_fine_arts_description);
    private String mexPhone = MyApp.getContext().getResources().getString(R.string.mexican_fine_arts_phone);
    private String mexAddress = MyApp.getContext().getResources().getString(R.string.mexican_fine_arts_address);
    // Picture credit to Timeout.com URL: http://bit.ly/2DxUQs7
    // Direct image URL: http://bit.ly/2DyGQ1m
    private int mexImage = R.drawable.national_museum_of_mexican_art;

    // Sports
    // Chicago Bulls Strings
    private String bulName = MyApp.getContext().getResources().getString(R.string.bulls_name);
    private String bulDescription = MyApp.getContext().getResources().getString(R.string.bulls_description);
    private String bulPhone = MyApp.getContext().getResources().getString(R.string.bulls_phone);
    private String bulAddress = MyApp.getContext().getResources().getString(R.string.bulls_address);
    // Picture credit to SportsIllustrated URL: https://on.si.com/2R2NLm8
    // Direct image URL: http://bit.ly/2DA1j5Y
    private int bulImage = R.drawable.united_center_bulls;
    // Chicago Cubs Strings
    private String cubName = MyApp.getContext().getResources().getString(R.string.cubs_name);
    private String cubDescription = MyApp.getContext().getResources().getString(R.string.cubs_description);
    private String cubPhone = MyApp.getContext().getResources().getString(R.string.cubs_phone);
    private String cubAddress = MyApp.getContext().getResources().getString(R.string.cubs_address);
    // Picture credit to Parade.com URL: http://bit.ly/2IlZGr9
    // Direct image URL: http://bit.ly/2N5QTu3
    private int cubImage = R.drawable.wrigley_field;
    // Chicago Fire Strings
    private String firName = MyApp.getContext().getResources().getString(R.string.fire_name);
    private String firDescription = MyApp.getContext().getResources().getString(R.string.fire_description);
    private String firPhone = MyApp.getContext().getResources().getString(R.string.fire_phone);
    private String firAddress = MyApp.getContext().getResources().getString(R.string.fire_address);
    // Picture credit to wikipedia.com URL: https://en.wikipedia.org/wiki/Toyota_Park
    // Direct image URL: http://bit.ly/2xFfAZo
    private int firImage = R.drawable.toyota_park;
    // Chicago White Sox Strings
    private String soxName = MyApp.getContext().getResources().getString(R.string.white_sox_name);
    private String soxDescription = MyApp.getContext().getResources().getString(R.string.white_sox_description);
    private String soxPhone = MyApp.getContext().getResources().getString(R.string.white_sox_phone);
    private String soxAddress = MyApp.getContext().getResources().getString(R.string.white_sox_address);
    // Picture credit to chicago.curbed.com URL: http://bit.ly/2NIO2ws
    // Direct image URL: http://bit.ly/2QWojyF
    private int soxImage = R.drawable.guaranteed_rate_field;
    // Blackhawks Strings
    private String blaName = MyApp.getContext().getResources().getString(R.string.blackhawks_name);
    private String blaDescription = MyApp.getContext().getResources().getString(R.string.blackhawks_description);
    private String blaPhone = MyApp.getContext().getResources().getString(R.string.blackhawks_phone);
    private String blaAddress = MyApp.getContext().getResources().getString(R.string.blackhawks_address);
    // Picture credit to NHL.com URL: https://atnhl.com/2N2Xs0A
    // Direct image URL: https://bit.ly/2DzRcOB
    private int blaImage = R.drawable.united_center_blackhawks;

    // Lagunitas Strings
    private String lagName = MyApp.getContext().getResources().getString(R.string.lagunitas_name);
    private String lagDescription = MyApp.getContext().getResources().getString(R.string.lagunitas_description);
    private String lagPhone = MyApp.getContext().getResources().getString(R.string.lagunitas_phone);
    private String lagAddress = MyApp.getContext().getResources().getString(R.string.lagunitas_address);
    // Picture credit to openhousechicago.org URL: http://bit.ly/2zwpo9J
    // Direct image URL: https://bit.ly/2xRA2Wp
    private int lagImage = R.drawable.lagunitas;
    // 5 Rabbit Strings
    private String rabName = MyApp.getContext().getResources().getString(R.string.five_rabbit_name);
    private String rabDescription = MyApp.getContext().getResources().getString(R.string.five_rabbit_description);
    private String rabPhone = MyApp.getContext().getResources().getString(R.string.five_rabbit_phone);
    private String rabAddress = MyApp.getContext().getResources().getString(R.string.five_rabbit_address);
    // Picture credit to hiplatina.com URL: http://bit.ly/2N5F2MP
    // Direct image URL: http://bit.ly/2xDFBsg
    private int rabImage = R.drawable.rabbit_brewery;
    // Moody tongue Strings
    private String mooName = MyApp.getContext().getResources().getString(R.string.moody_tongue_name);
    private String mooDescription = MyApp.getContext().getResources().getString(R.string.moody_tongue_description);
    private String mooPhone = MyApp.getContext().getResources().getString(R.string.moody_tongue_phone);
    private String mooAddress = MyApp.getContext().getResources().getString(R.string.moody_tongue_address);
    // Picture credit to chicago.eater.com URL: http://bit.ly/2OecwNG
    // Direct image URL: http://bit.ly/2NHhmDv
    private int mooImage = R.drawable.moody_tongue;
    // On Tour Strings
    private String touName = MyApp.getContext().getResources().getString(R.string.on_tour_name);
    private String touDescription = MyApp.getContext().getResources().getString(R.string.on_tour_description);
    private String touPhone = MyApp.getContext().getResources().getString(R.string.on_tour_phone);
    private String touAddress = MyApp.getContext().getResources().getString(R.string.on_tour_address);
    // Picture credit to chicago.eater.com URL: http://bit.ly/2xVD5wC
    // Direct image URL: http://bit.ly/2DxiV2n
    private int touImage = R.drawable.on_tour;
    // Goose Island Strings
    private String gooName = MyApp.getContext().getResources().getString(R.string.goose_island_name);
    private String gooDescription = MyApp.getContext().getResources().getString(R.string.goose_island_description);
    private String gooPhone = MyApp.getContext().getResources().getString(R.string.goose_island_phone);
    private String gooAddress = MyApp.getContext().getResources().getString(R.string.goose_island_address);
    // Picture credit to gooseisland.com URL: https://www.gooseisland.com/
    // Direct image URL: http://bit.ly/2R1aaAf
    private int gooImage = R.drawable.goose_island;


    private ArrayList<CategoryClass> foodLocations = new ArrayList<>();
    public ArrayList getFoodList() {
        foodLocations.add(new CategoryClass(gioName, gioDescription, gioPhone, gioAddress, gioImage));
        foodLocations.add(new CategoryClass(jimName, jimDescription, jimPhone, jimAddress, jimImage));
        foodLocations.add(new CategoryClass(porName, porDescription, porPhone, porAddress, porImage));
        foodLocations.add(new CategoryClass(burName, burDescription, burPhone, burAddress, burImage));
        foodLocations.add(new CategoryClass(marName, marDescription, marPhone, marAddress, marImage));

        return foodLocations;
    }

    private ArrayList<CategoryClass> museumLocations = new ArrayList<>();
    public ArrayList getMuseumsList() {
        museumLocations.add(new CategoryClass(artName, artDescription, artPhone, artAddress, artImage));
        museumLocations.add(new CategoryClass(sciName, sciDescription, sciPhone, sciAddress, sciImage));
        museumLocations.add(new CategoryClass(conName, conDescription, conPhone, conAddress, conImage));
        museumLocations.add(new CategoryClass(fieName, fieDescription, fiePhone, fieAddress, fieImage));
        museumLocations.add(new CategoryClass(mexName, mexDescription, mexPhone, mexAddress, mexImage));

        return museumLocations;
    }

    private ArrayList<CategoryClass> sportLocations = new ArrayList<>();
    public ArrayList getSportsList() {
        sportLocations.add(new CategoryClass(bulName, bulDescription, bulPhone, bulAddress, bulImage));
        sportLocations.add(new CategoryClass(cubName, cubDescription, cubPhone, cubAddress, cubImage));
        sportLocations.add(new CategoryClass(firName, firDescription, firPhone, firAddress, firImage));
        sportLocations.add(new CategoryClass(soxName, soxDescription, soxPhone, soxAddress, soxImage));
        sportLocations.add(new CategoryClass(blaName, blaDescription, blaPhone, blaAddress, blaImage));

        return sportLocations;
    }

    private ArrayList<CategoryClass> breweryLocations = new ArrayList<>();
    public ArrayList getBreweryLocations() {
        breweryLocations.add(new CategoryClass(lagName, lagDescription, lagPhone, lagAddress, lagImage));
        breweryLocations.add(new CategoryClass(rabName, rabDescription, rabPhone, rabAddress, rabImage));
        breweryLocations.add(new CategoryClass(mooName, mooDescription, mooPhone, mooAddress, mooImage));
        breweryLocations.add(new CategoryClass(touName, touDescription, touPhone, touAddress, touImage));
        breweryLocations.add(new CategoryClass(gooName, gooDescription, gooPhone, gooAddress, gooImage));

        return breweryLocations;
    }
}
