/**
 *
 * @author Dhyey Shah 
 * Unityid:dbshah3
 */
import java.util.*;
public class Graph{
        
    Node startnode;
    Node endnode;
    int adjMatrix[][];
    int size;
    ArrayList nodes=new ArrayList();
    public void addNode(Node n){
            nodes.add(n);
    }
    
    public void addEdge(Node start, Node end,double distance){
        if(adjMatrix==null){
            size=nodes.size();
            adjMatrix= new int[size][size];
         
        }
        int sindex = nodes.indexOf(start);
        int eindex = nodes.indexOf(end);
        adjMatrix[sindex][eindex]=1;
        adjMatrix[eindex][sindex]=1;
    }
    
    public Node getUnvisitedChild(Node n){
        int index = nodes.indexOf(n);
        for(int i=0;i<size;i++){
            if(adjMatrix[index][i]==1){
                if(((Node)nodes.get(i)).visited==false){
                    return (Node)nodes.get(i);
                }
            }
        }
        return null;
    }
    
    public void setStartState(String s){
        for(int i=0;i<nodes.size();i++){
            Node temp=(Node)nodes.get(i);
            if(temp.label.equals(s)){
                this.startnode=temp;
            }
            
        }
    }
    public Node getStartState(){
        return this.startnode;
    }
    public void setGoalState(String s){
        for(int i=0;i<nodes.size();i++){
            Node temp=(Node)nodes.get(i);
            if(temp.label.equals(s)){
                this.endnode=temp;
            }
            
        }
    }
    public Node getGoalState(){
        return this.endnode;
    }
    public void printNode(Node n){
        System.out.println(n.label+"    ");
    }
    public void setAllUnvisited(){
        for(int i=0;i<size;i++){
            ((Node)nodes.get(i)).visited=false;
        }
    }
    
    
    public void dfs(Node g){
        Stack stack=new Stack();
        stack.push(startnode);
        startnode.visited=true;
        printNode(startnode);
        while(!stack.isEmpty()){
            Node child= getUnvisitedChild(((Node)stack.peek()));
            if(child!=null){
                if(child.label.equals(g.label)){
                    printNode(g);
                    break;
                }
                child.visited=true;
                printNode(child);
                stack.push(child);
            }
            else{
                stack.pop();
            }
            
            
        }
        
        setAllUnvisited();
    }
    
    public void bfs(Node g){
        Queue q=new LinkedList();
        q.add(startnode);
        startnode.visited=true;
        printNode(startnode);
        A:while(!q.isEmpty()){
            Node child=null;
            Node n=(Node)q.remove();
            while((child=getUnvisitedChild(n))!=null){
                if(child.label.equals(g.label)){
                    printNode(g);
                    break A;
                }
                child.visited=true;
                q.add(child);
                printNode(child);
                
            }
        }
        setAllUnvisited();
    }
    
    
}
