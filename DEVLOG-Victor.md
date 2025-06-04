# Dev Log:

This document must be updated daily every time you finish a work session.

## Victor Kamrowski

### 2025-05-19 - Understand how the md5 algorithm works

In class:
- Read 'The MD5 algorithm (with examples)' linked in README (really long article) (30 mins)
- Decided with Jason how to split separate steps (each step separate java file, e.g. padding first step: padding.java) (10 mins)

At home:
- Finished reading in-depth article, made distinct files for different parts (30 mins)
- (Now have complete understanding of entire md5 algorithm)

### 2025-05-20 - Started first part of md5 algorithm

In class:
- Started Padding.java and turning input strings into hex (40 mins)

### 2025-05-21 - Finished first part of md5 algorithm (padding)

In class:
- Switched padding method from string to hex to string to binary. Continued working on padding method. (40 mins)

At home:
- Made string to binary method (15 mins)
- Made zerosPad method which pads the binary given (as a string) and adds zeros (until a given length) either to the left or right or the message (needed for both ending 64 bits of length and original input) (20 mins)
- Added everything together in pad method, fully complete (15 mins)

### 2025-05-22: Edited makefile and padding, confirmed with testing

At home (no in class had an AP):
- Makefile editing (5 mins)
- Fixing, debugging, and testing (20 mins)

### 2025-05-23/24/25/26: Made base of operation one, edited constants, utils, and added functions as necessary, finished padding 100%

In class:
- Read about using bitwise and hex/decimal/binary ints and conversions (30 mins)
- Made F function (10 mins)

At home:
- Added Padding method for binary string to int (5 mins)
- Finished padding 100% by turning huge binary string into 16 ints (15 mins)
- Edited utils as necessary (10 mins)
- Finished base and all operations of operation one (30 mins)

### 2025-05-27: Made bitwise methods for operations two, three, four, made each operation itself, started putting it all together, debugging

In class:
- Made bitwise operations for operations two, three, and four (20 mins)
- Made each individual operation method with each different bitwise methods (20 mins)

At home:
- Started putting md5 together with all operations (30 mins)
- Switched from int to long, realized has to be unsigned so switched again to BigInteger (20 mins)
- Added other constants and small edits (10 mins)

### 2025-05-28: Continued BigInteger switch, extensive testing

In class:
- Continued switching from longs to BigInteger (15 mins)
- Debugging BigInteger through the first 16 loops of operation one (25 mins)

At home:
- Realized that bitwise not was not properly working, turned bitwise functions into using BigInteger class object functions (20 mins)
- Realized modular addition also didn't work, started editing (10 mins)
- Realized that there was a huge problem within padding, didn't know what (10 mins)

### 2025-05-29: Started reading full md5 documentation to understand what the error is

In class:
- Extensively read the md5 documentation to learn what I was missing in padding. Found out that the various 32 bit snippets from the initial 512 bit block should be little endian, but I implemented big endian (40 mins)

At home:
- Changed from big endian to little endian in padding (20 mins)
- Simplified operation one and deleted many unnecessary lines (15 mins)
- Changed modular addition to take as many inputs as needed (10 mins)
- Created an actual shift method instead of just including in various operations. Used BigInteger methods instead of doing it through annoying bit/binary string manipulations (15 mins)

### 2025-05-30/31/6-1: Implemented little endian hex strings (BigIntegers) into main, fixed errors, fixed final operation, tested final version and works

In class:
- Cleaned the main a decent amount, and instead of looping in the main, used bitScedule method which did it itself in little endian (20 mins)
- Started testing for known test cases and checked all operations for the first operation, seems to work for now (10 mins)
- Added all devlog updates (10 mins)

At home:
- Made string length at end of 512 bit little endian like main string (20 mins)
- Found and fixed erroneous K value that made operation three give wrong values (10 mins)
- Edited all four operations to optimize the algorithm (30 mins)
- Fixed final operation and made method to showcase final hex values properly in little endian as well (20 mins)
- Tested with many different test cases (10 mins)

### 2025-06-02: Started planning presentation and research

In class:
- Planning presentation (25 mins)
- MD5 background research (15 mins)

At home:
- Started presentation.md (20 mins)

### 2025-06-03: Finished presentation.md, fully edited readme, created video script, recorded video

In class:
- Continued to edit presentation.md (30 mins)
- Added resources and edited readme (10 mins)

At home:
- Finished presentation.md (10 mins)
- Wrote script for video, planned video structure, multiple test runs (60 mins)
- Final video + upload and update readme (20 mins)