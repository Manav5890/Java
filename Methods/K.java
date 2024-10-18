import java.util.HashSet;
import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

class K{
	public static void main(String[] args){
		
		HashSet l = new HashSet();
		l.add("hey");
		l.add(43);
		l.add(44);
		l.add(67);
		System.out.println(l);

		ArrayList m = new ArrayList();
		m.add('A');
		m.add(56);
		m.add(23);
		m.add(56);		
		System.out.println(m);


		Vector n = new Vector();
		n.add(true);
		n.add(53);
		n.add(21.2);
		n.add(565);
		System.out.println(n);

		LinkedHashSet o = new LinkedHashSet();
		o.add("Manav");
		o.add(433);
		o.add(420.4);
		o.add(6732);
		System.out.println(o);

		TreeSet q = new TreeSet();
		q.add(314);
		q.add(441);
		q.add(672);
		System.out.println(q);
		
		LinkedList s = new LinkedList();
		s.add(3445);
		s.add(4335);
		s.add(4245);
		s.add('Z');
		System.out.println(s);

}





}