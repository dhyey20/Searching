/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dhyey Shah
 * Unityid dbshah3
 */
public class SearchRomania {
    public static void main(String args[]){
        if(args.length!=3){
            System.out.println("Please enter the arguments correctly.");
        }
        else{
            String searchtype=args[0];
            String source=args[1];
            String destination=args[2];
            
            Node arad=new Node("arad",           46.16667, 21.3);
            Node bucharest=new Node("bucharest",      44.41667, 26.1);
            Node craiova=new Node("craiova",        44.33333, 23.81667);
            Node dobreta=new Node("dobreta",        44.5,     23.95);
            Node eforie=new Node("eforie",         44.06667, 28.63333);
            Node fagaras=new Node("fagaras",        45.84472, 24.97417);
            Node giurgiu=new Node("giurgiu",        43.90083, 25.97389);
            Node hirsova=new Node("hirsova",        46.68333, 27.53333);
            Node iasi=new Node("iasi",           47.16222, 27.58889);
            Node lugoj=new Node("lugoj",          45.68611, 21.90056);
            Node mehadia=new Node("mehadia",        44.90083, 22.35028);
            Node neamt=new Node("neamt",          46.9275,  26.37083);
            Node oradea=new Node("oradea",         47.07222, 21.92111);
            Node pitesti=new Node("pitesti",        44.86056, 24.86778);
            Node rimnicu_vilcea=new Node("rimnicu_vilcea", 45.10472, 24.37556);
            Node sibiu=new Node("sibiu",          45.79583, 24.15222);
            Node timisoara=new Node("timisoara",      45.75972, 21.23);
            Node urziceni=new Node("urziceni",       44.71806, 26.64528);
            Node vaslui=new Node("vaslui",         46.63833, 27.72917);
            Node zerind=new Node("zerind",         46.63333, 21.66667);

            Graph g=new Graph();
            g.addNode(arad);
            g.addNode(bucharest);
            g.addNode(craiova);
            g.addNode(dobreta);
            g.addNode(eforie);
            g.addNode(fagaras);
            g.addNode(giurgiu);
            g.addNode(hirsova);
            g.addNode(iasi);
            g.addNode(lugoj);
            g.addNode(mehadia);
            g.addNode(neamt);
            g.addNode(oradea);
            g.addNode(pitesti);
            g.addNode(rimnicu_vilcea);
            g.addNode(sibiu);
            g.addNode(timisoara);
            g.addNode(urziceni);
            g.addNode(vaslui);
            g.addNode(zerind);
            
            g.setStartState(source);
            g.setGoalState(destination);
            
            
            g.addEdge(oradea,    zerind,     71);
            g.addEdge(zerind,         arad,           75);
            g.addEdge(arad,      timisoara, 118);
            g.addEdge(timisoara,      lugoj,         111);
            g.addEdge(lugoj,     mehadia,    70);
            g.addEdge(dobreta,        mehadia,        75);
            g.addEdge(oradea,    sibiu,     151);
            g.addEdge(arad,           sibiu,         140);
            g.addEdge(dobreta,   craiova,   120);
            g.addEdge(sibiu,          rimnicu_vilcea, 80);
            g.addEdge(sibiu,     fagaras,    99);
            g.addEdge(rimnicu_vilcea, craiova,       146);
            g.addEdge(pitesti,   craiova,   138);
            g.addEdge(rimnicu_vilcea, pitesti,        97);
            g.addEdge(bucharest, pitesti,   101);
            g.addEdge(bucharest,      fagaras,       211);
            g.addEdge(bucharest, giurgiu,    90);
            g.addEdge(bucharest,      urziceni,       85);
            g.addEdge(vaslui,    urziceni,  142);
            g.addEdge(hirsova,        urziceni,       98);
            g.addEdge(hirsova,   eforie,     86);
            g.addEdge(vaslui,         iasi,           92);
            g.addEdge(neamt,     iasi,       87);
            
            if("dfs".equals(searchtype)){
                System.out.println("DFS:       ");
                g.dfs(g.getGoalState());
            }
            else if("bfs".equals(searchtype)){
                System.out.println("BFS:       ");
                g.bfs(g.getGoalState());
            }
            
        }
        
    
    }
}
