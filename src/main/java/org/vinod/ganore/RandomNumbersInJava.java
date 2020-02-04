package org.vinod.ganore;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Hello world!
 *
 */
public class RandomNumbersInJava
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        usingRandomUtil();
        usingMathRandom();
        usingThreadLocalRandom();
    }
    public static void usingRandomUtil()
    {
        System.out.println( "Using Random Util method" );
        Random random = new Random();
        for (int i=1;i<10;i++) {
            int num= random.nextInt(100);
            System.out.println("Number is  ------- " + num);
        }

    }

    public static void usingMathRandom()
    {
        System.out.println( "Using Math random method" );
        for (int i=1;i<10;i++) {
           // int num= (int)Math.random();
            System.out.println("Number is  ------- " + Math.random());
        }

    }

    public static void usingThreadLocalRandom()
    {
        System.out.println( "Using ThreadLocal Random method" );
        for (int i=1;i<10;i++) {
            int num= ThreadLocalRandom.current().nextInt();
            System.out.println("Number is  ------- " + Math.random());
        }

    }
}
