package Oops;

public class Over {
	int id;
	String name;
	int age;
	Over(){
		System.out.println("hii");
		}
	Over (int i, String n, int a){
		id=i;
		name=n;
		age=a;
		}
	void display() {
		System.out.println(id+" "+name+" "+age);
		}
		public static void main(String[] args) {
			Over s1=new Over(1,"Tops",20);
			Over s2=new Over(2,"Angles",22);
			s1.display();
			s2.display();
			}
		}