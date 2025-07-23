package PacJava;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class Graph {
HashMap<Integer,LinkedList<Integer>> hm;
 
 Graph()
{
	hm= new HashMap<>();
	 
}
 void Addvertex(int v) {
	 hm.putIfAbsent(v,new LinkedList<>());
 }
 
 void AddEdge(int u,int v) {
	 hm.get(u).add(v);
	 hm.get(v).add(u);
 }
 
 void Display() {
	 for(int v:hm.keySet()) {
		 System.out.print(v +"->");
		 for(int n :hm.get(v)) {
			 System.out.print(n +" ");
		 }
		 System.out.println();
	 }
 }
 
 public static void main(String args[]) {
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
