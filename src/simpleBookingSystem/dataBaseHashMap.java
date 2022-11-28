package simpleBookingSystem;

import java.util.HashMap;

public class dataBaseHashMap {
    int pizza;
    int burger;
    HashMap<String, Integer> database = new HashMap<String,Integer>();

    public dataBaseHashMap(){
        database.put("pizza",pizza);
        database.put("burger",burger);
    }

    public HashMap getDataBase(){
        return database;
    }

    public void update(String itemName, int quantity){
        database.put(itemName,database.get(itemName)+quantity);
        System.out.println(itemName + database.get(itemName));
    }

    public static void main(String[] args) {

//        dataBaseHashMap newdb = dataBaseHashMap(String,Integer);
        System.out.println();
    }
}
