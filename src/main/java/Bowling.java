import java.util.HashMap;
import java.util.Map;

public class Bowling {


    HashMap<String, Integer> players = new HashMap<String, Integer>();

    Bowling() {



        players.put("Victor", 57);
        players.put("John", 56);
        players.put("Amy", 100);
        players.put("Jerry", 101);
        players.put("Bob", 89);
    }

    //your code goes here

    // Alternative solution
    public void getWinner() {
        Map.Entry<String,Integer> maxEntry =null;
        for (Map.Entry<String,Integer> entry: players.entrySet()){
            if( maxEntry==null || entry.getValue() > maxEntry.getValue()){
                maxEntry =entry;
            }

        }
        System.out.println(maxEntry.getKey());

        System.out.println(maxEntry);




    }
}
