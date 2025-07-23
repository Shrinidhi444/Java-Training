package PacJava;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;

public class Leveltrav {
HashMap<Integer,LinkedList<Integer>> hm;

Leveltrav()
{
	hm = new HashMap<>();
}
void Addvertex(int v) {
	hm.putIfAbsent(v,new LinkedList<>());
}

void Addedges(int u,int v) {
	hm.get(u).add(v);
	hm.get(v).add(u);
}

void Display() {
	for(int var:hm.keySet()) {
		System.out.print(var +" ");
		for(int n:hm.get(var)) {
			System.out.print(var);
		}
	}
	System.out.println();
}

void bfs(int start) {
	HashSet<Integer> visited = new HashSet<>() ;
	Queue<Integer> p = new LinkedList<Integer>();
	
	visited.add(start);
	p.add(start);
	bfsHelper(p,visited);	
}

void bfsHelper(Queue<Integer> p,HashSet<Integer> visited) {
	if(p.isEmpty()) {
		return;
	}
	int curr=p.remove();
	System.out.print(curr+" ");
	for(int nbr : hm.get(curr)) {
	if(!visited.contains(nbr)) {
		visited.add(nbr);
		p.add(nbr);+
		
	}
	bfsHelper(p,visited);
}
	
	public static void main(String[] args) {
	    BFS g = new BFS();

	     g.Addvertex(1);
		 g.Addvertex(2);
		 g.Addvertex(3);
		 g.Addvertex(4);
		 g.Addvertex(5);
		 g.Addedges(1,5);
		 g.Addedges(2,3);
}