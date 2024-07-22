// https://livebook.manning.com/book/functional-programming-in-scala-second-edition/chapter-2

// Higher-order functions are functions that take other functions as arguments and may themselves return functions as their output


// A comment!
/* Another comment */
/** A documentation comment */
object MyProgram:
  def abs(n: Int): Int =
    if n < 0 then -n
    else n
 
 
  private def formatAbs(x: Int) =
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
 
 
  @main def printAbs: Unit =
    println(formatAbs(-42))

// Finished:
// Listing 2.1 A simple Scala program
