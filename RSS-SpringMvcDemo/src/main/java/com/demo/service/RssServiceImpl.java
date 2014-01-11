package com.demo.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.springframework.stereotype.Component;

@Component
public class RssServiceImpl implements RssService {

	public String readRSS(String url) {

		String sourseCode = "";
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

					sourseCode += temp + "\n";
				}
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sourseCode;
	}
}
