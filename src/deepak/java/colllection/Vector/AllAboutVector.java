package deepak.java.colllection.Vector;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
public class AllAboutVector {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		GenericsVector<String> vector = new GenericsVector<String>();
		vector.vector1.add("Java");
		vector.vector1.add("Python");
		vector.vector1.add("C++");
		
		int choice;
		
		do {
			System.out.println("\n --- Vector menu ----");
			System.out.println("1  Add");
			System.out.println("2  Add at Index");
			System.out.println("3  AddAll");
			System.out.println("4  Get");
			System.out.println("5  Set");
			System.out.println("6  Remove by Index");
			System.out.println("7  Remove by Object");
			System.out.println("8  Size");
			System.out.println("9  Contains");
			System.out.println("10 IsEmpty");
			System.out.println("11 IndexOf");
			System.out.println("12 LastIndexOf");
			System.out.println("13 Clear");
			System.out.println("14 ToArray");
			System.out.println("15 Iterator");
			System.out.println("16 Exit");
			System.out.print("Enter your  choice which you want to perfom action vector : ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
			case 1: System.out.println("Enter element");
			        vector.add(sc.nextLine());
			        break;
			case 2: System.out.println("Enter index where you want to add element in vector ");    
			        int idx = sc.nextInt();
			        sc.nextLine();
			        System.out.println("Enter element");
			        vector.add(idx,sc.nextLine());
			        break;
			        
			case 3: System.out.println("add all element of list into another list..");
			        vector.addAll();
			        break;
			 
			case 4: System.out.println("enter the index");	
			        
			        System.out.println(vector.get(sc.nextInt()));
			        break;
			        
			case 5: System.out.println("set element on specific index");
			        System.out.println("enter the index");
			        int idnx = sc.nextInt();
			        sc.nextLine();
			        System.out.println("enter the element ");
			        vector.set(idnx, sc.nextLine());
			        break;
			        
			case 6:  System.out.println("enter index which want to delete value from vector");
			         vector.removeByIndex(sc.nextInt());
			         break;
			         
			case 7:  System.out.println("enter element which want to delete value from vector");  
			         vector.removeByObject(sc.nextLine());
			         break;
			case 8:  System.out.println("Size of vector: "+vector.size());
			         break;
			case 9:  System.out.println("Enter element"); 
			         System.out.println("check element present or not : "+vector.isContains(sc.nextLine()));
			         break;
			case 10: 
			         System.out.println("check vector is Empty or not : "+vector.isEmpty());
			         break;
			         
			case 11: System.out.println("enter element");
				     System.out.println("index of given Elment : "+ vector.indexOf(sc.nextLine()));
			         break;
			         
			case 12: System.out.println("enter element");
				     System.out.println("last index of given Elment : "+ vector.lastIndexOf(sc.nextLine()));
	                 break;
	                 
			case 13: System.out.println("clear all element from vector");  
			         vector.clear();
			         break;
			         
			case 14: vector.toArrayDisplay();
			         break;
			         
			case 15: vector.iterator();
			         break;
			         
			case 16:

                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid choice");         
	                     	
			
			}

			
			
		}while(choice!=16);
		

		sc.close();
	}

}

class GenericsVector<T>{
	Vector<T> vector = new Vector<T>();
	Vector<T> vector1 = new Vector<T>();
	
   
	void add(T element) {
		vector.add(element);
		System.out.println("insert element on list..");
	}
	
	void add(int idx, T element) {
		vector.add(idx,element);
	}
	
	void addAll() {
		vector.addAll(vector1);
	}
    
	
	int size() {
		return vector.size();	
	}
	
	boolean isEmpty() {
		return vector.isEmpty();
	}
	
	void removeByIndex(int idx) {
		vector.remove(idx);
	}
	
	void removeByObject(T element) {
		vector.remove(element);
	}
	
	boolean  isContains(T element) {
		return vector.contains(element);
	}
	
	T get(int idnx) {
		return vector.get(idnx);
	}
	
	void set(int idx, T element) {
		vector.set(idx, element);
	}
	
	int indexOf(T element) {
		return vector.indexOf(element);
	}
	int lastIndexOf(T element) {
		return vector.lastIndexOf(element);
	}
	void clear() {
		vector.clear();
	}
	
	void toArrayDisplay() {
		Object[] arr = vector.toArray();
		System.out.println(Arrays.toString(arr));
	}
	
	void iterator() {
		Iterator<T> itr = vector.listIterator();
		while(itr.hasNext()) {
		   System.out.print(itr.next()+","+" ");
		}
		System.out.println();
		
	}
	
	

}
