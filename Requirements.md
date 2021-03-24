# The Number Mapper

A programm that maps an positive arabic numbers into the wished number format.
Supported formats are:

* romanian numbers
* binary numbers
* octal numbers
* hexadecimal numbers

## Mapping examples for romanian numbers

0 = No Literal at all => we will display nothing ("")  
1 = I  
4 = IV
5 = V
9 = IX  
10 = X
40 = XL
49 = IL
50 = L  
90 = XC
99 = IC
100 = C
400 = CD
490 = XD
499 = ID
500 = D
900 = CM
990 = XM  
999 = IM
M = 1000  

The resulting value gets achieved by addition.  
762 = 500 + 100 + 100 + 50 + 10 + 1 + 1 => DCCLXII

## Mapping example for octal numbers (base 8)

0 = 0  
1 = 1  
2 = 2  
...  
7 = 7  
8 = 10  
9 = 11  
..  
15 = 17  
16 = 20  

## Mapping examples for binary numbers (base 2)

0 = 0  
1 = 1  
2 = 10  
3 = 11  
4 = 100  
5 = 101  
...  
8 = 1000  
16 = 10000  
20 = 10100  
25 = 11101

## Mapping example for hexadecimal numbers (base 16)

0 = 0  
1 = 1  
2 = 2  
...  
9 = 9  
10 = A  
11 = B  
...  
15 = F  
16 = 10  
20 = 14 => 1 * 16 + 4  
26 = 1A => 1 * 16 + 10
