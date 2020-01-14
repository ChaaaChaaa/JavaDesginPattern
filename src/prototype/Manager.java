package prototype;

import java.util.HashMap;

public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name, Product proto){
        showcase.put(name,proto);
    }
}
