import java.util.*;

public class HashTable {
  public static void main(String[] args) {
    HashMap<String, String> table = new HashMap<>(13);
    table.put("229", "Bob");
    table.put("721", "Mack");
    table.put("182", "Amar");
    table.put("193", "John");
    table.put("124", "Mike");
    table.put("165", "Garry");
    for (String  key : table.keySet()) {
      System.out.println(" HashCode: "+key.hashCode()+  " Index: "+key.hashCode()%13+ " key: "+ key + " Value: " + table.get(key));
    
    }

  }
}
