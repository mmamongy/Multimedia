import java.util.*;
	import java.util.HashMap;

public class myMain {
		public static void main(String[] args) { 
			String txt;
			String ss ; 
			// for testing  ("01000100100010101101101110") --> ("abaababaabbccda")
			float freq=0 ;
			ArrayList<Node> arr = new ArrayList<Node>();
			Scanner cin = new Scanner (System.in) ; 
			txt= cin.nextLine();
			ss = txt ;
			for ( int i=0 ; i<txt.length() ; i++) {
				freq=0 ;
				for ( int j=0 ; j<txt.length() ; j++) {
					if (txt.charAt(i)==txt.charAt(j) && txt.charAt(i)!='\0')
						freq++;
				}
				if (txt.charAt(i)!='\0'){
				freq = freq / txt.length();
				Node n = new Node( "" + txt.charAt(i) ,freq , "" , null , null);
				arr.add(n);
				txt = txt.replace(txt.charAt(i),'\0');
				}}
			Huffman data = new Huffman() ;
			int first=0 , last = arr.size()-1;
			data.arrSize = arr.size();
			data.quickSort(arr, first, last);
			Collections.reverse(arr);
			data.compress(arr);
			data.econding();			
			String z = data.code(ss);
			System.out.println("TA:-   " + z) ;
			System.out.println("Enter the code of the word");
			String s = cin.nextLine();
			String ans = data.decoding(s);
			System.out.println(ans) ;
			
		}}
