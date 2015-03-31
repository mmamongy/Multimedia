import java.util.Scanner;


public class myMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Process x = new Process() ;
		Scanner in = new Scanner(System.in) ;
		int t ; 
		t = in.nextInt();
		x.setLvl(t);
		x.compress();
		x.decompress();
		double d = x.mse();
		System.out.println(d);
		
		

	}

}
