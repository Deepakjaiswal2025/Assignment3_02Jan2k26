package deepak.java.colllection.HashTable;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;


/*✅ Constructors of Hashtable Demonstrated

Hashtable()

Hashtable(int initialCapacity)

Hashtable(int initialCapacity, float loadFactor)

Hashtable(Map<? extends K,? extends V> m)

✅ 15 Methods Demonstrated
put()
get()
remove()
size()
isEmpty()
containsKey()
containsValue()
keys()
elements()
keySet()
values()
entrySet()
putAll()
clear()
clone()*/

public class AllAboutHashTable {

	public static void main(String[] args) {
		
		// there are for constructor present in hashtable.
		
		// 1 Defualt constructor.. 11
		
		Hashtable<Integer, String> ht1 = new Hashtable<>();
		
		//2️ Hashtable(int initialCapacity)
		
		Hashtable<Integer, String> ht2 = new Hashtable<>(20);
		
        // 3️⃣ Hashtable(int initialCapacity, float loadFactor)		
		
		Hashtable<Integer, String> ht3 = new Hashtable<>(10, 0.75f);
		
		//4️⃣ Hashtable(Map<? extends K, ? extends V> m)
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Java");

		Hashtable<Integer, String> ht4 = new Hashtable<>(map);
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\n.....15 methods of Hashtable....");
			System.out.println("1. put");
			System.out.println("2. get");
			System.out.println("3. remove");
			System.out.println("4. size");
			System.out.println("5. isEmpty");
			System.out.println("6. containsKey");
			System.out.println("7. containsValue");
			System.out.println("8. keys");
			System.out.println("9. elements");
			System.out.println("10. KeySet");
			System.out.println("11. values");
			System.out.println("12. entrySet");
			System.out.println("13. putAll");
			System.out.println("14. clear");
			System.out.println("15. clone");
			System.out.println("16. exits");
			System.out.println("Enter your choice which you want to perform operation on Hashtable : ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1: System.out.println("enter key ");
			       int key = sc.nextInt();
			       sc.nextLine();
			       System.out.println("Enter the value");
			       String value =  sc.next();
			       ht1.put(key, value);
			       System.out.println("Inserted successfully.");
			       break;
			       
			case 2: System.out.println("enter key to get value: ");
					key = sc.nextInt();
					System.out.println("value: "+ht1.get(key));
					break;
					
			case 3: System.out.println("enter key to remove entry: ");
					key = sc.nextInt();
					System.out.println("value: "+ht1.remove(key));
					break;		
			
			case 4: System.out.println("Size: "+ht1.size());
					break;	
			
			case 5: System.out.println("Is Empty: "+ht1.isEmpty());
			        break;
			 
			case 6: System.out.println("Enter Key: ");
			        key = sc.nextInt();
			        System.out.println("Contains Key: "+ ht1.contains(key));
			        break;
			        
			case 7: System.out.println("Enter value: ");
			        value = sc.next();
			        System.out.println("Contains Key: "+ ht1.contains(value));
			        break;
			        
			case 8: System.out.println("Keys: ");
			        Enumeration<Integer> keys = ht1.keys();
			        while(keys.hasMoreElements()) {
			        	System.out.println(keys.nextElement());
			        }
			        break;
			case 9: System.out.println("Elemenets: ");   
			        Enumeration<String> elements = ht1.elements();
			        while(elements.hasMoreElements()) {
			        	System.out.println(elements.nextElement());
			        }
			        break;
			
			case 10: System.out.println("KeySet: "+ht1.keySet());
	                 break;
	                 
			case 11: System.out.println("IValues: "+ht1.values());
	                 break;
	         
			case 12: System.out.println("EntrySet: "+ht1.entrySet());
			         break;
			
			case 13:
		             Hashtable<Integer, String> temp = new Hashtable<>();
		             temp.put(100, "Temp");
		             ht1.putAll(temp);
		             System.out.println("putAll executed.");
		             break;
		             
			case 14: ht1.clear();
			         System.out.println("Hashtable cleared.");
			         break;
			case 15: Hashtable<Integer, String> clone = 
					(Hashtable<Integer, String>) ht1.clone();
			         break;
			case 16: System.out.println("Exiting program.....");   
			         break;
			 default: System.out.println("Invalid choice please choose correct choice!");        
			
			
			}
		}while(choice!=16);
		
		
		
		
		
		
		


	}

}
