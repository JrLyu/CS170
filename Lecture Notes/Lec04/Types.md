# Values, Types, and Operators in Java

## Values
<span style="color:red"><font size = 4.5>Every value has a type</font></span>

### `int`: Integers
```java
System.out.println(90);
```
```java
System.out.println(0);
```
```java
System.out.println(-5);
```

### `double`: float point numbers
```java
System.out.println(5.2);
```
```java
System.out.println(1.0);
```
- Important: although `1` and `1.0` is the same mathematically, `1` is a value of type `int`, and `1.0` is a value of type `double`.
```java
System.out.println(-2.5);
```
```java
System.out.println(Math.PI);
```
- Tough the result only returns several digits of pi (around 15 digits), the value of `Math.PI` stored in the computer is larger. 

### `string`: String
```java
System.out.println("hello");
```
```java
System.out.println("Hey you");
```
- Here gives an example of empty string. The result will be just an empty line.
```java
System.out.println("");
```
- The following example is not integer `5`, but the string `"5"`.
```java
System.out.println("5");
```
- Use `\"` we can include quotes in a string. This notation is called escaping the quotes
```java
System.out.println("hello \"stranger\"!!!");
```
- Without escaping the quotes, we will get syntax errors. 
```java
System.out.println("hello "stranger"!!!");
```
- `String` is a Java type name, and `string` is a regular name.

### Object
> An Object is a type composed of multiple values (attributes) and also the definition of operations (methods)
> E.g., a Turtle is an Object
```java
Turtle anna = new Turtle(); // anna is an Object of type (class) Turtle
anna.forward(100); // forward() is a method defined in class Turtle
```

## Operators

### Arithmetic Operators: `+`, `-`, `*`, `/`, `%`

#### Addition
```java
System.out.println(1 + 2); // 3 (int)
```
```java
System.out.println(1.2 + 2.3); // 3.5 (double)
```
```java
System.out.println(1 + 2.3); // 3.3 (double)
```
```java
System.out.println(1.0 + 2); // 3.0 (double)
```

#### Subtraction
```java
System.out.println(1 - 2); // -1 (int)
```
```java
System.out.println(2.5 - 1); // 1.5 (double)
```

#### Multiplication
```java
System.out.println(2 * 3); // 6 (int)
```
```java
System.out.println(2 * 3.5); // 7.0 (double)
```

#### Division
- Integer division
```
int / int = int
```
```java
System.out.println(3 / 2); // 1 (int)
```
```java
System.out.println(5 / 2); // 2 (int)
```
```java
System.out.println(5 / 3); // 1 (int)
```
- Double Division
```
double / double = double
```
```java
System.out.println(5.0 + 2.0); // 2.5 (double)
```
- Double - Integer Division
```
double / int = double
int / double = double
```
*Note: The way Java operate this is to promote the integer to the double, which makes the result double.*
```java
System.out.println(5.0 / 2); // 2.5 (double)
```
```java
System.out.println(5 / 2.0); // 2.5 (double)
```
<font size = 4>Compare</font>

```java
System.out.println(360.0 / 7);
```
```java
System.out.println(360 / 7); 
```

#### Modulo
```java
System.out.println(7 % 2); // 1
```
```java
System.out.println(7 % 3); // 1
```
```java
System.out.println(0 % 4); // 0
```
```java
System.out.println(1 % 4); // 1
```
```java
System.out.println(2 % 4); // 2
```
```java
System.out.println(3 % 4); // 3
```
```java
System.out.println(4 % 4); // 0
```
> If `x % n` is `0`, then `x` is a multiple of `n`
> If `x % n` is always between `0` and `n-1` (always smaller than `n`)

### String Concatenation
#### We use `+` to connect two (or more) strings
```java
System.out.println("hello" + "everyone"); // "helloeveryone"
```
```java
System.out.println("hey" + " you"); // "hey you"
```
```java
System.out.println("hello" + "" + "everyone"); // "hello everyone"
```
```java
System.out.println("hello" + "5"); // "hello5"
```
- If we connect one string and an integer using `+`, we will get: 
```
string + int = string
int + string = string
```
*The way java work here is to promote an integer to a string, which results the final output to be a string.*
```java
System.out.println("hello" + 5); // "hello5"
```
```java
System.out.println(1 + "2"); // "12"
```
```java
System.out.println(1 + 2 + "3"); // "33"
```
*Explanation: As Java reads the code from left to right, it will calculate `1+2` first, which is 3 (int) and then add `3` (int) to `"3"` (string), resulting the final `"33"` (string). If we want to overwrite the order, we need `()`*
```java
System.out.println("1" + 2 + 3); // "123"
```
*Explanation: First calculate `"1" + 2`, which is `"12"`. Then calculate `"12" + 3`, which is `"123"`*
```java
System.out.println("1" + (2 + 3)); // "15"
```
*Explanation: Because the `()`, we will first calculate `2 + 3`, which is `5` (int). Then, `5` (int) is promoted to the string `"1"`.*

#### Length of a String (method)
We use the method `lenght()` to compute the length of a string.
```
"string".length()
```
```java
System.out.println("hello".length()); // 5
```
```java
System.out.println("".length()); // 0
```
```java
System.out.println("hey you".length()); // 7
```
*Note: the space is also a character.*
```java
System.out.println("hey \"you\"".length()); // 9
```
*Similarly, the quotation marks are also characters.*

### Type Conversions
#### `int` $\rightarrow$ `double`
```java
System.out.println(1.0 * 5); // 5.0
```
```java
System.out.println(0.0 + 5); // 5.0
```
- Or, we can use a type cast, which is a direct way to convert the types. 
```java
System.out.println((double)5); // 5.0
```

#### `double` $\rightarrow$ `int`
We will use type cast to convert double to int. However, if double value is not mathematically equal to an integer, we will have information loss. 
```java
System.out.println((int)5.0); // 5 (int)
```
```java
System.out.println((int)5.7); // 5 (int)
```
*Note: anything after the decimal place will be omitted. Or, in other word, the type cast will always round down.*
```java
System.out.println((int)Math.PI); // 3
```

#### `int` or `double` $\rightarrow$ `String`
```java
System.out.println("" + 5); // "5"
```
*Note that we cannot type cast a number to `String`*
```java
System.out.println((String)5); // ERROR
```
```java
System.out.println("" + Math.PI); // "3.14159..."
```
```java
System.out.println("" + "Math.PI"); // "Math.PI"
```

#### `String` to `int`
We can use `Integer.parseInt()` (method) to convert a string to an integer
```
Integer.parseInt("String")
```
```java
System.out.println(Integer.parseInt("5")); // 5 (int)
```
```java
System.out.println(Integer.parseInt("5") + 2); // 7 (int)
```
```java
System.out.println(Integer.parseInt("5" + 2)); // 52 (int)
```
```java
System.out.println(Integer.parseInt("hello5")); // ERROR
```
*If we are trying to convert a string that cannot be converted into an integer, we will get a logic error*

#### `String` to `double`
We can use `Double.parseDouble()` (method) to convert a string to a double
```java
System.out.println(Double.parseDouble("5.7")); // 5.7 (double)
```
```java
System.out.println(Double.parseDouble("5")); // 5.0 (double)
```
```java
System.out.println(Double.parseDouble(Math.PI)); // ERROR
```
*We will get an error here because `Math.PI` is already a double.*
```java
System.out.println(Double.parseDouble("Math.PI")); // ERROR
```
*We will get another error here because `"Math.PI" is a text string, and does not represent any numbers.*

### Operator precedence
We can modify the precedence using parentheses
```java
System.out.println(1 + 2 * 3); // 7
```
```java
System.out.println((1 + 2) * 3); // 9
```
```java
System.out.println(1 + 2 + "3"); // "33"
```
```java
System.out.println(1 + (2 + "3")); // "123"
```