package HashMap;

import java.util.HashMap;
// Difination:-
//HashMap stores data in key–value pairs and allows fast access using keys.

//+++++++++++++++++++++++++++++++ time complexity is :- ++++++++++++++++++++++++++++++++++++++++
//put()	O(1)	O(n)
//get()	O(1)	O(n)
//remove()	O(1)	O(n)
//containsKey()	O(1)	O(n)
public class Map_01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("shubham",21);
        map.put("Vivek",17);
        map.put("Deepika",23);
        map.put("Golu",19);
        //System.out.println(map);// this will be print random order ...
        map.remove("Vivek");
        //System.out.println(map);// delelte vivek from the map
        //+++++++++++++++++++++++++ remove() its use for the remove value form the map and also return the value of element +++++++++++++++++++++++
        //System.out.println(map.remove("Golu"));//19
        //System.out.println(map);

        // ++++++++++ How to travers in HashMap +++++++++++++++++++++++++++++++++++++++++++++
        // we can access the all value of my hashSet with the help of key ....
         // if i use for loop for the teaversal in hashMap we use which types of key like string , int
        // First we inslise the type of variable than i use : and write:- map.keySet()

        for(String key : map.keySet()){
            System.out.println(key +" " + map.get(key));// first we print key than i print its value
        }

    }
}
