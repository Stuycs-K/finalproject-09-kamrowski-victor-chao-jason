# Dev Log:

This document must be updated daily every time you finish a work session.

## Jason Chao

### 2025-05-19 - Algorithm Research and Next Steps
**In Class**  
 - Found reference articles detailing the MD5 algorithm steps. (15 mins)
 - Created files that contain each individual step, and then a Main that combines it all together. (5 mins)
**At Home**
 - Read the rest of the in-depth article on MD5. (45 mins)

### 2025-05-20 - K Constants
**In Class**  
 - Read the "geeksforgeeks" article. Did not really learn much. (5 mins)
 - Read the Wikipedia article, mainly paying attention to the pseudocode provided. (5 mins)
 - Began testing ways to store K values for the algorithm. (30 mins)
 - Created a `Test.java` file for making helper functions in `Utils.java`. (1 min)
 - Created `MD5_actual.java` which returns correct output for the MD5 hash. (1 min)

### 2025-05-21 - K Constants (continued)
**In Class**  
 - Settled on storing K values as a set of strings in hexadecimal format. (10 mins)
 - Created a helper function that creates a 2D array of Bytes by translating the hex strings. (30 mins)

### 2025-05-23 - K Constants Completed + Starting S Constants
**In Class**  
 - Completed the helper function. Returns a 2D array of Bytes of size 64x4. (35 mins)
 - Started creation of SConstants array. (3 mins)

### 2025-05-28 - Changes to Utils
**In Class**  
 - Updated `makefile` to run properly. (10 mins)
 - Reverted KConstants to String format. (5 mins)

**At Home**  
 - Properly formatted code files and removed errors with `static` method and object calling in other classes. (25 mins)
 - Integrated `BigInteger` into files for Operations 2-4. (20 mins)
 - Updated debug print statements. Prints out ABCD init. vectors in hexadecimal. (15 mins)
 - Created `Op_Final` for the final step after the 4 Operations. (2 mins)
 - Began integrating Operations 2-4 into `Main`, but it did not output the right values for the final hash. Compared code with website source to find the problem, but was unsuccessful. (30 mins)

### 2025-05-29 - Attempts to Fix Problems with Algorithm
**In Class**  
 - Tried to find issue within `Op_One` that was returning incorrect ABCD values, but was unsuccessful (40 mins)
 - Created a branch for myself to test changes and potentially fix the problem. (1 min)

### 2025-06-01 - Fixed Errors, Updated Algorithm, Attempted to Fix Algorithm Miscalculations, and Added Final Step
 - Fixed errors with incorrect variable names. (15 mins)
 - Updated order in which 32-bit substrings are used in the algorithm for rounds 2-4. (10 mins)
 - Noticed that the algorithm is correct up until a certain point. (90 mins)
    - Closer inspection revealed that something goes wrong with the calculation for the new B value in the 14th operation (starting from i=0) of the first round.
    - The rotation value is off by 0x01700000.
    - Was unable to find the source of this issue. Narrowed it down to either an incorrect 32-bit string or something wrong with the left rotation calculation. Will look into it more tomorrow in class.
 - Added the final step after the four rounds of operations. (10 mins)

### 2024-01-03 - Brief description
Expanded description including how much time was spent on task.
