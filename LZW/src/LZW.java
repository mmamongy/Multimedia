import java.util.Scanner ;
public class LZW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in) ;
		String word ; 
		word = in.nextLine(); 
		Compression mycom = new Compression() ; 
		mycom.compress(word);
		
		

	}

}
