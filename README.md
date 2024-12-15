# Groovy NullPointerException with List.each and Null Input

This example demonstrates a common error in Groovy when using the `each` method with a list that might be null.  The `each` method throws a `NullPointerException` if the list is null.  This repository provides a simple example of the bug and a solution to handle it gracefully.

## Bug

The provided `bug.groovy` file contains a method `myMethod` that iterates over a list of strings. It converts each string to uppercase and prints it. However, if a `null` list is passed to this method, it will throw a `NullPointerException`.

## Solution

The `bugSolution.groovy` file shows a solution using safe navigation (`?.`) to handle the possibility of a null list.  This prevents the exception.

## Usage

1. Clone the repository.
2. Run the `bug.groovy` script to see the exception.
3. Run the `bugSolution.groovy` script to see the solution in action.