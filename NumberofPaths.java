package PacJava;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class NumberofPaths {

HashMap<Integer,LinkedList<Integer>> hm;

NumberofPaths(){
	hm = new HashMap<>();
	}

void Addvertex(int v) {
	hm.putIfAbsent(v,new LinkedList<>());
}

void Addedges(int u,int v) {
	hm.get(v).add(u);
	hm.get(u).add(v);
}

void dfs(int start) {
	HashSet<Integer> end= new HashSet<>();
	dfsHelper(start,end);
}

void dfsHelper(int start,HashSet<Integer> end) {
	end.add(start);
	System.out.print(start);
	for(int nbr:hm.get(start)) {
		dfsHelper(start,end);
	}	
}
public static void main(String[] args) {
	int a = args.length;
    
	
	for(int i = 0;i<=a;i++) {
		System.out.println(a);
	}
	Scanner sc = new Scanner(System.in);
	 
	 DFS g = new DFS();
	 g.Addvertex(1);
	 g.Addvertex(2);
	 g.Addvertex(3);
	 g.Addvertex(4);
	 g.Addvertex(5);
	 g.AddEdges(1,2);
	 g.AddEdges(1,3);
	 g.AddEdges(2,3);
	 g.AddEdges(3,4);
	 g.Display();
	 g.dfs(1);
}

}
