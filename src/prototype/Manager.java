package prototype;

import java.util.HashMap;

class Manager {
    private HashMap showcase = new HashMap();

    void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    Product create(String protoname) {
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }
}
