package com.mycompany;

/**
 * Hello world!
 *
 */
public class MyApp3 
{
    public static void main( String[] args )
    {
		MagicBuilder myMagicBuilder = new MagicBuilder();
		MessageBuilder myMessageBuilder = new MessageBuilder();
        System.out.println( "Hello World!" + "--" + myMagicBuilder.getLucky() + "--" + myMessageBuilder.getNumber10() );
    }
}
