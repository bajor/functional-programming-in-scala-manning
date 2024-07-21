// https://livebook.manning.com/book/functional-programming-in-scala-second-edition/chapter-1/

object ExOneOne extends App {

  /*
    Side effects (examples):
      - Modifying a variable
      - Modifying a data structure in place
      - Setting a field on an object
      - Throwing an exception or halting with an error
      - Printing to the console or reading user input
      - Reading from or writing to a file
      - Drawing on the screen
  */

  /*
    And aren’t there other useful programs that necessitate side effects or mutation?

    How do we write such programs? As we work through this book, we’ll discover how
    many programs that seem to necessitate side effects have some functional analogue.

    In other cases, we’ll find ways to structure code so that effects occur but aren’t
    observable. (For example, we can mutate data that’s declared locally in the body of
    some function if we ensure it can’t be referenced outside that function, or we can
    write to a file as long as no enclosing function can observe this occurring.)
  */

  /*
    A function f with input type A and output type B (written in Scala as a single type,
    A => B, which is pronounced A to B) is a computation that relates every value a of type A
    to exactly one value b of type B such that b is determined solely by the value of a.
    Any changing state of an internal or external process is irrelevant to computing the result f(a).
    
    For example, a function intToSt ring having type Int => String will take every integer
    to a corresponding string. Furthermore, if it really is a function, it will do nothing else.

    Consider the addition (+) function on integers. It takes two integer values and returns an integer
    value. For any two given integer values, it will always return the same integer value. 
  */

  /*
    We can formalize this idea of pure functions using the concept of referential
    transparency (RT). 
    
    This is a property of expressions in general–not just functions. For the purposes
    of our discussion, consider an expression to be any part of a program that can be evaluated
    to a result─anything you could type into the Scala interpreter and get an answer.  For example,
    2 + 3 is an expression that applies the pure function + to the values 2 and 3 (which are also
    expressions). This has no side effect. The evaluation of this expression results in the same value,
    5, every time. 


    An expression e is referentially transparent if for all programs p, all occurrences of e in p can
    be replaced by the result of evaluating e without affecting the meaning of p. A function f is pure
    if the expression f(x) is referentially transparent for all referentially transparent x.5
  */


  // FINISHED HERE:
  // 1.3 Referential transparency, purity, and the substitution model





}
