import java.util.ArrayList;

public class Compression {
	int WordCode ; 
	String Dic ;
	int output ;
	public Compression() {
		// TODO Auto-generated constructor stub
	}
	public void compress (String word) { 
		String P="" , C="" ; // p stands for prefix C will carry next charcter 
		ArrayList<Dictionary> myDic =  new ArrayList<Dictionary>() ;
//		for ( int i=0 ; i<256 ; i++) {
//			String w = "" + (char)i ; 
//			Dictionary d1 = new Dictionary(w , i);
//			myDic.add(d1); 	
//		}
		int counter =256;
		P ="" + word.charAt(0);
		for ( int i=1 ; i<word.length() ; i++) {
			C = "" +word.charAt(i);
			String t = P + C ;
			boolean b = false ; 
			for ( int j=0 ; j<myDic.size();j++) {
				Dictionary d2 = new Dictionary(myDic.get(j)); 
				if (t==d2.word) { 
					b=true ;
					System.out.println("Tell me you are here "+t) ;
					break ;
				}
			}
			if (b==true) {
				P = t ;
			}
			else {
				Dictionary d3 = new Dictionary( P, counter++);
				myDic.add(d3);
				P = C;
			}
		}
		for ( int i=0 ; i<myDic.size() ; i++)
			System.out.println(myDic.get(i).toString());
		
		
		
		
	}

}
