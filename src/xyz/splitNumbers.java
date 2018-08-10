package xyz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class splitNumbers {
	public static void main(String[] args) {
		String a="abcd1234";
		Pattern pattern = Pattern.compile("\\w+([0-9]+)\\w+([0-9]+)");

		Matcher matcher = pattern.matcher(a);
		for(int i = 0 ; i < matcher.groupCount(); i++) {
		  matcher.find();
		  System.out.println(matcher.group());
		}
	}
}
