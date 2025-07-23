package PacJava;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Prac {

	HashMap<Integer,LinkedList<Integer>> hm;
	
	Prac(){
		hm = new HashMap<>();
	}
	
	void Addvertes(int v) {
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
	public static void main(String[] args) {
		int a = args.length;
        
		
		for(int i = 0;i<=a;i++) {
			System.out.println(a);
		}
		Scanner sc = new Scanner(System.in);
		 
		 Graph g = new Graph();
		 g.Addvertex(1);
		 g.Addvertex(2);
		 g.Addvertex(3);
		 g.Addvertex(4);
		 g.Addvertex(5);
		 g.AddEdge(1,5);
		 g.AddEdge(2,3);
		 g.Display();
	}

}
