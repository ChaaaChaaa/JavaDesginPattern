package factorymethod.DesignPatterns.idcard;

import java.util.*;

import factorymethod.DesignPatterns.framework.*;


public class IDCardFactory extends Factory {
    private List owners = new ArrayList();

    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }

}
