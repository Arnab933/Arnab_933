package DataStructureInJava.HashMapconcept;
import java.util.HashMap;
import java.util.Map;

 class Hashing {
    public static void main(String[] args) {
        // population(value),population(key)
        HashMap<String, Integer> map = new HashMap<>();
        // Insertion
        map.put("India", 120);
        map.put("Us", 30);
        map.put("China", 150);
        // update
        map.put("China", 158);// here the value of china willbe updated if the value doesen't exist then new
        // value added
        System.out.println(map);// output will be unorder like Hash set
        if (map.containsKey("China")) {// here the cointeinsKey() is a boolean method that checks is the key already
            // present or not
            System.out.println("The key is present in the map");
        } else
            System.out.println("The key not present in the map");
        System.out.println(map.get("India"));// get() method returns the value of the keys
        // If the kry dosen't exist in then this mehtod returns null
        System.out.println(map.get("Srilanka"));// null returned
        // Iteration of the Hash map
        for(Map.Entry<String,Integer>e:map.entrySet()){
            /*here at first we convert the map into a set byusing "map.entrtySet()" method that's every element is e 
             *  has two values <String,Integer>.Note that here Entry and Map are two interface 
             * that contains two value(Wrapper type)*/
             System.out.println(e.getKey()+" "+e.getValue());
        }    
    }
}
