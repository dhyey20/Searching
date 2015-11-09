/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhyey
 */
public class Node {
    String label;
    Boolean visited;
    double longitude;
    double latitude;
    public Node(String lab,double longi,double latit){
        this.label=lab;
        this.visited=false;
        this.longitude=longi;
        this.latitude=latit;
}
    
}
