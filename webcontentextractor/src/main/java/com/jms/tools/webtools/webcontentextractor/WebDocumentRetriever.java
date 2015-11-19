package com.jms.tools.webtools.webcontentextractor;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;

public class WebDocumentRetriever {

	public Document getWebDocument(String urlString) throws IOException{
		Connection c = HttpConnection.connect(urlString);
			Document result = c.get();
		return result;
	}
	
}
