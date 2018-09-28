package com.example.android.chicagotourapp;

import java.util.ArrayList;

public class LocationArrays extends ArrayList {
    private ArrayList<CategoryClass> foodLocations = new ArrayList<>();

    public ArrayList getFoodList() {
        foodLocations.add(new CategoryClass("Giordanos",
                "Known for deep-dish pizza, this casual chain serves other classic " +
                        "Italian food, plus beer & wine.",
                "1(312) 842-1100",
                "1340 S Michigan Ave, Chicago, IL 60605",
                // Picture credit to Vegaseater.com URL: http://bit.ly/2xH8LXA
                // Direct image URL: http://bit.ly/2N4G5N0
                R.drawable.giordanos));
        foodLocations.add(new CategoryClass("Jim's Original",
                "Old-school 24/7 hotdog stand (started in 1939) " +
                        "boasting the original Maxwell Street Polish sausage.",
                "1(312) 733-7820",
                "1250 S Union Ave, Chicago, IL 60607",
                // Picture credit to Wikipedia URL: http://bit.ly/2xFeAor
                // Direct image URL: http://bit.ly/2DzUa5H
                R.drawable.jims_original));
        foodLocations.add(new CategoryClass("Portillo's Hot Dogs",
                "Chicago-born chain for hot dogs, Italian beef sandwiches & more, " +
                        "plus beer & wine, in retro digs.",
                "1(708) 458-7000",
                "5532 S Harlem Ave, Summit, IL 60501",
                // Picture credit to WGLT.org URL: http://bit.ly/2OaHK8n
                // Direct image URL: http://bit.ly/2DuQ2DM
                R.drawable.portillos));
        foodLocations.add(new CategoryClass("The Burger Point",
                "All-natural burgers, wings & chili with gourmet garnishes ordered " +
                        "via iPads & made while you wait.",
                "1(312) 842-1900",
                "1900 S State St, Chicago, IL 60616",
                // Picture credit to thrillist.com URL: http://bit.ly/2xNSY8k
                // Direct image URL: http://bit.ly/2R20LZc
                R.drawable.burger_point));
        foodLocations.add(new CategoryClass("Martinez SuperMarket",
                "Simple corner grocery store with butcher & selection of produce, " +
                        "emphasizing Mexican food items.",
                "1(773) 254-4048",
                "3301 S Morgan St, Chicago, IL 60608",
                // Picture credit to southsideweekly.com URL: http://bit.ly/2NM3Xdx
                // Direct image URL: http://bit.ly/2OT6M97
                R.drawable.martinez_supermarket));

        return foodLocations;
    }

    private ArrayList<CategoryClass> museumLocations = new ArrayList<>();

    public ArrayList getMuseumsList() {
        museumLocations.add(new CategoryClass("Art Institute of Chicago",
                "The Art Institute of Chicago, founded in 1879 and located in " +
                        "Chicago's Grant Park, is one of the oldest and largest art museums " +
                        "in the United States.",
                "1(312) 443-3600",
                "111 S Michigan Ave, Chicago, IL 60603",
                // Picture credit to Timeout.com URL: http://bit.ly/2xRBd8s
                //Direct image URL: http://bit.ly/2OS7hjD
                R.drawable.art_institute_of_chicago));
        museumLocations.add(new CategoryClass("Science and Industry",
                "The Museum of Science and Industry is located in Chicago, Illinois," +
                        " in Jackson Park, in the Hyde Park neighborhood between Lake Michigan and " +
                        "The University of Chicago.",
                "1(773) 684-1414",
                "5700 S Lake Shore Dr, Chicago, IL 60637",
                // Picture credit to Timeout.com URL: http://bit.ly/2DyWrxU
                // Direct image URL: http://bit.ly/2DuQUZ4
                R.drawable.museum_of_science_and_industry));
        museumLocations.add(new CategoryClass("Contemporary Art Museum",
                "The Museum of Contemporary Art Chicago is a contemporary art museum " +
                        "which was established in 1967 is one of the world's " +
                        "largest contemporary art venues.",
                "1(312) 280-2660",
                "220 E Chicago Ave, Chicago, IL 60611",
                // Picture credit to Timeout.com URL: http://bit.ly/2QdjEY2
                // Direct image URL: http://bit.ly/2xDKuBC
                R.drawable.museum_of_contemporary_art));
        museumLocations.add(new CategoryClass("The Field Museum",
                "The Field Museum of Natural History is one of the largest " +
                        "such museums in the world.",
                "1(312) 922-9410",
                "1400 S Lake Shore Dr, Chicago, IL 60605",
                // Picture credit to Timeout.com URL: http://bit.ly/2NHlKlX
                // Direct image URL: http://bit.ly/2IloKOS
                R.drawable.the_field_museum));
        museumLocations.add(new CategoryClass("Mexican Fine Art Museum",
                "Some 5,000 paintings, photographs, sculptures & more highlight" +
                        " this art museum, with free entry.",
                "1(312) 738-1503",
                "1852 W 19th St, Chicago, IL 60608",
                // Picture credit to Timeout.com URL: http://bit.ly/2DxUQs7
                // Direct image URL: http://bit.ly/2DyGQ1m
                R.drawable.national_museum_of_mexican_art));

        return museumLocations;
    }

    private ArrayList<CategoryClass> sportLocations = new ArrayList<>();

    public ArrayList getSportsList() {
        sportLocations.add(new CategoryClass("Chicago Bulls",
        "The United Center is home to both the Chicago Bulls of the " +
                "National Basketball Association and the Chicago Blackhawks " +
                "of the National Hockey League.",
                "1(312) 455-4500",
                "1901 W Madison St, Chicago, IL 60612",
                // Picture credit to SportsIllustrated URL: https://on.si.com/2R2NLm8
                // Direct image URL: http://bit.ly/2DA1j5Y
                R.drawable.united_center_bulls));
        sportLocations.add(new CategoryClass("Chicago Cubs",
                "Wrigley Field is a baseball park located on the North Side " +
                        "of Chicago, Illinois. It is the home of the Chicago Cubs," +
                        " one of the city's two Major League Baseball franchises.",
                "1(773) 404-2827",
                "1060 W Addison St, Chicago, IL 60613",
                // Picture credit to Parade.com URL: http://bit.ly/2IlZGr9
                // Direct image URL: http://bit.ly/2N5QTu3
                R.drawable.wrigley_field));
        sportLocations.add(new CategoryClass("Chicago Fire",
                "Toyota Park is a soccer-specific stadium about twelve miles " +
                        "southwest of downtown Chicago. It is the home of the Chicago" +
                        "Fire",
                "1(708) 594-7200",
                "7000 S Harlem Ave, Bridgeview, IL 60455",
                // Picture credit to wikipedia.com URL: https://en.wikipedia.org/wiki/Toyota_Park
                // Direct image URL: http://bit.ly/2xFfAZo
                R.drawable.toyota_park));
        sportLocations.add(new CategoryClass("Chicago White Sox",
                "Guaranteed Rate Field is a baseball park located in Chicago," +
                        " Illinois, that serves as the home ballpark for the Chicago " +
                        "White Sox of Major League Baseball.",
                "1(312) 674-1000",
                "333 W 35th St, Chicago, IL 60616",
                // Picture credit to chicago.curbed.com URL: http://bit.ly/2NIO2ws
                // Direct image URL: http://bit.ly/2QWojyF
                R.drawable.guaranteed_rate_field));
        sportLocations.add(new CategoryClass("Chicago Blackhawks",
                "The United Center is home to both the Chicago Bulls of the " +
                        "National Basketball Association and the Chicago Blackhawks " +
                        "of the National Hockey League.",
                "1(312) 455-4500",
                "1901 W Madison St, Chicago, IL 60612",
                // Picture credit to NHL.com URL: https://atnhl.com/2N2Xs0A
                // Direct image URL: https://bit.ly/2DzRcOB
                R.drawable.united_center_blackhawks));

        return sportLocations;
    }

    private ArrayList<CategoryClass> breweryLocations = new ArrayList<>();

    public ArrayList getBreweryLocations() {
        breweryLocations.add(new CategoryClass("Lagunitas Brewery",
                "Lively taproom offering beer tastings, snacks, a " +
                        "retail store & regular live music.",
                "1(773) 522-1308",
                "2607 W 17th St, Chicago, IL 60608",
                // Picture credit to openhousechicago.org URL: http://bit.ly/2zwpo9J
                // Direct image URL: https://bit.ly/2xRA2Wp
                R.drawable.lagunitas));
        breweryLocations.add(new CategoryClass("5 Rabbit Brewery",
                "Latin American microbrewery with a cozy tasting room " +
                        "featuring a rotating selection of house beers.",
                "1(312) 895-9591",
                "6398 74th St, Bedford Park, IL 60638",
                // Picture credit to hiplatina.com URL: http://bit.ly/2N5F2MP
                // Direct image URL: http://bit.ly/2xDFBsg
                R.drawable.rabbit_brewery));
        breweryLocations.add(new CategoryClass("Moody Tongue Brewery",
                "Exotic beers are offered along with oysters & cake at this " +
                        "brewery tasting room with a fireplace.",
                "1(312) 600-5111",
                "2136 S Peoria St, Chicago, IL 60608",
                // Picture credit to chicago.eater.com URL: http://bit.ly/2OecwNG
                // Direct image URL: http://bit.ly/2NHhmDv
                R.drawable.moody_tongue));
        breweryLocations.add(new CategoryClass("On Tour Brewery",
                "Warehouselike microbrewery tasting room pouring house " +
                        "beers & offering canned beers to go.",
                "1(312) 796-3119",
                "1725 W Hubbard St, Chicago, IL 60622",
                // Picture credit to chicago.eater.com URL: http://bit.ly/2xVD5wC
                // Direct image URL: http://bit.ly/2DxiV2n
                R.drawable.on_tour));
        breweryLocations.add(new CategoryClass("Goose Island Brewery",
                "Goose Island Brewery is a brewery in Chicago, Illinois, that " +
                        "began as a single brewpub opened in 1988 in Lincoln Park, " +
                        "Chicago, and named after a nearby island.",
                "1(800) 466-7363",
                "1800 W Fulton St, Chicago, IL 60612",
                // Picture credit to gooseisland.com URL: https://www.gooseisland.com/
                // Direct image URL: http://bit.ly/2R1aaAf
                R.drawable.goose_island));

        return breweryLocations;
    }
}
