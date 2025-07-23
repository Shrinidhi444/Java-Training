package PacJava;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class PathDfs {
HashMap<Integer,LinkedList<Integer>> hm;
	
	PathDfs(){
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
		for (int ver:hm.keySet()) {
			System.out.print(ver +"->");
			for(int n:hm.get(ver)) {
				System.out.print(n);
			}
		}
		System.out.println();
		}
	
	boolean PathExist(int start, int end) {
		HashSet<Integer> hs = new HashSet<>();
		return dfs(start,end, hs);
	}
	
	boolean dfs(int curr, int end, HashSet<Integer> visited) {
		if(curr == end)
				return true;
		visited.add(curr);
		for(int nbr : hm.get(curr)) {
			if(!visited.contains(nbr)) {
				if(dfs(nbr, end, visited))
					return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		PathDfs g = new PathDfs();
		g.Addvertex(1);
		 g.Addvertex(2);
		 g.Addvertex(3);
		 g.Addvertex(4);
		 g.Addvertex(5);
		 g.AddEdges(1,5);
		 g.AddEdges(2,3);
		 
		 System.out.println(g.PathExist(1, 3));
	}
}