
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbshah3  Dhyey Shah
 */

public class USAMap{
    
    ArrayList cities=new ArrayList();
    double adjMatrix[][];
    City startcity;
    City goalcity;
    
    public void addCity(City c){
        cities.add(c);
    }
    
    public void addRoad(City a,City b,double distance){
        if(adjMatrix==null){
            int size=cities.size();
            adjMatrix= new double[size][size];
         
        }
        int aindex = cities.indexOf(a);
        int bindex = cities.indexOf(b);
        adjMatrix[aindex][bindex]=distance;
        adjMatrix[bindex][aindex]=distance;
    }
       
    public List getUnvisitedNeighbours(City c){
        int index = cities.indexOf(c);
        List neighbours = new ArrayList();
        for(int i=0;i<cities.size();i++){
            if(adjMatrix[index][i]>1){
                if(((City)cities.get(i)).visited==false){
                     neighbours.add((cities.get(i)));
                }
            }
        }
        return neighbours;
    }
    
    public void setStartCity(String s){
        for(int i=0;i<cities.size();i++){
            City temp=(City)cities.get(i);
            if(temp.city.equals(s)){
                this.startcity=temp;
            }
            
        }
    }
    public City getStartCity(){
        return this.startcity;
    }
    public void setGoalCity(String s){
        for(int i=0;i<cities.size();i++){
            City temp=(City)cities.get(i);
            if(temp.city.equals(s)){
                this.goalcity=temp;
            }
            
        }
    }
    public City getGoalCity(){
        return this.goalcity;
    }
    public void printCity(City c){
        System.out.println(c.city+"    ");
    }
    
    public double getHeuristic(City a){
        City b=goalcity;
        double h=Math.sqrt(Math.pow(69.5 * (a.latitude - b.latitude),2) + Math.pow(69.5 * Math.cos((a.latitude + b.latitude)/360 * Math.PI) * (a.longitude - b.longitude),2));
        return h;
    }
    
    public double getCost(City a,City b){
        int indexa=cities.indexOf(a);
        int indexb=cities.indexOf(b);
        return adjMatrix[indexa][indexb];
    }

    public List constructPath(City c) {
    LinkedList path = new LinkedList();
    while (c.Parent != null) {
      path.addFirst(c);
      c = c.Parent;
    }
    path.addFirst(c);
    return path;
  }

    public void printclosedList(List<City> l) {
        String s=l.get(0).city;
        for(int i=1;i<l.size();i++){
            s=s+" , "+l.get(i).city;
        }
        System.out.println("Expanded nodes: "+s);
        System.out.println("Number of expanded nodes:   "+l.size());
        
    }
  
    public List AStar(){
    
    Comparator<City> comparator0 = new astarcomparator();
    PriorityQueue<City> openList=new PriorityQueue(100,comparator0);
    LinkedList closedList = new LinkedList();
    String printclosedList="";
    startcity.costFromStart=0;
    startcity.heuristicCost=getHeuristic(startcity);
    startcity.Parent=null;
    startcity.visited=true;
    openList.add(startcity);
    
    while(!openList.isEmpty()){
        City temp=(City) openList.remove();
        closedList.add(temp);//added
        if(temp == goalcity){
            printclosedList(closedList);
            return constructPath(goalcity);
        }
        
        List neighbours=getUnvisitedNeighbours(temp);
        for(int i=0;i<neighbours.size();i++){
            City neighbour=(City) neighbours.get(i);
            boolean isOpen = openList.contains(neighbour);
            boolean isClosed =closedList.contains(neighbour);
            double costfromstart=temp.costFromStart+getCost(temp,neighbour);
            
            if (!isOpen && !isClosed){
                   neighbour.Parent=temp;
                   neighbour.costFromStart= costfromstart;
                   neighbour.heuristicCost= getHeuristic(neighbour);
                   neighbour.visited=true;
                   neighbour.settotalCost();
                   openList.add(neighbour);//added
            }
                   if (isClosed && temp.costFromStart < neighbour.costFromStart) {//added
                        closedList.remove(neighbour);
                   }
                   if(isOpen && temp.costFromStart < neighbour.costFromStart){//added
                       openList.remove(neighbour);
                   }
            }
            //deleted  closedList.add(temp);
        
    }
    
    
    return null;
    }
    
    
    public List Greedy(){
    
    Comparator<City> comparator = new greedycomparator();
    PriorityQueue<City> openList=new PriorityQueue(100,comparator);
    LinkedList closedList = new LinkedList();
    String printclosedList="";
    startcity.costFromStart=0;
    startcity.heuristicCost=getHeuristic(startcity);
    startcity.Parent=null;
    startcity.visited=true;
    openList.add(startcity);
    
    while(!openList.isEmpty()){
        City temp=(City) openList.remove();
        closedList.add(temp);//added
        if(temp == goalcity){
            printclosedList(closedList);
            return constructPath(goalcity);
        }
        
        List neighbours=getUnvisitedNeighbours(temp);
        for(int i=0;i<neighbours.size();i++){
            City neighbour=(City) neighbours.get(i);
            boolean isOpen = openList.contains(neighbour);
            boolean isClosed =closedList.contains(neighbour);
            double costfromstart=temp.costFromStart+getCost(temp,neighbour);
            
            if (!isOpen && !isClosed){
                   neighbour.Parent=temp;
                   neighbour.costFromStart= costfromstart;
                   neighbour.heuristicCost= getHeuristic(neighbour);
                   neighbour.visited=true;
                   neighbour.settotalCost();
                   openList.add(neighbour);//added
            }
                   if (isClosed && temp.costFromStart < neighbour.costFromStart) {//added
                        closedList.remove(neighbour);
                   }
                   if(isOpen && temp.costFromStart < neighbour.costFromStart){//added
                       openList.remove(neighbour);
                   }
            }
            //deleted  closedList.add(temp);
        
    }
    
    
    return null;
    }
    
    public List Uniform(){
    
    Comparator<City> comparator1 = new uniformcomparator();
    PriorityQueue<City> openList=new PriorityQueue(100,comparator1);
    LinkedList closedList = new LinkedList();
    String printclosedList="";
    startcity.costFromStart=0;
    startcity.heuristicCost=getHeuristic(startcity);
    startcity.Parent=null;
    startcity.visited=true;
    openList.add(startcity);
    
    while(!openList.isEmpty()){
        City temp=(City) openList.remove();
        closedList.add(temp);//added
        if(temp == goalcity){
            printclosedList(closedList);
            return constructPath(goalcity);
        }
        
        List neighbours=getUnvisitedNeighbours(temp);
        for(int i=0;i<neighbours.size();i++){
            City neighbour=(City) neighbours.get(i);
            boolean isOpen = openList.contains(neighbour);
            boolean isClosed =closedList.contains(neighbour);
            double costfromstart=temp.costFromStart+getCost(temp,neighbour);
            
            if (!isOpen && !isClosed){
                   neighbour.Parent=temp;
                   neighbour.costFromStart= costfromstart;
                   neighbour.heuristicCost= getHeuristic(neighbour);
                   neighbour.visited=true;
                   neighbour.settotalCost();
                   openList.add(neighbour);//added
            }
                   if (isClosed && temp.costFromStart < neighbour.costFromStart) {//added
                        closedList.remove(neighbour);
                   }
                   if(isOpen && temp.costFromStart < neighbour.costFromStart){//added
                       openList.remove(neighbour);
                   }
            }
            //deleted  closedList.add(temp);
        
    }
    
    
    return null;
    }
    
    
    /*
     * //PriorityList openList = new PriorityList();
    LinkedList<City> closedList = new LinkedList();
    String printclosedList="";
    startcity.costFromStart=0;
    startcity.heuristicCost=getHeuristic(startcity);
    startcity.Parent=null;
    startcity.visited=true;
    
    openList.add(startcity);
    
    while(!openList.isEmpty()){
        City temp=(City) openList.remove();
        //City temp=(City) openList.removeFirst();
        if(temp == goalcity){
            printclosedList(closedList);
            return constructPath(goalcity);
        }
        
        List neighbours=getUnvisitedNeighbours(temp);
        for(int i=0;i<neighbours.size();i++){
            City neighbour=(City) neighbours.get(i);
            boolean isOpen = openList.contains(neighbour);
            boolean isClosed =closedList.contains(neighbour);
            double costfromstart=temp.costFromStart+getCost(temp,neighbour);
            
            if ((!isOpen && !isClosed) || temp.costFromStart < neighbour.costFromStart){
                   neighbour.Parent=temp;
                   neighbour.costFromStart= costfromstart;
                   neighbour.heuristicCost= getHeuristic(neighbour);
                   neighbour.visited=true;
                   neighbour.settotalCost();
                   
                   if (isClosed) {
                        closedList.remove(neighbour);
                   }
                   if (!isOpen) {
                        openList.add(neighbour);
                    }
            
            }
            closedList.add(temp);
        }
    }
    
    
    return null;
    }
    */
}

