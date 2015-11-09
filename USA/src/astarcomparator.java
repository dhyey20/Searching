
import java.util.Comparator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbshah3  Dhyey Shah
 */
class astarcomparator implements Comparator<City> {

    public astarcomparator() {
    }

   @Override
    public int compare(City a,City b){
        double costa=a.totalCost;
        double costb=b.totalCost;
        double diff= costa-costb;
        return (diff>0)?1:(diff<0)?-1:0;      
    }
    
}
