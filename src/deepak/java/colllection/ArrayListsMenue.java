package deepak.java.colllection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListsMenue {

	public static void main(String[] args) {
		GenericArrayList<String> list = new GenericArrayList<>();
        Scanner sc = new Scanner(System.in);  
        int choice;
        
        // add element in list1
        
        list.list1.add("Java");
        list.list1.add("Selenium");
        
        

        do {
            System.out.println("\n--- ArrayList Menu ---");
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
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter element: ");
                    list.add(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Index: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Element: ");
                    list.addAtIndex(idx, sc.nextLine());
                    break;

                case 3:
                    list.addAll();
                    break;

                case 4:
                    System.out.print("Index: ");
                    System.out.println(list.get(sc.nextInt()));
                    break;

                case 5:
                    System.out.print("Index: ");
                    int i = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Value: ");
                    list.set(i, sc.nextLine());
                    break;

                case 6:
                    System.out.print("Index: ");
                    list.removeByIndex(sc.nextInt());
                    break;

                case 7:
                    System.out.print("Element: ");
                    list.removeByObject(sc.nextLine());
                    break;

                case 8:
                    System.out.println("Size: " + list.size());
                    break;

                case 9:
                    System.out.print("Element: ");
                    System.out.println(list.contains(sc.nextLine()));
                    break;

                case 10:
                    System.out.println(list.isEmpty());
                    break;

                case 11:
                    System.out.print("Element: ");
                    System.out.println(list.indexOf(sc.nextLine()));
                    break;

                case 12:
                    System.out.print("Element: ");
                    System.out.println(list.lastIndexOf(sc.nextLine()));
                    break;

                case 13:
                    list.clear();
                    System.out.println("List cleared");
                    break;

                case 14:
                    list.toArrayDisplay();
                    break;

                case 15:
                    list.iterate();
                    break;

                case 16:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 16);

        sc.close();
      

	}

}

class GenericArrayList<T>{
	
	ArrayList<T> list = new ArrayList<T>();
	
	ArrayList<T> list1 = new ArrayList<T>();
	
	// add element in list
	void add(T element) {
		list.add(element);
	}
	
	void addAtIndex(int idx, T element) {
		list.add(idx,element);
	}
	
	void addAll() {
		list.addAll(list1);
		System.out.println("addAll executed ");
	}
	
	T get(int index) {
		return list.get(index);
	}
	
	void set(int index, T element) {
		list.set(index, element);
	}
	
	void removeByIndex(int index) {
		list.remove(index);
	}
	
	void removeByObject(T element) {
		list.remove(element);
	}
	
	int size() {
		return list.size();
	}
	boolean isEmpty() {
		return list.isEmpty();
	}
	
	boolean contains(T element) {
		return list.contains(element);
	}
	
	int indexOf(T element) {
		return list.indexOf(element);
	}
	
	int lastIndexOf(T element) {
		return list.lastIndexOf(element);
	}
	
	void clear() {
		list.clear();
	}
	
    void  toArrayDisplay() {
		Object[] arr = list.toArray();
		System.out.println(Arrays.toString(arr));
	}
    
    void iterate() {
    	Iterator<T> it = list.iterator();
    	while(it.hasNext()) {
    		System.out.println(it.next());
    	}
    	
    }
    
}
