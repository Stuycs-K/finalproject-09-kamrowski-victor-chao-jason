# The MD5 Algorithm

---

## What is MD5?

-- **MD5 (Message Digest 5)** is a cryptographic (for the means of security) hash function
-- MD5 takes any length input and converts it into a **16-byte/128-bit** hash (in hex)
-- It is used for verifying file and data integrity, password storage, and digital signatures
-- However, MD5 is old and not secure. It is susceptible to collision attacks (finding two inputs that give the same output)

---

## MD5 Process Overview

1. **Pad** the message
2. **Append** the length in 64-bit little endian
3. **Initialize** the 4 hash buffers
4. **Process** the 512-bit chunks
5. **Output** the 128-bit hash

--- 

## Step 1: Message Padding

-- Turn inputted string into binary
-- Append a '1' to end of string binary
-- After, pad with '0's until length of 448 bits is reached

## Step 2: Append Length

-- Append **64-bit little-endian** of input length in binary
-- New message length is 512 bits

## Step 3: Initialize Buffers

-- Initialize the 4 32-bit buffers: A = 0x67452301, B = 0xEFCDAB89, C = 0x98BADCFE, D = 0x10325476

-- These values are updated each operation round

## Step 4: 