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
    // method simply returns the value of its right-hand side,
    // so we don’t need a return keyword.

  // private - can't be called from outside MyProgram
  private def formatAbs(x: Int) =
    // val keyword is an immutable variable.
    // Scala supports declaring mutable variables with the var
    // keyword, though val is used more frequently.
    val msg = "The absolute value of %d is %d"

    msg.format(x, abs(x))

  // printAbs method is an outer shell that calls into our purely
  // functional core and prints the answer to the console.
  // We’ll sometimes call such methods procedures (or impure functions),
  // rather than functions, to emphasize the fact that they have
  // side effects.
  @main def printAbs: Unit =
    println(formatAbs(-42))
  // Unit serves a similar purpose to void in programming languages like C and Java.

// Finished:
// 2.2 Objects and namespaces



