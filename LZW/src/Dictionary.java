public class Dictionary {
String word ;
int num ; 
public Dictionary(Dictionary d) {
	
	this.word = d.word ;
	this.num = d.num ;
}
public Dictionary(String word, int num) {
	super();
	this.word = word;
	this.num = num;
}
@Override
public String toString() {
	return "Dictionary [word=" + word + ", num=" + num + "]";
} 


}
