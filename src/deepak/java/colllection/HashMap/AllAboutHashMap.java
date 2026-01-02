package deepak.java.colllection.HashMap;

import java.util.*;

public class AllAboutHashMap  {

    public static void main(String[] args) {

        // ---- Constructors ----
        HashMap<Integer, String> map1 = new HashMap();   // default constructor
        HashMap map2 = new HashMap(10); // initial capacity
        HashMap map3 = new HashMap((int) 0.75f); // load factor
        HashMap map4 = new HashMap(map1);  // copy constructor

        Scanner sc = new Scanner(System.in);
        int choice;

        // ---- Adding initial elements ----
        map1.put(1, "Java");
        map1.put(2, "Python");
        map1.put(3, "C++");
        map1.put(null, "NullKey");
        map1.put(4, null);

        do {
            System.out.println("\n--- HashMap Menu ---");
            System.out.println("1  Display Map");
            System.out.println("2  Size");
            System.out.println("3  IsEmpty");
            System.out.println("4  Get value");
            System.out.println("5  Contains Key");
            System.out.println("6  Contains Value");
            System.out.println("7  Remove");
            System.out.println("8  PutIfAbsent");
            System.out.println("9  KeySet");
            System.out.println("10 Values");
            System.out.println("11 EntrySet");
            System.out.println("12 Replace");
            System.out.println("13 Clear");
            System.out.println("14 Equals");
            System.out.println("15 HashCode");
            System.out.println("16 Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Map: " + map1); // toString()
                    break;

                case 2:
                    System.out.println("Size: " + map1.size());
                    break;

                case 3:
                    System.out.println("Is Empty: " + map1.isEmpty());
                    break;

                case 4:
                    System.out.print("Enter key: ");
                    System.out.println("Value: " + map1.get(sc.next()));
                    break;

                case 5:
                    System.out.print("Enter key: ");
                    System.out.println(map1.containsKey(sc.next()));
                    break;

                case 6:
                    System.out.print("Enter value: ");
                    System.out.println(map1.containsValue(sc.next()));
                    break;

                case 7:
                    System.out.print("Enter key to remove: ");
                    map1.remove(sc.next());
                    System.out.println("Removed");
                    break;

                case 8:
                    System.out.print("Enter key (Integer): ");
                    int k = sc.nextInt();          // ✔ int input
                    sc.nextLine();
                    System.out.print("Enter value (String): ");
                    String v = sc.nextLine();      // ✔ String value
                    map1.putIfAbsent(k, v);
                    System.out.println("Inserted using putIfAbsent");
                    break;


                case 9:
                    System.out.println("KeySet: " + map1.keySet());
                    break;

                case 10:
                    System.out.println("Values: " + map1.values());
                    break;

                case 11:
                    System.out.println("EntrySet: " + map1.entrySet());
                    break;

                case 12:
                    System.out.print("Enter key (Integer): ");
                    int key = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Old value (String): ");
                    String oldVal = sc.nextLine();

                    System.out.print("New value (String): ");
                    String newVal = sc.nextLine();

                    boolean replaced = map1.replace(key, oldVal, newVal);

                    if (replaced) {
                        System.out.println("Value replaced successfully");
                    } else {
                        System.out.println("Replace failed (key/value not matched)");
                    }
                    break;


                case 13:
                    map1.clear();
                    System.out.println("Map Cleared");
                    break;

                case 14:
                    System.out.println("Equals map2: " + map1.equals(map2));
                    break;

                case 15:
                    System.out.println("HashCode: " + map1.hashCode());
                    break;

                case 16:
                    System.out.println("Exit Program");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 16);

        sc.close();
    }
}

