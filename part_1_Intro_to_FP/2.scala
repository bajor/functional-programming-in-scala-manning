// https://livebook.manning.com/book/functional-programming-in-scala-second-edition/chapter-2

// Higher-order functions are functions that take other functions as arguments
// and may themselves return functions as their output

// A comment!
/* Another comment */
/** A documentation comment */

/*
The object keyword

The object keyword creates a new singleton type, which is like a class
that only has a single named instance.

If you’re familiar with Java, declaring an object in Scala is a lot
like creating a new instance of an anonymous class.

Scala has no equivalent to Java’s static keyword,
and an object is often used in Scala where you might use a class with
static members in Java
 */
object MyProgram:
  def abs(n: Int): Int =
    if n < 0 then -n
    else n

  // private - can't be called from outside MyProgram
  private def formatAbs(x: Int) =
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))

  @main def printAbs: Unit =
    println(formatAbs(-42))

// Finished:
// Listing 2.1 A simple Scala program
