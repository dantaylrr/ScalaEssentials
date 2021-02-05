// Using Polymorphism first.

// In a previous exercise we defined the Feline trait in the following way...

sealed trait Feline
final case class Lion() extends Feline
final case class Tiger() extends Feline
final case class Panther() extends Feline
final case class Cat(favouriteFood: String) extends Feline

// Now let's implement a method using both polymorphism & pattern matching.
// Our method, called dinner, will return the appropriate food for each Feline in question... favourite foods inferred below.

// We should represent this as a type, Food.

sealed trait Food
case object Antelope extends Food
case object TigerFood extends Food
case object Licorice extends Food
// We need to define a constructor for a cats' favourite food, as there are 3 different cats... Hence using case class.
final case class CatFood(favourite: String) extends Food

// Now return to our Feline trait and define methods to return the correct food depending on the sub-class.
sealed trait Feline {
  def Dinner: Food
}
final case class Lion() extends Feline {
  def Dinner: Food = Antelope
}
final case class Tiger() extends Feline {
  def Dinner: Food = TigerFood
}
final case class Panther() extends Feline {
  def Dinner: Food = Licorice
}
final case class Cat(favouriteFood: String) extends Feline {
  def Dinner: Food = CatFood(favouriteFood)
}

// Now we can test.
val Ozzie = Cat("Chips")
Ozzie.Dinner
val Simba = Lion()
Simba.Dinner

// Now we can try using Pattern Matching.

// We have two options here. We can implement our code in a single method on Feline.
// Or we can implement it in a method on another object.

// 1a). Both answers assume that the Food trait has already been defined.

sealed trait Feline {
  def dinner: Food =
    this match {
      case Lion() => Antelope
      case Tiger() => TigerFood
      case Panther() => Licorice
      case Cat(favouriteFood) => CatFood(favouriteFood)
    }
}

// 2a).

case object Dinner {
  def dinner(feline: Feline): Food =
    feline match {
      case Lion() => Antelope
      case Tiger() => TigerFood
      case Panther() => Licorice
      case Cat(food) => CatFood(food) // notice we call the input from the Food trait here, not Feline
    }
}