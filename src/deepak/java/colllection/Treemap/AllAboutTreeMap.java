package deepak.java.colllection.Treemap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.*;

/*🔹 Constructors of TreeMap

1️ TreeMap()
Creates an empty TreeMap sorted by natural order of keys.

2️ TreeMap(Comparator<? super K> comp)
Creates a TreeMap sorted using a custom comparator.

3️ TreeMap(Map<? extends K, ? extends V> m)
Creates a TreeMap containing all mappings from another map.

4️ TreeMap(SortedMap<K, ? extends V> sm)
Creates a TreeMap from an existing SortedMap.

🔹 Common Methods of TreeMap
Method	Description
put()	Inserts key–value pair
get()	Returns value for a key
remove()	Removes entry using key
firstKey()	Returns smallest key
lastKey()	Returns largest key
higherKey()	Returns next higher key
lowerKey()	Returns next lower key
ceilingKey()	≥ given key
floorKey()	≤ given key
descendingMap()	Reverse order map
entrySet()	Returns all entries
*/
public class AllAboutTreeMap {
	
	public static void main(String[] args) {
		// Default capacity
		TreeMap<Integer, String> tm = new TreeMap<>();
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("....Common methods of Treemap...");
			System.out.println("1. put");
			System.out.println("2. get");
			System.out.println("3. remove");
			System.out.println("4. size");
			System.out.println("5. isEmpty");
			System.out.println("6. firstKey");
			System.out.println("7. lastKey");
			System.out.println("8. higerKey");
			System.out.println("9. lowerKey");
			System.out.println("10. ceilingKey");
			System.out.println("11. floorKey");
			System.out.println("12. descendingMap");
			System.out.println("13. entrySet");
			System.out.println("14. exits");
			
			System.out.println("Enter your choice which you want to perform operation on TreeMap : ");
			choice = sc.nextInt();
			
			switch(choice) {
				
				case 1: System.out.println("enter key ");
				       int key = sc.nextInt();
				       sc.nextLine();
				       System.out.println("Enter the value");
				       String value =  sc.next();
				       tm.put(key, value);
				       System.out.println("Inserted successfully.");
				       break;
				       
				case 2: System.out.println("enter key to get value: ");
						key = sc.nextInt();
						System.out.println("value: "+tm.get(key));
						break;
						
				case 3: System.out.println("enter key to remove entry: ");
						key = sc.nextInt();
						System.out.println("value: "+tm.remove(key));
						break;		
				
				case 4: System.out.println("Size: "+tm.size());
						break;	
				
				case 5: System.out.println("Is Empty: "+tm.isEmpty());
				        break;
				        
				case 6: System.out.println("First Key: " + tm.firstKey());  
				        break;
				        
				case 7: System.out.println("First Key: " + tm.lastKey());  
		                break; 
				case 8: System.out.println("Enter the key which want to perfom higher then key");
				        key = sc.nextInt();
				        System.out.println("Higher key than key: " + tm.higherKey(key));
			            break;
				 
				case 9: System.out.println("Enter the key which want to perfom lower then key");
				        key = sc.nextInt();
				        System.out.println("Higher key than key: " + tm.lowerKey(key));
			            break;  
			            
				case 10: 
				        key = sc.nextInt();
				        System.out.println("ceiling key than key: " + tm.ceilingKey(key));
			            break; 
			     
				case 11: System.out.println("Floor key of 2: " + tm.floorKey(2));        
			            
				case 12: System.out.println("Descending Map: " + tm.descendingMap());        
			             break;
			            
				case 13:  System.out.println("Entry Set:");
			              for (Map.Entry<Integer, String> entry : tm.entrySet()) {
			              System.out.println(entry.getKey() + " = " + entry.getValue());
			              }
			              break;
			              
	          	case 14: System.out.println("Exiting program.....");   
	          			 break;
		         
	          	default: System.out.println("Invalid choice...");         
            }
            	
            

		}
		while(choice!=15);
		
		sc.close();
	}
}
