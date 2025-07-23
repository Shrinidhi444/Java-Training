package PacJava;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;


public class BFS{
HashMap<Integer,LinkedList<Integer>> hm;

BFS(){
	hm =new HashMap<>();
	}
void Addvertex(int v) {
	hm.putIfAbsent(v,new LinkedList<>());
}
void Addedges(int v,int u) {
	hm.get(v).add(u);
	hm.get(u).add(v);
}

void Display() {
	for(int var : hm.keySet()) {
		System.out.print(var +"->");
		for(int n:hm.get(var)) {
			System.out.print(n);
		}
	}
}

void bfs(int start) {
    HashSet<Integer> visited = new HashSet<>();
    Queue<Integer> q = new LinkedList<Integer>();
    visited.add(start);
    q.add(start);
    bfsHelper(q, visited);
}

void bfsHelper(Queue<Integer> q, HashSet<Integer> visited) {
    if (q.isEmpty()) {
        return;
    }
    int curr = q.remove();
    System.out.print(curr + " ");
    for (int nbr : hm.get(curr)) {
        if (!visited.contains(nbr)) {
            visited.add(nbr);
            q.add(nbr);
        }
    }
    bfsHelper(q, visited);
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

}
