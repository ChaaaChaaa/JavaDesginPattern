package factorymethod.HeadFirstDesignPatterns.pizzas;

public class VeggiePizza extends Pizza {
    public VeggiePizza(){
        name = "VeggiPizza";
        dough = "Crust";
        sauce = "Marinara sauce";

        toppings.add("Shredded mozzarella");
        toppings.add("Grated parmesan");
        toppings.add("Diced onion");
        toppings.add("Sliced mushrooms");
        toppings.add("Sliced red pepper");
        toppings.add("Sliced black olives");
    }
}
