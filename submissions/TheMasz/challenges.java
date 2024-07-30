import java.util.ArrayList;
import java.util.List;

import challenges.*;

public class challenges {

	public static void main(String[] args) {
		Ex1 ex1 = new Ex1(new Integer[] { 2, 3, 5, 7, 11 }, 10);
		System.out.println(ex1);

		Ex2 ex2 = new Ex2("The quick brown fox jumps over the lazy dog");
		System.out.println(ex2);

		List<Edge> graph = new ArrayList<>();
		graph.add(new Edge(1, 2, 1));
		graph.add(new Edge(2, 3, 2));
		graph.add(new Edge(1, 3, 4));
		graph.add(new Edge(3, 4, 1));

		Ex3 ex3 = new Ex3(graph, 1, 4);
		System.out.println(ex3);


	}

}
