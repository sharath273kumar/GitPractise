package AMZ;

import java.util.*;
public class Generics {
	
	public static void main(String args[]) {
		Bag<Notes> notes = new Bag<>();
		Bag<Coins> coins = new Bag<>();
		
		Notes n=new Notes();
		n.setValue(10);
		
		Coins c=new Coins();
		c.setValue(11);
		
		coins.add(c);
		notes.add(n);
		
		notes.display();
		coins.display();
	}

}

class Bag<T extends Get>{

	ArrayList<T> list = new ArrayList<>();
	public void add(T v) {
		list.add(v);		
	}
	
	public void display() {
		for(T x:list) {
			System.out.println(x.getData());
		}
	}
}

class Notes implements Get{
	int val;
	
	public void setValue(int val) {
		this.val = val;
	}
	
	public int getData() {
		return this.val;
	}
}

class Coins implements Get{
	int val;
	
	public void setValue(int val) {
		this.val = val;
	}
	
	public int getData() {
		return this.val;
	}
}

interface Get{
	int getData();
}
