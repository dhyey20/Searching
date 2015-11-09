
import java.util.Comparator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbshah3  Dhyey Shah
 */
class uniformcomparator implements Comparator<City> {

    public uniformcomparator() {
    }

    @Override
    public int compare(City a,City b){
        double costa=a.costFromStart;
        double costb=b.costFromStart;
        double diff= costa-costb;
        return (diff>0)?1:(diff<0)?-1:0;      
    }
    
    
}
