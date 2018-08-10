package xyz;

import java.io.*;
public class ReadFromFile2
{
  public static void main(String[] args)throws Exception
  {
  // We need to provide file path as the parameter:
  // double backquote is to avoid compiler interpret words
  // like \test as \t (ie. as a escape sequence)
  File file = new File("/home/ttuser10/Desktop/RegressionLogs");
 
  BufferedReader br = new BufferedReader(new FileReader(file));
 
  String st;
  while ((st = br.readLine()) != null)
    System.out.println(st);
  }
}