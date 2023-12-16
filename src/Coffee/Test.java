package Coffee;

import Coffee.AddingChocolate;
import Coffee.AddingMilk;
import Coffee.AddingSugar;
import Coffee.CoffeeMachine;
import Coffee.CoffeeMachineBehave;
import Coffee.CoffeeExpresso;

public class Test {

    public static void main (String[] args) {

        CoffeeMachineBehave coffee = new CoffeeExpresso();
        CoffeeMachineBehave addMilk = new AddingMilk();
        CoffeeMachineBehave addSugar = new AddingSugar();
        CoffeeMachineBehave addChocolate = new AddingChocolate();
        
        

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.setCoffeeMachineBehave(coffee);
        coffeeMachine.makingCoffee();

        coffeeMachine.setCoffeeMachineBehave(addMilk);
        coffeeMachine.makingCoffee();

        coffeeMachine.setCoffeeMachineBehave(addSugar);
        coffeeMachine.makingCoffee();

        coffeeMachine.setCoffeeMachineBehave(addChocolate);
        coffeeMachine.makingCoffee();




    }
    
}
