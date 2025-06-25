import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Listproblem {
    public static void main(String[] args)
    {
        List<Integer> arraylist = new ArrayList<>();

        // Adding element at index 2

        arraylist.add(10);
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(40);
        arraylist.add(50);  
        arraylist.add(2, 25); 

        // Update an element at index 1

        arraylist.set(1,48);

        // Remove an element from the list
        arraylist.remove(1);

        // Displaying the elements of the list

        System.out.println("This is the arraylist : " + arraylist);


        // for Hash-map

        HashMap<Integer,String> hashmap = new HashMap<> ();

        // Adding elements to the HashMap
        hashmap.put(1,"Irshad");
        hashmap.put(2,"Amit");
        hashmap.put(3,"Ravi");
        hashmap.put(4,"Suresh");

        // Updating an element in the HashMap
        hashmap.put(2,"Amit Kumar");

        // Removing an element from the HashMap
        hashmap.remove(3);

        // Displaying the elements of the HashMap
        System.out.println("This is the hashmap : " + hashmap);

        // For Hash-set

        HashSet<Integer> hshset = new HashSet<>();

        // Adding elements to the HashSet
        hshset.add(101);
        hshset.add(201);
        hshset.add(301);
        hshset.add(401);
        hshset.add(501);

        // Removing an element from the HashSet

        hshset.remove(101);

        // Displaying the elements of the HashSet
        System.out.println("This is the hashset : " + hshset);



        
     }
    
}

