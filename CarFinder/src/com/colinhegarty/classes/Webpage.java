package com.colinhegarty.classes;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Webpage {
	Document doc;
	String title;
	StringBuilder linkList;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Webpage getPage() {
		return page;
	}

	public void setPage(Webpage page) {
		this.page = page;
	}

	Webpage page;

	public Document getSite(String url) throws IOException{
//		url = "http://carzone.ie/search/result/cars";
		page = new Webpage(url);
		doc = Jsoup.connect(page.getWebAddress()).get();
		title = doc.title();
		return doc;
	}
	
	public StringBuilder links(){
		Elements links = doc.select("a[href]");
		linkList = new StringBuilder();
		for(Element link: links){
			linkList.append("\nlink: "+link.attr("abs:href")+"\ntext: "+link.text());
		}
		return linkList;
	}
	
	public String extractEmail(){
		Matcher m = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9_.+-]+\\.[a-zA-Z0-9-.]+").matcher(doc.toString());
		while(m.find()){
			return m.group();
		}
		return "None found";
	}

	
/*	
	public static void main(String[] args) throws IOException {
		String url = "http://carzone.ie/search/result/cars";
		Webpage cars = new Webpage(url);
		Document doc = Jsoup.connect(cars.getWebAddress()).get();
		String title = doc.title();
		System.out.println(title);
		Elements links = doc.select("a[href]");
		StringBuilder linkList = new StringBuilder();
		for(Element link: links){
			linkList.append("\nlink: "+link+"\ntext: "+link.text());
		}
	}
*/

}
