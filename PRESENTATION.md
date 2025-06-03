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
2. **Append** the length in 64-bit little-endian
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

## Step 4: Process chunks

-- The 512-bit binary chunk is split into 16 blocks of 32 bits (M[g],g∈[0,15])
-- Initialize 64 per-round shift amounts (predetermined) for rotating the binary string (s[i],s∈[0,63])
-- Initialize 64 values for K[i] to add in the algorithm, based on K[i] = floor(2^32 * abs(sin(i+1))), for i∈[0,63]
-- Run 64 rounds of bitwise algorithms
-- **Rounds 1-16**: Function F(B,C,D): (B and C) or (not B and D)
-- **Rounds 17-32**: Function G(B,C,D): (B and D) or (C and not D)
-- **Rounds 33-48**: Function H(B,C,D): B xor C xor D
-- **Rounds 49-64**: Function I(B,C,D): C xor (B or not D)
-- Each round includes a left shift based on s[i]

Psuedocode Example of Round 1:
F = F(B,C,D) + A + K[i] + M[g]
A = D
D = C
C = B
B = B + leftrotate(F, s[i])
(Only one new hex value, the others merely rotate)

## Step 5: Final Output

A = A (0x67452301) + AA (whatever the new A is after the 64 rounds)
B = B + BB
C = C + CC
D = D + DD

-- Mod A,B,C,D to fit 32-bits
-- Make each hex value be represented in little endian
-- Append all (A append B append C append D)
