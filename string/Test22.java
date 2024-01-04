package string;

final class Test22 {
	private int i;
	Test22(int i){
		this.i = i;
	}
	public Test22 modify(int i) {
		if (this.i==i) {
			return this;
		}
		else {
			return new Test22(i);
		}
	}
public static void main(String[] args) {
		Test22 t1 = new Test22(10); 
		Test22 t2 = t1.modify(100);
		Test22 t3 = t1.modify(10);
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		}
	}
