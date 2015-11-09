/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbshah3 Dhyey Shah
 */
public class City{
    String city;
    double latitude;
    double longitude;
    boolean visited=false;
    City Parent=null;
    double costFromStart=0;
    double totalCost;
    double heuristicCost=0;
    
    public City(String c, double lati, double longi){
        this.city=c;
        this.latitude=lati;
        this.longitude=longi;
        this.totalCost=costFromStart + heuristicCost;
    }
    
    public void settotalCost(){
        this.totalCost=this.costFromStart + this.heuristicCost;
    }
    
}
