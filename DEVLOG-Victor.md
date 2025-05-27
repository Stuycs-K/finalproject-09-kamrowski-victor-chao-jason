# Dev Log:

This document must be updated daily every time you finish a work session.

## Victor Kamrowski

### 2025-05-19 - Understand how the md5 algorithm works

In class:
Read 'The MD5 algorithm (with examples)' linked in README (really long article) (30 mins)
Decided with Jason how to split separate steps (each step separate java file, e.g. padding first step: padding.java) (10 mins)

At home:
Finished reading in-depth article, made distinct files for different parts (30 mins)
(Now have complete understanding of entire md5 algorithm)

### 2025-05-20 - Started first part of md5 algorithm

In class:
Started Padding.java and turning input strings into hex (40 mins)

### 2025-05-21 - Finished first part of md5 algorithm (padding)

In class:
Switched padding method from string to hex to string to binary. Continued working on padding method. (40 mins)

At home:
Made string to binary method (15 mins)
Made zerosPad method which pads the binary given (as a string) and adds zeros (until a given length) either to the left or right or the message (needed for both ending 64 bits of length and original input) (20 mins)
Added everything together in pad method, fully complete (15 mins)

### 2025-05-22: Edited makefile and padding, confirmed with testing

At home (no in class had an AP):
Makefile editing (5 mins)
Fixing, debugging, and testing (20 mins)

### 2025-05-23/24/25/26: Made base of operation one, edited constants, utils, and added functions as necessary, finished padding 100%

In class:
Read about using bitwise and hex/decimal/binary ints and conversions (30 mins)
Made F function (10 mins)

At home:
Added Padding method for binary string to int (5 mins)
Finished padding 100% by turning huge binary string into 16 ints (15 mins)
Edited utils as necessary (10 mins)
Finished base and all operations of operation one (30 mins)
