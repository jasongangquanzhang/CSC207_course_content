# Instructions

Implement a `Player` class in a file called Player.java according to the requirements below. To submit, upload your Player.java file to MarkUs.

Note 0: **DO NOT ASK (OR ANSWER) PUBLIC QUESTIONS ON PIAZZA ABOUT THE CONTENT OF THIS ASSESSMENT OR THE QUERCUS QUIZ COMPONENT**

Note 1: **The self-tests included here and on MarkUs are only a subset of the tests which we will run
when grading your code.**

Note 2: Do NOT modify any of the other provided files, as you will only be submitting `Player.java`,
which will be run on MarkUs using the original copies of the other files from the starter code. Feel free
to write additional tests in the provided `PlayerTests.java` file.

Note 3: The provided code is intentionally very incomplete and is not intended to represent a fully functional game, but rather serves
to give a domain for us to write some java code in.

Note 4: Make sure to read the "important notes" section at the bottom of this readme, as it highlights
that you really only need to satisfy the given specification and so you shouldn't find any need to ask us to
clarify any weird edge cases.

## `Player` specification
The class should have **two private instance attributes**:
- an `int` called `num` and a `String` called `name`.

The class should have **two public constructors** defined as follows:
- One will have no arguments and will assign a value of "X" to `name`. `num` should be left with its default value.
- The other will have two arguments, a `String` and an `int` (in that order). These should be assigned to the two private instance variables.

The `toString` method should be overridden so that it returns the value of `name`.

The class must contain a public setter method for `name`, called `setName`.

The `num` variable must have a public getter method, called `getNum` that returns the value of `num`. (Note: this `num` value won't be used anywhere else in the code.)

The class must also contain a public method called `countMoves` that accepts a `List` of `Board` objects and returns an `int` indicating how many moves have been made by `name` on the given boards.
- Note 1: you can tell which player made a given move by checking if that given move starts with `name` (refer to the `Board` class for how moves are being stored).
- Note 2: for example, if a player's `name` is "X" and this method is called with a list of two boards in which "X" has made 1 move on the first board and 2 moves on the second board, then 3 would be returned (i.e. 1 + 2).

Lastly, the class must contain a public, static method called `hasLine` that accepts a two-dimensional character array (i.e. `char[][]`) as its first argument and a `char` as its second argument.
The first argument represents an n-by-n grid of symbols, each of which is either 'X', 'O', or '-'. The second argument is either 'X' or 'O'.
This method should return `true` if the second argument appears in a complete line in any row, column, or main diagonal of the first argument.
That is, it returns `true` if the second argument forms a line of length `n` in the given n-by-n grid. Otherwise, it should return `false`.

### Important notes
Your code must NOT do anything to attempt to validate moves, board states, or any other inputs to the methods. **You only need to complete the
code as specified above.**

If you find yourself asking "but what if variable x takes on value y?" then that is almost certainly not a case we'll be testing.
**We'll only be testing that your code works as indicated above, so any weird edge cases won't be tested.**

A few examples:
- note that a player's name will be either "X" or "O" when `countMoves` is called, since anything else would be weird.
- `countMoves` doesn't need to check the validity of the moves present in any of the given `Board` objects, since it should be assumed that the boards will be valid.
- all grids passed into `hasLine` are at least 2-by-2 grids (we didn't specify what would happen if the grid was empty, so we wouldn't test that case).
- all grids passed into `hasLine` will only contain the three characters as indicated above.