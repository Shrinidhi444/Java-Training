package PacJava;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class DFS{

	HashMap<Integer,LinkedList<Integer>> hm;
	
	DFS(){
		hm = new HashMap<>();
	}
	
	void Addvertex(int v) {
		hm.putIfAbsent(v,new LinkedList<>());
	}
	
	void AddEdges(int u , int v) {
		hm.get(u).add(v);
		hm.get(v).add(u);
	}
	
	void Display() {
		for(int ver : hm.keySet()){
		System.out.print(ver+"->");	
		for(int n:hm.get(ver)) {
			System.out.print(n);
		}}
		System.out.println();
	}
	
	void dfs(int start) {
		HashSet<Integer> visited = new HashSet<>();
		dfsHelper(start,visited);
	}
	
	void dfsHelper(int curr,HashSet<Integer> visited) {
		visited.add(curr);
		System.out.print(curr+" ");
		for(int nbr:hm.get(curr)) {
			if(!visited.contains(nbr)) {
		    dfsHelper(nbr,visited);	
			}
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
		 g.AddEdges(1,5);
		 g.AddEdges(2,3);
		 g.Display();
		 g.dfs(1);
	}

}
