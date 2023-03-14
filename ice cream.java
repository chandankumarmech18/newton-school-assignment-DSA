/*
<---Question--->
Problem Statement
Sara is fond of ice cream initially she had N ice creams with her. If Sara eats exactly half of the ice cream she has in a day and the remaining icecreams get tripled each night. How many ice creams does Sara have at the end of D-days?
Note:-
Take the floor value while dividing by 2.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Icecreams() that takes integers N and D as parameters.

Constraints:-
1 <= N <= 100
1 <= D <= 20
Output
Print a single integer denoting the number of ice creams at the end of D days.
Example
Sample Input 1:-
5 1

Sample Output 1:-
9

Explanation:-
Sara will eat 2 ice creams and the remaining 3 will be tripled i. e 9.

Sample Input 2:-
5 3

Sample Output 2:-
24

Explanation:-
Day 1:- N=5, eaten = 2, rem = 3 => remaining = 3*3 = 9
Day 2:- N=9, eaten = 4, rem = 5 => remaining = 5*3 = 15
Day 3:- N=15, eaten = 7, rem = 8 => remaining = 8*3 = 24
*/

static void Icecreams (int N, int D){
//Enter your code here
for(int i=1;i<=D;i++){
    N=N-(N/2);
    N*=3;
}
System.out.println(N);
}