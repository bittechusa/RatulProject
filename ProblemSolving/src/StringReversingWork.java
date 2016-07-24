import java.io.*;
import java.util.*;

public class StringReversingWork {
 public static void main(String[] args) {
  String input="My Name is Ratul";
  StringBuilder stringBuilder = new StringBuilder();
  stringBuilder.append(input);
  stringBuilder=stringBuilder.reverse(); 
  for (int i=0;i<stringBuilder.length();i++)
  System.out.print(""+stringBuilder.charAt(i));  
 }}