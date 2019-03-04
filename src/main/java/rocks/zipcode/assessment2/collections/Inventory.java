package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {

    HashMap<String, Integer> storeInventory;

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        storeInventory = new HashMap<>();
        for(String ele: strings){
            addItemToInventory(ele);
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        storeInventory = new HashMap<>();

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        Integer currentAmount = getItemQuantity(item);
        currentAmount++;
        storeInventory.put(item, currentAmount);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {

        Integer currentAmount = getItemQuantity(item);
        currentAmount--;
        storeInventory.put(item, currentAmount);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        Integer retVal = 0;
        if(storeInventory.get(item)!=null ) {
           retVal = storeInventory.get(item);
        }

        return retVal;
    }
}
