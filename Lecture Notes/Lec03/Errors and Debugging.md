---
marp: true
paginate: true
theme: default
size: 16:9

---
# Errors and Debugging

---
# Does my program work?
- It's very difficult to prove mathematically that a program works as expected
    - There are advanced formal techniques used in very sensitive applications (flight controllers, medical devices, ...)
- Instead, we try the program with a representative set of inputs and check the results: **Testing**.

---
# Testing
- Try all the examples that are given to you with the problem
- Think of edge cases or extreme cases: zero, smallest or biggest possible values, boundaries of conditional statements, beginning and ending values in loops, etc. 
- It is helpful to write your test cases even before writing the code.
    - It helps you understand the problem better.
- Test your code often while you program
    - Incrementally test and fix partial program

---
# Errors
- Syntax errors (compile-time errors)
    - The code doesn't compile nor execute
    - Relatively easy to find and fix
    - Read the system messages
    - Often the error is in the line before the line the system indicates
-Logical errors (execution errors, run-time errors)
    - The code executes, but it does not work as expected
    - The program may crash
    - The program may never end (infinite loops)
    - The program may give incorrect results

---
# Debugging Steps
- Reproduce the problem
    - Find the input values that trigger the problem
    - What is the program supposed to do? (expected output)
    - What is the program doing instead? (real output)
- Examine the program behavior for that input
    - Code tracing
    - Visualize the internal state of the program with temporary print statements
- Fix only one thing at a time
    - Changing many things at the same time will get you out of control
- Retest all your test cases
    - Your fix might have broken something else
- Clean up your code
    - Remove all temporary print statements, temporary variables, breaks, etc. 