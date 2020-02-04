package org.vinod.ganore;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Random random = new Random();
        for (int i=1;i<20;i++) {
            int num= random.nextInt(100);
            System.out.println("Number is  ------- " + num);
        }


    }
}
