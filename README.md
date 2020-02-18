# Langstons Ant

Langton's ant is a two-dimensional universal Turing machine with a very simple set of rules but complex emergent behavior.

## Kata

    Squares on a plane are colored variously either black or white. We arbitrarily identify one square as the "ant". The ant can travel in any of the four cardinal directions at each step it takes. The "ant" moves according to the rules below:

At a white square, turn 90° right, flip the color of the square, move forward one unit
At a black square, turn 90° left, flip the color of the square, move forward one unit
Langton's ant can also be described as a cellular automaton, where the grid is colored black or white and the "ant" square has one of eight different colors assigned to encode the combination of black/white state and the current direction of motion of the ant.

## Running Tests

To execute the tests either run `./gradlew test`, `mvn test` or run the tests from the IDE you are using

## Test Libraries Available from the Get-Go
- JUnit 5.5.2

This code was initially written by myself and Mattia Battiston, and was heavily written in a TDD style. 
