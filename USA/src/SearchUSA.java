
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbshah3  Dhyey Shah
 */
public class SearchUSA {
    public static void main(String args[]){
        if(args.length!=3){
            System.out.println("Please enter the arguments correctly.");
        }
        else{
            String searchtype=args[0];
            String source=args[1];
            String destination=args[2];
    
String searchType;
USAMap u=new USAMap();
City  albanyGA=new City("albanyGA",        31.58,  84.17);     
u.addCity(albanyGA);
City  albanyNY=new City("albanyNY",        42.66,  73.78);     u.addCity(albanyNY);
City  albuquerque=new City("albuquerque",     35.11, 106.61);     u.addCity(albuquerque);
City  atlanta=new City("atlanta",         33.76,  84.40);     u.addCity(atlanta);
City  augusta=new City("augusta",         33.43,  82.02);     u.addCity(augusta);
City  austin=new City("austin",          30.30,  97.75);     u.addCity(austin);
City  bakersfield=new City("bakersfield",     35.36, 119.03);     u.addCity(bakersfield);
City  baltimore=new City("baltimore",       39.31,  76.62);     u.addCity(baltimore);
City  batonRouge=new City("batonRouge",      30.46,  91.14);     u.addCity(batonRouge);
City  beaumont=new City("beaumont",        30.08,  94.13);     u.addCity(beaumont);
City  boise=new City("boise",           43.61, 116.24);     u.addCity(boise);
City  boston=new City("boston",          42.32,  71.09);     u.addCity(boston);
City  buffalo=new City("buffalo",         42.90,  78.85);     u.addCity(buffalo);
City  calgary=new City("calgary",         51.00, 114.00);     u.addCity(calgary);
City  charlotte=new City("charlotte",       35.21,  80.83);     u.addCity(charlotte);
City  chattanooga=new City("chattanooga",     35.05,  85.27);     u.addCity(chattanooga);
City  chicago=new City("chicago",         41.84,  87.68);     u.addCity(chicago);
City  cincinnati=new City("cincinnati",      39.14,  84.50);     u.addCity(cincinnati);
City  cleveland=new City("cleveland",       41.48,  81.67);     u.addCity(cleveland);
City  coloradoSprings=new City("coloradoSprings", 38.86, 104.79);     u.addCity(coloradoSprings);
City  columbus=new City("columbus",        39.99,  82.99);     u.addCity(columbus);
City  dallas=new City("dallas",          32.80,  96.79);     u.addCity(dallas);
City  dayton=new City("dayton",          39.76,  84.20);     u.addCity(dayton);
City  daytonaBeach=new City("daytonaBeach",    29.21,  81.04);     u.addCity(daytonaBeach);
City  denver=new City("denver",          39.73, 104.97);     u.addCity(denver);
City  desMoines=new City("desMoines",       41.59,  93.62);     u.addCity(desMoines);
City  elPaso=new City("elPaso",          31.79, 106.42);     u.addCity(elPaso);
City  eugene=new City("eugene",          44.06, 123.11);     u.addCity(eugene);
City  europe=new City("europe",          48.87,  -2.33);     u.addCity(europe);
City ftWorth =new City("ftWorth",         32.74,  97.33);     u.addCity(ftWorth);
City  fresno=new City("fresno",          36.78, 119.79);     u.addCity(fresno);
City  grandJunction=new City("grandJunction",   39.08, 108.56);     u.addCity(grandJunction);
City  greenBay=new City("greenBay",        44.51,  88.02);     u.addCity(greenBay);
City  greensboro=new City("greensboro",      36.08,  79.82);     u.addCity(greensboro);
City  houston=new City("houston",         29.76,  95.38);     u.addCity(houston);
City  indianapolis=new City("indianapolis",    39.79,  86.15);     u.addCity(indianapolis);
City  jacksonville=new City("jacksonville",    30.32,  81.66);     u.addCity(jacksonville);
City  japan=new City("japan",           35.68, 220.23);     u.addCity(japan);
City  kansasCity=new City("kansasCity",      39.08,  94.56);     u.addCity(kansasCity);
City  keyWest=new City("keyWest",         24.56,  81.78);     u.addCity(keyWest);
City  lafayette=new City("lafayette",       30.21,  92.03);     u.addCity(lafayette);
City  lakeCity=new City("lakeCity",        30.19,  82.64);     u.addCity(lakeCity);
City  laredo=new City("laredo",          27.52,  99.49);     u.addCity(laredo);
City  lasVegas=new City("lasVegas",        36.19, 115.22);     u.addCity(lasVegas);
City  lincoln=new City("lincoln",         40.81,  96.68);     u.addCity(lincoln);
City  littleRock=new City("littleRock",      34.74,  92.33);     u.addCity(littleRock);
City  losAngeles=new City("losAngeles",      34.03, 118.17);     u.addCity(losAngeles);
City  macon=new City("macon",           32.83,  83.65);     u.addCity(macon);
City  medford=new City("medford",         42.33, 122.86);     u.addCity(medford);
City  memphis=new City("memphis",         35.12,  89.97);     u.addCity(memphis);
City  mexia=new City("mexia",           31.68,  96.48);     u.addCity(mexia);
City  mexico=new City("mexico",          19.40,  99.12);     u.addCity(mexico);
City  miami=new City("miami",           25.79,  80.22);     u.addCity(miami);
City  midland=new City("midland",         43.62,  84.23);     u.addCity(midland);
City  milwaukee=new City("milwaukee",       43.05,  87.96);     u.addCity(milwaukee);
City  minneapolis=new City("minneapolis",     44.96,  93.27);     u.addCity(minneapolis);
City  modesto=new City("modesto",         37.66, 120.99);     u.addCity(modesto);
City  montreal=new City("montreal",        45.50,  73.67);     u.addCity(montreal);
City  nashville=new City("nashville",       36.15,  86.76);     u.addCity(nashville);
City  newHaven=new City("newHaven",        41.31,  72.92);     u.addCity(newHaven);
City  newOrleans=new City("newOrleans",      29.97,  90.06);     u.addCity(newOrleans);
City  newYork=new City("newYork",         40.70,  73.92);     u.addCity(newYork);
City  norfolk=new City("norfolk",         36.89,  76.26);     u.addCity(norfolk);
City  oakland=new City("oakland",         37.80, 122.23);     u.addCity(oakland);
City  oklahomaCity=new City("oklahomaCity",    35.48,  97.53);     u.addCity(oklahomaCity);
City  omaha=new City("omaha",           41.26,  96.01);     u.addCity(omaha);
City  orlando=new City("orlando",         28.53,  81.38);     u.addCity(orlando);
City  ottawa=new City("ottawa",          45.42,  75.69);     u.addCity(ottawa);
City  pensacola=new City("pensacola",       30.44,  87.21);     u.addCity(pensacola);
City  philadelphia=new City("philadelphia",    40.72,  76.12);     u.addCity(philadelphia);
City  phoenix=new City("phoenix",         33.53, 112.08);     u.addCity(phoenix);
City  pittsburgh=new City("pittsburgh",      40.40,  79.84);     u.addCity(pittsburgh);
City  pointReyes=new City("pointReyes",      38.07, 122.81);     u.addCity(pointReyes);
City  portland=new City("portland",        45.52, 122.64);     u.addCity(portland);
City  providence=new City("providence",      41.80,  71.36);     u.addCity(providence);
City  provo=new City("provo",           40.24, 111.66);     u.addCity(provo);
City  raleigh=new City("raleigh",         35.82,  78.64);     u.addCity(raleigh);
City  redding=new City("redding",         40.58, 122.37);     u.addCity(redding);
City  reno=new City("reno",            39.53, 119.82);     u.addCity(reno);
City  richmond=new City("richmond",        37.54,  77.46);     u.addCity(richmond);
City  rochester=new City("rochester",       43.17,  77.61);     u.addCity(rochester);
City  sacramento=new City("sacramento",      38.56, 121.47);     u.addCity(sacramento);
City  salem=new City("salem",           44.93, 123.03);     u.addCity(salem);
City  salinas=new City("salinas",         36.68, 121.64);     u.addCity(salinas);
City  saltLakeCity=new City("saltLakeCity",    40.75, 111.89);     u.addCity(saltLakeCity);
City  sanAntonio=new City("sanAntonio",      29.45,  98.51);     u.addCity(sanAntonio);
City  sanDiego=new City("sanDiego",        32.78, 117.15);     u.addCity(sanDiego);
City  sanFrancisco=new City("sanFrancisco",    37.76, 122.44);     u.addCity(sanFrancisco);
City  sanJose=new City("sanJose",         37.30, 121.87);     u.addCity(sanJose);
City  sanLuisObispo=new City("sanLuisObispo",   35.27, 120.66);     u.addCity(sanLuisObispo);
City  santaFe=new City("santaFe",         35.67, 105.96);     u.addCity(santaFe);
City  saultSteMarie=new City("saultSteMarie",   46.49,  84.35);     u.addCity(saultSteMarie);
City  savannah=new City("savannah",        32.05,  81.10);     u.addCity(savannah);
City  seattle=new City("seattle",         47.63, 122.33);     u.addCity(seattle);
City  stLouis=new City("stLouis",         38.63,  90.24);     u.addCity(stLouis);
City  stamford=new City("stamford",        41.07,  73.54);     u.addCity(stamford);
City  stockton=new City("stockton",        37.98, 121.30);     u.addCity(stockton);
City  tallahassee=new City("tallahassee",     30.45,  84.27);     u.addCity(tallahassee);
City  tampa=new City("tampa",           27.97,  82.46);     u.addCity(tampa);
City  thunderBay=new City("thunderBay",      48.38,  89.25);     u.addCity(thunderBay);
City  toledo=new City("toledo",          41.67,  83.58);     u.addCity(toledo);
City  toronto=new City("toronto",         43.65,  79.38);     u.addCity(toronto);
City  tucson=new City("tucson",          32.21, 110.92);     u.addCity(tucson);
City  tulsa=new City("tulsa",           36.13,  95.94);     u.addCity(tulsa);
City  uk1=new City("uk1",             51.30,   0.00);     u.addCity(uk1);
City  uk2=new City("uk2",             51.30,   0.00);     u.addCity(uk2);
City  vancouver=new City("vancouver",       49.25, 123.10);     u.addCity(vancouver);
City  washington=new City("washington",      38.91,  77.01);     u.addCity(washington);
City  westPalmBeach=new City("westPalmBeach",   26.71,  80.05);     u.addCity(westPalmBeach);
City  wichita=new City("wichita",         37.69,  97.34);     u.addCity(wichita);
City  winnipeg=new City("winnipeg",        49.90,  97.13);     u.addCity(winnipeg);
City  yuma=new City("yuma",            32.69, 114.62);     u.addCity(yuma);


        u.addRoad(albanyNY, montreal, 226);
        u.addRoad(albanyNY, boston, 166);
        u.addRoad(albanyNY, rochester, 148);
        u.addRoad(albanyGA, tallahassee, 120);
        u.addRoad(albanyGA, macon, 106);
        u.addRoad(albuquerque, elPaso, 267);
        u.addRoad(albuquerque, santaFe, 61);
        u.addRoad(atlanta, macon, 82);
        u.addRoad(atlanta, chattanooga, 117);
        u.addRoad(augusta, charlotte, 161);
        u.addRoad(augusta, savannah, 131);
        u.addRoad(austin, houston, 186);
        u.addRoad(austin, sanAntonio, 79);
        u.addRoad(bakersfield, losAngeles, 112);
        u.addRoad(bakersfield, fresno, 107);
        u.addRoad(baltimore, philadelphia, 102);
        u.addRoad(baltimore, washington, 45);
        u.addRoad(batonRouge, lafayette, 50);
        u.addRoad(batonRouge, newOrleans, 80);
        u.addRoad(beaumont, houston, 69);
        u.addRoad(beaumont, lafayette, 122);
        u.addRoad(boise, saltLakeCity, 349);
        u.addRoad(boise, portland, 428);
        u.addRoad(boston, providence, 51);
        u.addRoad(buffalo, toronto, 105);
        u.addRoad(buffalo, rochester, 64);
        u.addRoad(buffalo, cleveland, 191);
        u.addRoad(buffalo, toronto, 105);
        u.addRoad(buffalo, rochester, 164);
        u.addRoad(buffalo, cleveland, 191);
        u.addRoad(calgary, vancouver, 605);
        u.addRoad(calgary, winnipeg, 829);
        u.addRoad(charlotte, greensboro, 91);
        u.addRoad(chattanooga, nashville, 129);
        u.addRoad(chicago, milwaukee, 90);
        u.addRoad(chicago, midland, 279);
        u.addRoad(cincinnati, indianapolis, 110);
        u.addRoad(cincinnati, dayton, 56);
        u.addRoad(cleveland, pittsburgh, 157);
        u.addRoad(cleveland, columbus, 142);
        u.addRoad(coloradoSprings, denver, 70);
        u.addRoad(coloradoSprings, santaFe, 316);
        u.addRoad(columbus, dayton, 72);
        u.addRoad(dallas, denver, 792);
        u.addRoad(dallas, mexia, 83);
        u.addRoad(daytonaBeach, jacksonville, 92);
        u.addRoad(daytonaBeach, orlando, 54);
        u.addRoad(denver, wichita, 523);
        u.addRoad(denver, grandJunction, 246);
        u.addRoad(desMoines, omaha, 135);
        u.addRoad(desMoines, minneapolis, 246);
        u.addRoad(elPaso, sanAntonio, 580);
        u.addRoad(elPaso, tucson, 320);
        u.addRoad(eugene, salem, 63);
        u.addRoad(eugene, medford, 165);
        u.addRoad(europe, philadelphia, 3939);
        u.addRoad(ftWorth, oklahomaCity, 209);
        u.addRoad(fresno, modesto, 109);
        u.addRoad(grandJunction, provo, 220);
        u.addRoad(greenBay, minneapolis, 304);
        u.addRoad(greenBay, milwaukee, 117);
        u.addRoad(greensboro, raleigh, 74);
        u.addRoad(houston, mexia, 165);
        u.addRoad(indianapolis, stLouis, 246);
        u.addRoad(jacksonville, savannah, 140);
        u.addRoad(jacksonville, lakeCity, 113);
        u.addRoad(japan, pointReyes, 5131);
        u.addRoad(japan, sanLuisObispo, 5451);
        u.addRoad(kansasCity, tulsa, 249);
        u.addRoad(kansasCity, stLouis, 256); 
        u.addRoad(kansasCity, wichita, 190);
        u.addRoad(keyWest, tampa, 446);
        u.addRoad(lakeCity, tampa, 169);
        u.addRoad(lakeCity, tallahassee, 104);
        u.addRoad(laredo, sanAntonio, 154);
        u.addRoad(laredo, mexico, 741);
        u.addRoad(lasVegas, losAngeles, 275);
        u.addRoad(lasVegas, saltLakeCity, 486);
        u.addRoad(lincoln, wichita, 277);
        u.addRoad(lincoln, omaha, 58);
        u.addRoad(littleRock, memphis, 137);
        u.addRoad(littleRock, tulsa, 276);
        u.addRoad(losAngeles, sanDiego, 124);
        u.addRoad(losAngeles, sanLuisObispo, 182);
        u.addRoad(medford, redding, 150);
        u.addRoad(memphis, nashville, 210);
        u.addRoad(miami, westPalmBeach, 67);
        u.addRoad(midland, toledo, 82);
        u.addRoad(minneapolis, winnipeg, 463);
        u.addRoad(modesto, stockton, 29);
        u.addRoad(montreal, ottawa, 132);
        u.addRoad(newHaven, providence, 110);
        u.addRoad(newHaven, stamford, 92);
        u.addRoad(newOrleans, pensacola, 268);
        u.addRoad(newYork, philadelphia, 101);
        u.addRoad(norfolk, richmond, 92);
        u.addRoad(norfolk, raleigh, 174);
        u.addRoad(oakland, sanFrancisco, 8);
        u.addRoad(oakland, sanJose, 42);
        u.addRoad(oklahomaCity, tulsa, 105);
        u.addRoad(orlando, westPalmBeach, 168);
        u.addRoad(orlando, tampa, 84);
        u.addRoad(ottawa, toronto, 269);
        u.addRoad(pensacola, tallahassee, 120);
        u.addRoad(philadelphia, pittsburgh, 319);
        u.addRoad(philadelphia, newYork, 101);
        u.addRoad(philadelphia, uk1, 3548);
        u.addRoad(philadelphia, uk2, 3548);
        u.addRoad(phoenix, tucson, 117);
        u.addRoad(phoenix, yuma, 178);
        u.addRoad(pointReyes, redding, 215);
        u.addRoad(pointReyes, sacramento, 115);
        u.addRoad(portland, seattle, 174);
        u.addRoad(portland, salem, 47);
        u.addRoad(reno, saltLakeCity, 520);
        u.addRoad(reno, sacramento, 133);
        u.addRoad(richmond, washington, 105);
        u.addRoad(sacramento, sanFrancisco, 95);
        u.addRoad(sacramento, stockton, 51);
        u.addRoad(salinas, sanJose, 31);
        u.addRoad(salinas, sanLuisObispo, 137);
        u.addRoad(sanDiego, yuma, 172);
        u.addRoad(saultSteMarie, thunderBay, 442);
        u.addRoad(saultSteMarie, toronto, 436);
        u.addRoad(seattle, vancouver, 115);
        u.addRoad(thunderBay, winnipeg, 440);
        
        u.setStartCity(source);
        u.setGoalCity(destination);
        
        if( "astar".equals(searchtype))
        {
            List<City> answer=u.AStar();
            if(answer.size()==0){
                System.out.println("No Route Found.");
            }
            else{
                String ans=answer.get(0).city;
                double size;
                for(int i=1;i<answer.size();i++){
                    ans=ans+" , "+answer.get(i).city;
                }
                size=answer.get(answer.size()-1).costFromStart;
                System.out.println("Solution Path: "+ans);
                System.out.println("Number of nodes in solution:"+answer.size());
                System.out.println("Total Distance: "+size);
            }
        }//end astar
        
        if( "greedy".equals(searchtype)){
            List<City> answer1=u.Greedy();
            if(answer1.isEmpty()){
                System.out.println("No Route Found.");
            }
            else{
                String ans=answer1.get(0).city;
                double size;
                for(int i=1;i<answer1.size();i++){
                    ans=ans+" , "+answer1.get(i).city;
                }
                size=answer1.get(answer1.size()-1).costFromStart;
                System.out.println("Solution Path: "+ans);
                System.out.println("Number of nodes in solution:"+answer1.size());
                System.out.println("Total Distance: "+size);
            }
        }//end greedy
        
        if( "uniform".equals(searchtype)){
            List<City> answer1=u.Uniform();
            if(answer1.isEmpty()){
                System.out.println("No Route Found.");
            }
            else{
                String ans=answer1.get(0).city;
                double size;
                for(int i=1;i<answer1.size();i++){
                    ans=ans+" , "+answer1.get(i).city;
                }
                size=answer1.get(answer1.size()-1).costFromStart;
                System.out.println("Solution Path: "+ans);
                System.out.println("Number of nodes in solution:"+answer1.size());
                System.out.println("Total Distance: "+size);
            }
        }//end unifrom
    }
 }
}
