package behavioural.templatemethod;

import com.webdude.Demonstrator;

import java.util.ArrayList;
import java.util.List;

public class PizzaPlace implements Demonstrator {
    @Override
    public void demonstrate() {
        System.out.println("Started using the pizza");
        List<Pizza> pizzas = new ArrayList<>();

        pizzas.add(new Margarita());
        pizzas.add(new Pepperoni());

        pizzas.forEach(Pizza::prepare);
    }
}
