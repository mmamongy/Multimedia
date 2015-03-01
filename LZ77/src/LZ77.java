import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class LZ77 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="" , sub="" , empty=""  ;
		ArrayList<tag> myArr =  new ArrayList<tag>() ;
		System.out.println("Enter the Word you want to compress") ;
	    Scanner cin = new Scanner(System.in);
		//word="ababaabbba";
	    word=cin.next();
		empty = "" ;
		for ( int i=0 ; i<word.length() ; i++) {
			empty+= word.substring(i , i+1);
			if (sub.indexOf(empty)<0 || i==word.length()-1){
				String find = empty.substring(0 , empty.length()-1);
				//System.out.println(empty + " " + find) ;
				tag t1 =  new tag( Math.max( 0 , i-sub.lastIndexOf(find)  - find.length()) , empty.length()-1, empty.charAt(empty.length()-1) );
				empty="" ;
				myArr.add(t1) ;
				sub = word.substring(0 , i+1);
			
				System.out.println("Hello this is compression : " + t1); 

			}
		}
		
		String word2="" ;
		for ( int i=0 ; i<myArr.size() ; i++){
			tag myTag =  new tag(myArr.get(i));
			//System.out.println(myTag.toString()) ;
			//System.out.println("This is decompression : "+ myTag.toString());
			if (myTag.point == 0) {
				word2+= myTag.nextChar ;
				System.out.println(word2); 
			}
			
			else {
				word2+= word2.substring(word2.length()- myTag.point , word2.length()-myTag.point + myTag.len) + myTag.nextChar ;
				//System.out.println(word2);
				
			}
			
		}
		
		System.out.println(word2) ;
		
	}
}
