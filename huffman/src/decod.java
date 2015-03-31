
public class decod {
	public String sym="" ; 
	public String bits="";
	public decod () {
		
	}
	public decod(String sym, String bits) {
		super();
		this.sym = sym;
		this.bits = bits;
	}
	@Override
	public String toString() {
		return "decod [sym=" + sym + ", bits=" + bits + "]";
	}


}
