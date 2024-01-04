
package Oops;

 class Girl 
	{
	int id;
	String name;
			Girl(int id, String name){
				this.id=id;
				this.name=name;
				}
			void display()
			{
			System.out.println(id+"  "+name);	
				}
	public static void main(String[] args) 
	{
				Girl s1 = new Girl(8,"Amra");
				Girl s2 = new Girl(9,"Nagma");
		
				s1.display();
				s2.display();
			}
	}
