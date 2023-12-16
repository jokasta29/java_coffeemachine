package Coffee;

public class CoffeeMachine {

    private CoffeeMachineBehave coffeeMachineBehave;

    public void setCoffeeMachineBehave (CoffeeMachineBehave coffeeMachineBehave) {
        this.coffeeMachineBehave = coffeeMachineBehave;

    }

    public void makingCoffee() {
        coffeeMachineBehave.makingCoffee();
    }
    
}
