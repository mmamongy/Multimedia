import java.util.ArrayList;
import java.util.Collections;
public class Huffman {
	public int arrSize=0 ;
	public Huffman() {
		arrSize = 0 ;
	}
	String dec ="" ;
	public ArrayList<decod> output = new ArrayList<decod>();
	private static int partition(ArrayList<Node>myArr, int f, int l) {
        double x = myArr.get(f).pro;
        int i = f-1 ;
        int j = l+1 ;
        while (true) {
            i++;
            while ( i < l && myArr.get(i).pro < x)
                i++;
            j--;
            while (j> f && myArr.get(i).pro > x)
                j--;

            if (i < j)
                swap(myArr, i, j);
            else
                return j;
        }
    }
	
	
	public void quickSort(ArrayList<Node>myArr , int f , int l){		    
		        if(f<l)
		        {
		            int q =partition(myArr,f,l);
		            quickSort(myArr,f,q); // get half
		            quickSort(myArr,q+1,l); // get second half
		        }
		    }		    
    private static void swap(ArrayList<Node>myArr, int i, int j) {
		        // TODO Auto-generated method stub
		        Node temp = myArr.get(i);
		        Node temp2 = myArr.get(j) ;
		        myArr.set(i, temp2) ;
		        myArr.set(j, temp) ;
		    }
    public String c ="";
    public void compress(ArrayList<Node>myArr) {
    	while (myArr.size()>2){
    		Node lastNode = myArr.get(myArr.size()-1);
    		Node ablLast = myArr.get(myArr.size()-2);
    		Node myLastNode = new Node();
    		myLastNode.sym = ablLast.sym + lastNode.sym;
    		myLastNode.pro = ablLast.pro + lastNode.pro ;
    		myLastNode.right = ablLast;
    		myLastNode.left = lastNode;
    		myArr.remove(myArr.size()-1);
    		myArr.set(myArr.size()-1,myLastNode);
    		quickSort(myArr, 0, myArr.size()-1);
    		Collections.reverse(myArr);
           	}
    	int y=0 ;
    	myArr.get(0).cod+="0" ;  
    	myArr.get(1).cod+="1";   
    	while (myArr.size()!=arrSize) { 
    		if (myArr.get(y).left==null &&  myArr.get(y).right==null) {     			
    		}
    		if (myArr.get(y).left!=null && myArr.get(y).right!=null){
    			Node nodeLeft = myArr.get(y).left;
    			Node nodeRight = myArr.get(y).right;
    			nodeLeft.cod = myArr.get(y).cod;
    			nodeRight.cod = myArr.get(y).cod;
    			nodeLeft.cod+="0"; 
    			nodeRight.cod+="1";
    			myArr.remove(y);
    			myArr.add(nodeLeft);
    			myArr.add(nodeRight); 
    		}
    		y++;    		
    	}
    	for ( int i=0 ; i<myArr.size() ; i++) { 
    		decod x = new decod ();
    		x.sym = myArr.get(i).sym ; 
    		x.bits = myArr.get(i).cod ;
    		output.add(x);
    	}
    }
    // recursion function to add bits
    
     
	@Override
	public String toString() {
		return "Huffman [getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void econding() { 
		
		for ( int i=0 ; i<output.size() ; i++) {
    		System.out.println(output.get(i).sym + "    " + output.get(i).bits);
 
	}}
    public String decoding  (String code){
    	 String sub="" ;
    	 String ans="";
    	 boolean b = false ;
    	 for ( int i=0 ; i<code.length() ;i++) {
    		 b=  false ;
    		 sub += ""+ code.charAt(i);
    		 for ( int j=0 ; j<output.size() ; j++) {
    			 if (output.get(j).bits.equals(sub)){ 
    				 ans += output.get(j).sym;
    				 b = true;	 
    				 break ;
    			 }
    		 }
    		 if (b == true) {
    			 sub="" ; 
    			 b =false ;
    		 }
    		 }
    	 return ans ;    	 
    }
   public String code(String w){ 
	   String ans ="" ;
	  for ( int i=0 ; i<w.length() ; i++) {
		  String g=""+w.charAt(i) ;
		  for ( int j=0 ; j<output.size() ; j++) { 
			  if (output.get(j).sym.equals(g)){
				  ans+=output.get(j).bits;
			  }
		  }
		  
	  }
	  return ans ;
   }


} 