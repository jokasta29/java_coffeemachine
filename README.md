# Java Project - Coffee Machine :coffee:

This Java project demonstrates the use of the Strategy design pattern to implement different behaviors for a coffee machine.

## Project Structure

The project is organized into several classes:

- `CoffeeMachine`: The main class representing the coffee machine.
- `CoffeeMachineBehave`: An interface defining the behavior of the coffee machine.
- `CoffeeExpresso`, `AddingSugar`, `AddingMilk`, `AddingChocolate`: Classes implementing different coffee machine behaviors.

## How to Run

To run the project, execute the `Test` class, which contains the `main` method. This will demonstrate the coffee machine making various types of coffee with different behaviors.

## Class Diagram

```mermaid

classDiagram
  class CoffeeMachine {
    +setCoffeeMachineBehave(CoffeeMachineBehave)
    +makingCoffee()
  }

  class CoffeeMachineBehave {
    +makingCoffee()
  }

  class CoffeeExpresso {
    +makingCoffee()
  }

  class AddingSugar {
    +makingCoffee()
  }

  class AddingMilk {
    +makingCoffee()
  }

  class AddingChocolate {
    +makingCoffee()
  }


  CoffeeMachine <|-- CoffeeMachineBehave
  CoffeeMachineBehave <|-- CoffeeExpresso
  CoffeeMachineBehave <|-- AddingSugar
  CoffeeMachineBehave <|-- AddingMilk
  CoffeeMachineBehave <|-- AddingChocolate