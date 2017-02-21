package com.colinhegarty.classes;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WebDocTry {

	public static void main(String[] args) throws IOException {
//		String url = "http://carzone.ie/search/result/cars";
		Webpage cars = new Webpage("http://carzone.ie/search/result/cars");
		Document doc = Jsoup.connect(cars.getWebAddress()).get();
		System.out.println(doc);
		doc = Jsoup.parse(cars.getWebAddress());
		
	}

}
