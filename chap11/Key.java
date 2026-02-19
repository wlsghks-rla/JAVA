package chap11;

public class Key {
	public int num;
	
	public Key(int num) {
		this.num = num;
	}
	
	@Override
	public int hashCode() {		
		return num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key = (Key) obj;
			if(num == key.num) {
				return true;
			}
		}
		return false;
	}
}
