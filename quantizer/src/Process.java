
public class Process {
	public ImageRW myImg =  new ImageRW();
	public int lvl = 0;
	public int arr = 2 ;
	int red =0 , blue = 0 , green = 0 ;
	public int a[][] =  myImg.readImage("lena.jpg");
	public int asl[][] = a ;
	public int b[][] = new int [myImg.height][myImg.width];
	public double error = 0 ;
	public double MSE = 0 ;
	public int getLvl() {
		return lvl;
	}
	public double mse(){
		double g = 0 ;
		for ( int i=0 ; i<myImg.height ; i++) {
			for ( int j=0 ; j<myImg.width ; j++) { 
				error+=(double) Math.pow((b[i][j]-asl[i][j]),2);
				//System.out.print(b[i][j]-asl[i][j] + " ");
			}
		}
		g = error / (myImg.height * myImg.width) ;
		System.out.println(error) ;
		System.out.println(myImg.height+ "  "+  myImg.width);
		System.out.println(myImg.height* myImg.width);
		return g ;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
		lvl = (int) Math.pow(2, lvl);
	}
	public int findLvl(int n , int y) { 
		int i=1;
		while (true) {
			if (n<i*y)
				return i ;
			else 
				i++;
		}
		
	}
	public void compress (){
		int y = 256 / lvl ;
		for ( int i=0; i<myImg.height; i++) { 
			for ( int j=0 ; j<myImg.width ; j++) { 
				//System.out.println(a[i][j]+"  "+ findLvl(a[i][j]) ) ;
			a[i][j] = findLvl(a[i][j],y); 
			}
			}
	}
	public void decompress(){
		int y = 256 / lvl ;
		for ( int i=0; i<myImg.height; i++) { 
			for ( int j=0 ; j<myImg.width ; j++) { 
			b[i][j] = ((a[i][j]*y)+(a[i][j]*(y-1)))/2 ;
			}
			}
		myImg.writeImage(b, "Maryam.jpg");
	}
}
