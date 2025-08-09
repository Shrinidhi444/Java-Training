Problem statement 1:
Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E), and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W into their corresponding Celsius values and print the table.

Note:
Print the floor of the Celsius values if they are non-negative else print its ceil value. 
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= S <= 80
S <= E <=  900
0 <= W <= 40 
Sample Input 1:
0 
100 
20
Sample Output 1:
0   -17
20  -6
40  4
60  15
80  26
100 37


CODE:

import java.util.Scanner;

class Solution{
	public static void main(String args[]){
	scanner sc=new Scanner(System.in);
	int start = sc.nextInt();
	int end = sc.nextInt();
	int n= sc.nextInt();
        			
	for(int i=start;i<=end;i+=n){
	int farentocel=(i-32)*5/9;
	System.out.println(i+" "+ farentocel);
	}
		sc.close();
   }
