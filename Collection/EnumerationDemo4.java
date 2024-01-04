package Collection;

import java.util.*;

class EnumerationDemo4{
	public static void main(String[] args){
		
	Vector <Object> v=new Vector<Object>();
		for(int i=0; i<=10; i++){
		v.addElement(i);
		}
		System.out.println(v);//1,2,3,4..........10
	
	Enumeration<Object> e=v.elements();
	
	    while(e.hasMoreElements()){
	    	
		Integer I=(Integer)e.nextElement();
			if(I%2 ==0) 
			System.out.println(I);//0,2,4,6,8,10
	    }
			System.out.println(v);//1,2,3,4........10
			}
		}	
		

	


