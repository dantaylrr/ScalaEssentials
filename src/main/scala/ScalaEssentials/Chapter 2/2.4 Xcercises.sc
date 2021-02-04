// q). Define a case class for the Cats in the previous example

// a).

// Define our case class
case class Cat(name: String, colour: String, food: String) {

}
// New value of class Cat for Oswald
val ozzy = Cat("Oswald", "Black", "Milk")

// q). Reimplement Adder + Counter as a case class, using copy where appropriate. Additionally, initialise count to a default value of 0.

// a).

// Define our case class for Adder
case class Adder(amount: Int = 0) {
  def apply(in: Int): Int = in + amount
}
// Define case class for Counter
case class Counter(x: Int = 0) {
  def asc(y: Int = 1): Counter = Counter(x + y) // Important note here, we could have (and probably should for the basis of this exercise)
  def desc(z: Int = 1): Counter = Counter(x - z) // used case class' built in .copy() method... i.e. asc(y: Int = 1) = copy(x = x + y)
  val count = x

  def copy(adder: Adder): Counter = Counter(adder.apply(count))
}
// Recreating original counter with a default class value of 0, default method values of 1
Counter().asc(4).desc(20).asc().count
// Recreating "copy" method using a case class
Counter().copy(Adder(10)).count