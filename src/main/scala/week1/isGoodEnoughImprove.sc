def abs(x:Double) = if (x < 0) -x else x

def sqrt(x: Double) = {

  def isGoodEnough(guess: Double, x: Double) = {
    //  if(x > 1e4) abs (guess * guess -x ) < 100000000000000.00
    //  else if (x < 1e-3) abs(guess * guess -x ) < .0000000000000000000001
    //  else abs(guess * guess - x) < 0.001
    abs(guess * guess - x) / x < 0.001 // i was thinking in the right way, but just make it proportial to x while using x
  }

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  sqrtIter(1.0, x)
}

sqrt(0.001)
sqrt(1.0e-20)
sqrt(1.0e20)
sqrt(1.0e50)

Math.sqrt(0.001)
Math.sqrt(1.0e-20)
Math.sqrt(1.0e20)
Math.sqrt(1.0e50)


