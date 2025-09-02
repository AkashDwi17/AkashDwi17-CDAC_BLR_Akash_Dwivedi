package Inheritance;
import java.util.*;

class Product{
	String proName;
	int price;
	
	public void showProd () {
		System.out.println("Product Name: " + proName + "Price: " + price);
	}
}

class DisPro extends Product {
	int disRate;
	public DisPro (int d, String p, int pr) {
		this.disRate = d;
		this.proName = p;
		this.price = pr;
	}
	public float finPrice () {
		return price - (disRate*price) / 100;
	}
}

public class ProductBillingSystem {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		DisPro [] d = new DisPro[2];
		
		for (int i=0; i<d.length; i++) {
			d[i] = new DisPro (sc.nextInt(), sc.next(), sc.nextInt());
		}
		for (int i=0; i<d.length; i++) {
			d[i].showProd();
			System.out.println(d[i].finPrice());
		}
	}
}
