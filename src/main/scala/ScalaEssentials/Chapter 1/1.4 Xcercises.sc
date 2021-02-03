// q). What is the type and value of the following condi􏰁onal?

if(1 > 2) "alien" else "predator"

// a). Type String, Value "predator"... res0: String = predator

// q). What about this is conditional?

if(1 > 2) "alien" else 2001

// a). Conditional if statement, if a particular condition is met, return one value, if not return a different value.
// IMPORTANT NOTE - Notice this returns value type Any, this is due to the conditional statement's output values being of type String & Int. Their closest common ancestor is type Any, a supertype of all scala types, more on this later.