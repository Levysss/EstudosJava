package encontro10;

import java.util.PriorityQueue;
import java.util.Queue;

public class fila {

	public static void main(String args[]) {
		Queue<Integer> fila = new PriorityQueue<Integer>();
		fila.offer(10);
		fila.offer(30);
		fila.offer(20);
		fila.offer(5);
		fila.offer(20);	
		System.out.println(fila);
	}
}
