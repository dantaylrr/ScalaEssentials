// q). Model cases for cats, lions, tigers & panthers under the trait Feline.

// a).

trait Feline {
  def colour: String
  def sound: String
}

case class Cat(colour: String, food: String) extends Feline {
  val sound = "Meow"
}
case class Tiger(colour: String) extends Feline {
  val sound = "Roar"
}
case class Lion(colour: String, maneSize: Int) extends Feline {
  val sound = "Roar"
}
case class Panther(colour: String) extends Feline {
  val sound = "Roar"
}
// Here I included the sound in the constructor with defaults - modified as a value so the user
// doesn't have the option to alter the sound value

val Ozzie = Cat(colour = "Black", food = "Chips")
val Simba = Lion("Orange", 4).sound