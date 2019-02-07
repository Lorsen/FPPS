3+2
def abs(x: Double) = if (x<0) -x else x

def isGoodEnough(guess: Double, x: Double) = {
  abs(guess * guess - x) < 0.001
}

def improve(guess: Double, x: Double) = {
  (guess + x / guess) / 2
}

def sqrtIter(guess: Double, x: Double): Double = {
  if(isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess,x), x)
}

def sqrt(x: Double) = {
  sqrtIter(1.0,x)
}

sqrt(2)
sqrt(4)
sqrt(1e-6) //too small
// sqrt(1e60) too big won't run

/*
Too small won't be accurate because good enough value to compare
with is too big.

Too big won't work because it takes too many iterations to reach
good enough value.

 */
