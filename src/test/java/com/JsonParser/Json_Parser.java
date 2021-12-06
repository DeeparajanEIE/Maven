package com.JsonParser;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class Json_Parser {
	@Test
	private void read_File() throws Throwable {
		File f = new File("C:\\Users\\dell\\eclipse-workspace\\MavenProject\\src\\test\\java\\com\\payload\\payload.json");
	    FileReader fis=new FileReader(f);
	    JSONParser json=new JSONParser();
	    Object parse = json.parse(fis);
	    JSONObject jobject=(JSONObject)parse;
	    Object object = jobject.get("Name");
	    String string = object.toString();
	    System.out.println(string);
	    
	}

}
