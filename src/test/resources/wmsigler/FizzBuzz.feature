Feature: FizzBuzz program

  Scenario: Executing the program with default parameters
    Given no parameters are specified
    When FizzBuzz is calculated
    Then the first 10 results should be:
      | 1  | 2  | Fizz | 4  | Buzz | Fizz | 7  | 8  | Fizz | Buzz |
    And the last 10 results should be:
      | 91 | 92 | Fizz | 94 | Buzz | Fizz | 97 | 98 | Fizz | Buzz |
