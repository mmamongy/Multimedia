	public class tag{ 
		public int point ; 
		public int len ; 
		public char nextChar ; 

		public tag(int point, int len, char nextChar) {
			this.point = point;
			this.len = len;
			this.nextChar = nextChar;
		}
		public tag (tag myTag) {
			point = myTag.point ;
			len = myTag.len ;
			nextChar = myTag.nextChar ;
		}

		@Override
		public String toString() {
			return "tag [point=" + point + ", len=" + len + ", nextChar="
					+ nextChar + "]\n";
		}
		
	}
	