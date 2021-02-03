// q). Writing some companion objects using Director & Film examples from 2.1 Xcercises

// a).

// Define our Director class
class Director(val firstName: String, val lastName: String, val yearOfBirth: Int)

// Define apply method to create a new director class
object Director {
  def apply(firstname: String, lastName: String, yearOfBirth: Int): Director =
    new Director(firstname, lastName, yearOfBirth)
}

// Let's test with some input parameters
Director.apply("Quentin", "Tarantino", 1974).firstName