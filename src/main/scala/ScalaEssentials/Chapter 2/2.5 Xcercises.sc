// q). Cats example again but with pattern matching for when a cats' favourite food is chips

// a).

case class Cats(name: String, colour: String, food: String)

object chipShop {
  def chips(cats: Cats): Boolean =
    cats match {
      case Cats(nm, cl, "Chips") => true
      case Cats(nm, cl, fd) => false
    }
}

chipShop.chips(Cats("Oswald", "Black", "Chips"))
chipShop.chips(Cats("Oswald", "Black", "Fish"))

// q). Any movie directed by clint eastwood gets a 10, John McTiernan a 7, anyone else a 3

// a).

case class Director(firstName: String, lastName: String)
case class Film(filmName: String, director: Director)

object Critic {
  def rate(film: Film): Double =
  film match {
    case Film(fm, Director(firstName, "Eastwood")) => 10.0
    case Film(fm, Director(firstName, "McTiernan")) => 7.0
    case Film(fm, dir) => 3.0
  }
}

// Let's create an object of class Film & pass it into our method
val outlawJoseyWales = Film("outlawJoseyWales", Director("Clint", "Eastwood"))
Critic.rate(outlawJoseyWales)
Critic.rate(Film("Die Hard", Director("John", "McTiernan")))
Critic.rate(Film("Django", Director("Quentin", "Tarantino")))