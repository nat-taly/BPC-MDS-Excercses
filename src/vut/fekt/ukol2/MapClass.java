package vut.fekt.ukol2;

import java.util.HashMap;

public class MapClass {
    HashMap<Integer, String> hashmap = new HashMap<>();

    public void store(Integer id, String value){
        if (!hashmap.containsKey(id)){
            hashmap.put(id, value);
        } else {
            throw new ArrayStoreException("Already Exists!");
        }
    }

    public String getValue(Integer id) throws NoSuchFieldException {
        if (hashmap.containsKey(id)){
            return hashmap.get(id);
        } else {
            throw new NoSuchFieldException("Does not Exists!");
        }
    }

    public void deleteKey(Integer id) throws NoSuchFieldException {
        if (hashmap.containsKey(id)){
            hashmap.remove(id);
        } else {
            throw new NoSuchFieldException("Does not Exists!");
        }
    }

    public int getSize(){
        return hashmap.size();
    }

    public void print(){
        hashmap.forEach((id, value) -> {
            System.out.print(id + "->" + value + "\n");
        });
    }
}
