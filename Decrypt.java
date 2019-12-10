/*
Name: Decrypt
Purpose: Decrypt a message.
Author: Luca Cataldo
Date: Dec. 5, 2019
*/

import java.io.*;

public class Decrypt
{
    public static void main (String[] args) throws IOException
    {
	BufferedReader keyboardInput = new BufferedReader (new InputStreamReader (System.in));

	System.err.print ("Enter the ciphertext: ");
	String str = (keyboardInput.readLine ());
	
	final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	char[] replace = alphabet.toCharArray (); //Convert string to char array.
	final String keyList = "PHQGIUMEAYLNOFDXJKRCVSTZWB";
	char[] chars = keyList.toCharArray (); //Convert string to char array.

	String printtt = " ";
	for (int count = 0, index = 0 ; count < 26 ; count++,index++)
	{
	    printtt = str.replace (chars [count], replace [index]);
	}
	System.out.println (printtt);
    }
}
