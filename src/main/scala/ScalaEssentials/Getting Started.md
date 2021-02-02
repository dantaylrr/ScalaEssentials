#Getting Started.

Two ways of using Scala:

1) Through the computer console.
2) Through an IDE such as IntelliJ IDEA. (Already familiar with, so will skip).

###Using the Console.

Let's use an example:

```
scala> 1 + 2 + 3
res0: Int = 6
```

Here, the console responds with 3 things:

* An *identifier* res0 - this can further be referred to in future calculations.
* A *type* Int - determined at compile time.
* A *value* - determined by executing the expression.

If we have scala code in a file, we can use
`:paste`
to paste the contents of the file into the console to be executed.

Using a file named 
`example.scala`, we can do the following:

```
scala> :paste example.scala
Pasting file example.scala...
res0: Int 6
```

The `:type` command can tell us the type of the expression we want to run without actually executing the code.

