// Simple exercise to define methods that square & cube a number, and deal with different types.

object calc {
  def square(x: Int): Int = x * x
  def cube(x: Int): Int = x * x * x
}

calc.square(3)
calc.cube(3)

object calc2 {
  def square(x: Int): Int = x * x
  def cube(x: Int): Int = x * x * x

  def square(x: Double): Double = x * x
  def cube(x: Double): Double = x * x * x
}

calc2.square(3.0)
calc2.cube(3.0)