
// q). Define a class cat & object for each cat in the table provided

// a).

// Define our Cat class
class Cat(val name: String, val colour: String, val food: String) {
  def catProfile: String = "This cat is called " + name + " and their colour is " + colour + " and their favourite food is " + food
}

// Now create objects for each Cat
val oswald = new Cat(name = "Oswald", colour = "Black", food = "Milk")
val henderson = new Cat(name = "Henderson", colour = "Ginger", food = "Chips")
val quentin = new Cat(name = "Quentin", colour = "Tabby and White", food = "Curry")

// q). Directors & Films - We want to know how old a director was when a film was released.

// a).

// Define our Director class
class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {
  def name: String = firstName + " " + lastName
}

// Define our Film class
class Film(val name: String, val yearOfRelease: Int, val imdbRating: Double, val director: Director) {
  def directorsAge(director: Director): Int = yearOfRelease - director.yearOfBirth
  // def copy(name: String = this.name, yearofRelease: Int = this.yearOfRelease, imdbRating: Double = this.imdbRating, director: Director = this.director):
  // Film = new Film(name, yearofRelease, imdbRating, director)
  // Couldn't find this solution (copy), meant using a keyword we haven't explored yet... "this"
}

// Define our new class values
val eastwood = new Director("Clint", "Eastwood", 1930)
val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9, eastwood)

// Let's test our Director class
eastwood.yearOfBirth
// And let's get our answer
outlawJoseyWales.directorsAge(eastwood)

// q). Simple counter. The constructor should take an Int. The meth- ods inc and dec should increment and decrement the counter respec􏰁vely returning a new Counter.

// a).

// Here we want the counter class value to take a new value everytime we perform asc or desc on it. We then then to assign this to a variable to get an output.
class Counter(x: Int) {
  def asc: Counter = new Counter(x + 1)
  def desc: Counter = new Counter(x - 1)
  val count = x
}

// Test our answer.
new Counter(15).asc.asc.asc.desc.count

// q). Now we want the option to pass a scaled asc. or desc. parameter to our counter. If no parameter is specified, default to 1.

// a).

class Counter(x: Int) {
  def asc(y: Int = 1): Counter = new Counter(x + y)
  def desc(y: Int = 1): Counter = new Counter(x - y)
  val count = x
}

// Test answer.
new Counter(15).asc(11).desc(3).asc().count

// q). Build out the counter to include an "adder" from another class value.

class Adder(amount: Int) {
  def add(in: Int) = in + amount
}
// Provided

// Let's define a field 'add10' with class value 10.
val add10 = new Adder(10)

// a).

class Counter(x: Int) {
  def asc(y: Int = 1): Counter = new Counter(x + y)
  def desc(y: Int = 1): Counter = new Counter(x - y)
  val count = x

  // We're taking in a parameter called 'adder' of class Adder & applying it to count.
  def adjust(adder: Adder): Counter = new Counter(adder.add(count))
}

// Test answer - passing our new field of class Adder (add10) into the adjust method.
new Counter(15).adjust(add10).count

// A little tricky / fiddly, this question is more relevant for the next section.