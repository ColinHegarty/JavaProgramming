package com.colinhegarty.classes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class OpenWebpage {
	String url;
	Document doc;
	public OpenWebpage(String url){
		this.url = url;
	}
	
	public void readPage() throws IOException{
		doc = Jsoup.connect(url).get();
	}
	
//	public static void main(String[] args) throws IOException, URISyntaxException{
////		String url = "http://carzone.ie/search/result/cars";
/////*
////		Desktop d = Desktop.getDesktop();
////		d.browse(new URI("http://fit.ie"));
////*/		
////		
//		OpenWebpage wb = new OpenWebpage("http://carzone.ie/search/result/cars");
//		URL	myURL = new URL(wb.url);
//		URLConnection myURLConnection = myURL.openConnection();
//		BufferedReader in = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
//		String inputLine;
//		while((inputLine = in.readLine()) != null){
//			System.out.println(inputLine);
//		}
//		in.close();
//
////
////		Document doc = Jsoup.connect(url).get();
////		
////		
//	}
}
