package deepak.java.colllection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class AllAboutLIST {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("take input from the user...!");
        
//        
        // 1. Default constructor
        System.out.println(".... Default constructor....");
        ArrayList<String> list = new ArrayList<String>();
        System.out.println(list.size()); // 0;
        
      //2.  constructor with Initial capacity
        System.out.println("....constructor with Initial capacity....");
        ArrayList<String> list2 = new ArrayList<>(5);
        System.out.println(list2.size()); // 0;
        
        
     // 3. Constructor with another collection
        System.out.println("....Constructor with another collection....");
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Deepak","Jaiswal"," Biharpur"));
        System.out.println(list3.size()); // 0;
        
        int choice;
        
        int milisecond = sc.nextInt(); // use for thread sleep();
        
        

        do {
            System.out.println("\n----- All methods of ArrayList -----");
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
            System.out.print("\nEnter your choice which you want to perform operation on ArrayList : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter element which you wan to add in list : ");
                    list.add(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter specific Index where you want to add element : ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Element: ");
                    list.add(idx, sc.nextLine());
                    break;

                case 3:  System.out.println("add of all element of list into another list..");
	                    list.addAll(list3);
	                    System.out.println("addAll executed");
	                    break;

                case 4:
                    System.out.print("Enter specific index in  which want to access value from list: ");
                    int idx1 = sc.nextInt();
                    System.out.println(list.get(idx1));
                    break;

                case 5:
                    System.out.print("enter Index at set the new value : ");
                    int idx2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Value: ");
                    list.set(idx2, sc.nextLine());
                    break;

                case 6:
                    System.out.print("enter Index where remove element from list : ");
                    list.remove(sc.nextInt());
                    break;

                case 7: System.out.print("enter Element which you want to remove element from list : ");
	                    System.out.print("Element: ");
	                    list.remove(sc.nextLine());
	                    break;

                case 8: 
	                    System.out.println("Size: " + list.size());
	                    break;

                case 9:
	                    System.out.print("Check element present in list: ");
	                    System.out.println(list.contains(sc.nextLine()));
	                    break;

               case 10: System.out.println("check list is empty or not");
	                    System.out.println(list.isEmpty());
	                    break;

                case 11:
	                    System.out.print("Enter which Element whose want to get idex : ");
	                    System.out.println(list.indexOf(sc.nextLine()));
	                    break;

                case 12:
	                    System.out.print("Enter which Element whose want to get index of last Occurrences in list : ");
	                    System.out.println(list.lastIndexOf(sc.nextLine()));
	                    break;

                case 13:
                    list.clear();
                    System.out.println("List cleared");
                    break;

                case 14:  System.out.println("convert list to array..");
                    Object[] arr = list.toArray();
                    System.out.println(Arrays.toString(arr));
                    break;

                case 15:
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        System.out.println(it.next());
                    }
                    break;

                case 16:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice   !!!!");
            }

        } while (choice != 16);
        

        sc.close();

	}
	
	public static void pause(int milisecond) {
		try {
		Thread.sleep(milisecond);
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
