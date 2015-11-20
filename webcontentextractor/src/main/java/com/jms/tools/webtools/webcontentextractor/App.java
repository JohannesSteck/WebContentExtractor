package com.jms.tools.webtools.webcontentextractor;

import java.io.IOException;
import java.util.ArrayList;

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
        ArrayList<String> urlList = new ArrayList<String>();
        urlList.add("http://www.proxy-listen.de/Proxy/Proxyliste.html");
       
        	for(String url : urlList){
        		 try {
        			 Document d = wdr.getWebDocument(url);
        			 System.out.println("Doc:\r\nw"+d.head());
        		 } catch (IOException e) {
        				// TODO Auto-generated catch block
        				e.printStackTrace();
        			}
        	}
		
        
        
        
    }
}
