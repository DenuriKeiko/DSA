import java.util.LinkedList;
import java.util.SequencedCollection;

public class SequenceCollectionpractical1
    {
     public SequenceCollectionpractical1()
	{
	    SequencedCollection sc = new LinkedList ();
		sc.addFirst(5);
		sc.addFirst(2);
		sc.addLast(3);
		System.out.println(sc.getFirst());
		System.out.println(sc.removeLast());
		System.out.println(sc);
		System.out.println(sc.reversed());
		
   }
public static void main(String [] args){
   new SequenceCollectionpractical1();
   
  }

}