import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListItem {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new ItemListening("Universidad"));
		list.add(new ItemListening("Distrital"));
		list.add(new ItemListening("FJC"));
		
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
