//ex:4
// Circular Prime Number
/*
    Aim:Develop a program to accept +ve number N and Check whether it's a circular prime or not

    Algorithm:
    1.  Start
    2.  Input n
    3.  if(n<0) then print"INVALID INPUT" and goto step 18
    4.  Initialize isCircularPrime as true 
    5.  Call the method isPrime(n) and if it returns ture then print n
    6.  Call the method getDigitCount(n) and assign in digitcount
    7.  divisor = 10^digitCount -1 
    8.  n2 = n
    9.  Set a loop i from 1 to digitCount -1 and repeat steps 11 to 15
    10. t1 = n2/divisor
    11. t2 = n2%divisor
    12. n2 = t2 * 10 +t1
    13. Print n2
    14. Call the method isPrime(n) and if it returns false then isCircularPrime = false and break
    15. else isCircularPrime = false
    16. if(isCircularPrime) then print n is a Circular prime
    17. Else print n is not a circular prime
    18.stop

    isPrime(int num)
    1. c = 0
    2. set a loop i from 1 to num and repeat steps 3 and 4 
    3. if(num % i == 0) then c+=1
    4. i+=1
    5. if(c == 2) return true else return false

    getDigitCount(int num)
    1. c=0
    2. Repeat steps 3 and 4 till n != 0
    3. c+=1
    4. n/=10
    5. return c
*/
import java.util.*;
public class circular_prime_number {
    
}
