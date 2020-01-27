package factorymethod.headfirstdesignpatterns.pizzas;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza(){
        name =  "PepperoniPizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }
}
