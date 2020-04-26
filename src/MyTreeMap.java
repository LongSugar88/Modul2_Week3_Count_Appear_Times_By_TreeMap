import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    static Map mySort(String myString){
        String myNewString = myString.toUpperCase();
        Map<String, Integer> myMap = new HashMap<>();

        for(int i=0; i<myNewString.length(); i++){
            String element = "";
            int count = 1;
            element += myNewString.charAt(i);
            if(myMap.containsKey(element)){
                count++;
                myMap.put(element, count);
            } else {
                myMap.put(element, count);
            }
        }
        Map<String, Integer> myTree = new TreeMap<>(myMap);
        return myTree;
    }

    public static void main(String[] args) {
        String myString = "LongSugarSoHandsome";
        System.out.println(mySort(myString)+ "\n");
    }
}
