/*
 
Problem Statement
Given two numbers m and n, multiply them using only "addition" operations.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Multiply() that takes the integer M and N as a parameter.

Constraints:
1 ≤ T ≤ 100
0 ≤ M, N ≤ 100
Output
Return the product of N and M.
 */

 static int  Multiply_by_recursion(int M, int N) 
    { 
         if(M==0 || N==0){
             return 0;
            }
              else{
              return M+Multiply_by_recursion(M,N-1);
            }
   
    }