// q). A traffic light is red, green, or yellow. Translate this description into Scala code.

// a).

// A traffic light "is-a" red, green "or" yellow. We can identify this as a Sum type pattern.

sealed trait trafficLight {
  def Red: Int
  def Green: Int
  def Yellow: Int
}

case object redLight extends trafficLight {
  val Red = 1
  val Green = 0
  val Yellow = 0
}
case object greenLight extends trafficLight {
  val Red = 0
  val Green = 1
  val Yellow = 0
}

case object yellowLight extends trafficLight {
  val Red = 0
  val Green = 0
  val Yellow = 1
}

// Simple test, not much practical use but we can check each colour for a 1 to categorise lightA whilst maintaining trait and class types.
val lightA: trafficLight = greenLight
lightA.Green

// Looks like I may have gone a bit too in-depth here defining objects + fields according to the solution.

// q). A calculation may succeed (with an Int result) or fail (with a String message).

// a).

// The calculation "has-a" succession state "or" a failure state.

sealed trait Calculator
final case class Success(x: Int) extends Calculator {
  def succeeded(x: Int): Int = x
}
final case class Failure(y: String) extends Calculator {
  def failed(y: String): String = "This has failed."
}

// Intuitively, this is how I would answer the question & receive an output, not sure my methods work here but bulk of the answer is correct.