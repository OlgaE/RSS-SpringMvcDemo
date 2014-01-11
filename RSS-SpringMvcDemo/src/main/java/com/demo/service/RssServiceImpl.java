package com.demo.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RssServiceImpl implements RssService {

	public List<String> readRSS(String url) {

		List<String> feedList = new ArrayList<String>();
		try {
			URL rssURL = new URL(url);
			BufferedReader in = new BufferedReader(new InputStreamReader(
					rssURL.openStream()));

			String line;
			while ((line = in.readLine()) != null) {
			
				if (line.contains("<title>")) {
					int firstPos = line.indexOf("<title>");
					String temp = line.substring(firstPos);
					temp = temp.replace("<title>", "");

					int lastPos = temp.indexOf("</title>");
					temp = temp.substring(0, lastPos);

					feedList.add(temp);
				}
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return feedList;
	}
}
