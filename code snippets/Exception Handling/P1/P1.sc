import java.io.IOException
object myExceptions {
  class NegativeNumberException extends RuntimeException
}

object Calculator {
  import myExceptions._

  def div(a: Int, b: Int): Int = {
    if (a < 0 || b < 0) throw new NegativeNumberException
    val result = a / b
    result
  }
}

def tryCatch(a: Int, b: Int): Int = {
  try {
    return Calculator.div(a,b)
  } catch {
    case (e: ArithmeticException) => {
      println("Divide by zero ")
      -1
    }
    case (e: myExceptions.NegativeNumberException) => -2
  } finally {
    // This block will always be invoked
    println("Calculation done!")
  }
}

object Main{
  def main(args: Array[String]) = {
        var division = tryCatch(50,5)
        println("Division = "+division)
        
        println("\n")
        division = tryCatch(50,0)
        println("Division = "+division)
    }
}

