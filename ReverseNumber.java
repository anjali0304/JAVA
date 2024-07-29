/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reversenumber;

/**
 *
 * @author IT-15
 */
public class ReverseNumber {

    public static void main(String[] args) 
    {
        int number = 987654,reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
                System.out.println("The reverse of the given number:" + reverse);
    }
}
