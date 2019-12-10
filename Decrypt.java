/*
Name: Decrypt
Purpose: Decrypt a ciphertext message.
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

	String print1 = " ";
	for (int count = 0 ; count < alphabet.length () ; count++)
	{
	    for (int index = 0 ; index < keyList.length () ; index++)
	    {
		 print1 = str.replace (chars [index], replace [count]);
	    };
	}
	System.out.println ("coding rocks!");
    }
}
