// q). Define a class cat & object for each cat in the table provided

// a).

class Cat(val name: String, val colour: String, val food: String) {
  def catProfile: String = "This cat is called " + name + " and their colour is " + colour + " and their favourite food is " + food
}
val oswald = new Cat(name = "Oswald", colour = "Black", food = "Milk")
oswald.catProfile
val henderson = new Cat(name = "Henderson", colour = "Ginger", food = "Chips")
henderson.catProfile
val quentin = new Cat(name = "Quentin", colour = "Tabby and White", food = "Curry")
quentin.catProfile

// q). Directors & Films - We want to know how old a director was when a film was released.

// a).

// Define our Director class
class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {
  def name: String = firstName + " " + lastName
}

// Define our Film class
class Film(val name: String, val yearOfRelease: Int, val imdbRating: Double, val director: Director) {
  def directorsAge(director: Director): Int = yearOfRelease - director.yearOfBirth
}

// Define our new class values
val eastwood = new Director("Clint", "Eastwood", 1930)
val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9, eastwood)

// Let's test our Director class
eastwood.yearOfBirth
// And let's get our answer
outlawJoseyWales.directorsAge(eastwood)