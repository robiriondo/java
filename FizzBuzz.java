/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;
import java.util.*;

/**
 *
 * @author robiriondo
 * Description
 * Write a program that asks for user input for an integer.
Print the numbers from 1 to X (x being user input)
For multiples of 3 print "fizz"
For multiples of 5 print "buzz"
For multiples for 3 AND 5 print "fizzbuzz"

  if (theNumber is divisible by 3) then	--->
	if (theNumber is divisible by 5) then
	print "FizzBuzz"
	else			  <---
	print "Fizz"
  else if (theNumber is divisible by 5) then
	print "Buzz"
  else /* theNumber is not divisible by 3 or 5
	print theNumber
  end if
 **/
public class FizzBuzz {
    public static void main(String[] args){

    int z = input();
    fizzBuzzMethod(z);
    }

    public static int input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to play FizzBuzz");
        int x = in.nextInt();
        System.out.println("Now I will print the numbers from 1 to " +x);
        System.out.println("For multiples of 3 I will print fizz");
        System.out.println("For multiples of 5 I will print buzz");
        System.out.println("For multiples of 3 & 5 I will print fizzbuzz");
        System.out.println("___________________________________________");
        return x;
    }

    public static void fizzBuzzMethod (int x) {
    for(int i = 1; i <= x; i++){
			String test = "";
                        //For Multiples of 3 print fizz
			test += (i % 3) == 0 ? "fizz" : "";
                        //For multiples of 5 print buzz
			test += (i % 5) == 0 ? "buzz" : "";
			System.out.println(!test.isEmpty() ? test : i);
		}
	}
}
