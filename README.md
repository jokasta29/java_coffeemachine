# Java Project - Coffee Machine :coffee:

This Java project demonstrates the use of the Strategy design pattern to implement different behaviors for a coffee machine.

## Project Structure

The project is organized into several classes:

- `CoffeeMachine`: The main class representing the coffee machine.
- `CoffeeMachineBehave`: An interface defining the behavior of the coffee machine.
- `CoffeeExpresso`, `AddingSugar`, `AddingMilk`, `AddingChocolate`: Classes implementing different coffee machine behaviors.

## How to Run

To run the project, execute the `Test` class, which contains the `main` method. This will demonstrate the coffee machine making various types of coffee with different behaviors.

## Contributing 😄

I'm sharing this project to foster collaboration and knowledge sharing within the coding community. If you have any suggestions, improvements, or feature requests, please feel free to open an issue or submit a pull request. Your contributions will help me enhance my skills and make the project more enjoyable.

## License

This project is licensed under the [MIT License](LICENSE). You are welcome to use, modify, and distribute the code as needed.


Thank you for checking out my coding project on GitHub. I hope you find it engaging and inspiring. Happy coding!

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
