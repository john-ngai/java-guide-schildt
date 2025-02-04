# Chapter 2 Self Test: Introducing Data Types and Operators

1. Why does Java strictly specify the range and behavior of its primitive types?

   To ensure portability across platforms.

2. What is Java’s character type, and how does it differ from the character type used by some
   other programming languages?

   Java's character type is `char`. These character types are Unicode. Whereas many other programming languages use
   ASCII.

3. A `boolean` value can have any value you like because any non-zero value is true. True or False?

   False. A `boolean` value can only be either `true` or `false`.

4. Given this output,

    ```shell
    One
    Two
    Three
    ```

   using a single string, show the `println()` statement that produced it.

    ```java
    System.out.println("One\nTwo\nThree");
    ```

5. What is wrong with this fragment?

    ```
    for(i = 0; i < 10; i++) {
        int sum;
        sum = sum + i;
    }
    System.out.println("Sum is: " + sum);
    ```

   Two issues:

    - `sum` is declared and initialized on each loop iteration. As a result, value of `sum` will reset on each loop
      instead of incrementing.
    - Since `sum` is declared within the scope of the loop, it won't be accessible from the parent scope, where the
      `println` method is being called.

6. Explain the difference between the prefix and postfix forms of the increment operator.

   When the increment is prefixed to the operand, the reassignment is performed prior to obtaining the operand's value.
   Therefore, the value of the operand will be read as operand plus one. Whereas, when the increment operator is
   postfixed, the reassignment is performed after obtaining the operand's value.

7. Show how a short-circuit AND can be used to prevent a divide-by-zero error.

    ```
    int a = 10;
    int b = 0;
    
    if ((b != 0) && (a / 0)) {
      // ...
    } 
    ```

8. In an expression, what type are `byte` and `short` promoted to?

   `int`

9. In general, when is a cast needed?

   When converting between incompatible types or when a narrowing conversion occurs.

10. Write a program that finds all of the prime numbers between 2 and 100.

    - [PrimeNumbers.java](PrimeNumbers.java)

11. Does the use of redundant parentheses affect program performance?

12. Does a block define a scope?
