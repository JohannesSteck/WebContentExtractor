package com.jms.tools.webtools.webcontentextractor;

import java.io.IOException;

import org.jsoup.nodes.Document;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        WebDocumentRetriever wdr = new WebDocumentRetriever();
        try {
			Document d = wdr.getWebDocument("http://www.proxy-listen.de/Proxy/Proxyliste.html");
		
        System.out.println("Doc:\r\nw"+d.html());
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}
