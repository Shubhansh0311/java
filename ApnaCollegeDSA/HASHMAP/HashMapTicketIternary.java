package HASHMAP;

import java.util.HashMap;

class HashMapTicketIternary {

  public static String returnStart(HashMap<String, String> hm) {
    String str = "";
    HashMap<String, String> revmap = new HashMap<>();

    for (String key : hm.keySet()) {
      revmap.put(hm.get(key), key);
    }
    for (String key : hm.keySet()) {
      if (!revmap.containsKey(key)) {
        return key;
      }
    }

    return null;
  }

  public static void main(String[] args) {
    HashMap<String, String> tickets = new HashMap<>();
    tickets.put("Chennai", "Bengaluru");
    tickets.put("Mumbai", "Delhi");
    tickets.put("Goa", "Chennai");
    tickets.put("Delhi", "Goa");

    String start = returnStart(tickets);

    System.out.print(start);
    for (String key : tickets.keySet()) {
      System.out.print("->" + tickets.get(start));//print the value inside mumbai
      start = tickets.get(start);//value is further moved to other 

    }
    System.out.println();
  }
}
