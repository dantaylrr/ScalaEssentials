# Expressions, Types & Values.

Scala runs or *evaluates* our program. When evaluating a program in the scala console or worksheet we are given two pieces of information:
* The *type* of the program.
* The *value* it evaluates to.

As an example (in the scala console):
```
"Hello World"
// res0: String = Hello World!
```

We can then add what is known as a *method call* to the above code, such as the below:
```
"Hello World!".toUpperCase
// res1: String = HELLO WORLD!
```

Giving us a different return value. "Hello World" is first evaluated, then toUpperCase.

### Compile-time & Run-time.

Two distinct stages that a scala program can go through:

* Compile-time.
* Run-time.

First code is compiled, then if the code is compiled correctly it is run to give us our result. \
**Compilation is a process of checking that a program makes sense**. This can be done in two ways:

* Code is *syntactically* correct.
* Code must *type check* (i.e. you cannot make a number upper case).

**Even though a program compiles correctly it can still fail at run-time**. \
e.g.
```
2 / 0
// java.lang.ArithmeticException: / by zero
// ... 350 elided
```
You cannot divide by 0.

### Definitions.

* Expressions - The program's text or inputs that we, the user, type. They are the main components of a scala program. **Expressions exist at compile-time and are evaluated to a value**.
* Types - Restrictions on our programs that limit how we can manipulate expressions & objects, these again **exist at compile-time**. Examples of these include `String` & `Int`, a full list can be found at the end of this md.
* Values - Are used to compute the programs expressions, values are entities that our programs can pass around & manipulate. **Values exist at run-time**.

### All possible types:

*Expressions have types but values do not*. The simplest way to think of this is to inspect a piece of a computers memory, we cannot say for definite what that particular type value is without seeing the expression that generated it.

There are many many types used in scala, the best source for information I have found is the following:

https://docs.scala-lang.org/tour/unified-types.html#:~:text=Scala%20Type%20Hierarchy&text=AnyVal%20represents%20value%20types.,which%20carries%20no%20meaningful%20information.