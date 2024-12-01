package workshop.ManyCarts.models;

import java.util.List;

public class Cart {
    
    private String id;
    private int count;
    private List<Item> items;
    

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public int getCount() {return count;}
    public void setCount(int count) {this.count = count;}

    public List<Item> getItems() {return items;}
    public void setItems(List<Item> items) {this.items = items;}

    
}
