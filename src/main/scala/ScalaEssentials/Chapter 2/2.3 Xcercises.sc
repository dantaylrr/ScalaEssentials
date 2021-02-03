// q). Writing some companion objects using Director & Film examples from 2.1 Xcercises

// a).

// Define our Director class
class Director(val firstName: String, val lastName: String, val yearOfBirth: Int)

// Define apply method to create a new director class
object Director {
  def apply(firstName: String, lastName: String, yearOfBirth: Int): Director = {
    new Director(firstName, lastName, yearOfBirth)
  }

  def older(director1: Director, director2: Director): String = {
    if(director1.yearOfBirth > director2.yearOfBirth) director2.firstName + " " + director2.lastName
    else director1.firstName + " " + director1.lastName
  }
}

// Let's test with some input parameters
Director.apply("Quentin", "Tarantino", 1974).firstName

// Assigning the above to a values

val tarantino = Director.apply("Quentin", "Tarantino", 1974)
val spielberg = Director.apply("Steven", "Spielberg", 1979)

// Let's return the oldest director...

Director.older(tarantino, spielberg)

// I want to return to this question in future & assign companion objects to our Film class as well.