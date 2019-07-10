package OOP;
import java.util.* ;
public class Test {
	public static void main(String[] args) {
		 Teacher teacher1 ; //object declare 
		 teacher1 = new Teacher() ; //create object 
         // or we could have written like this 
		 //Teacher teacher1 = new Teacher () ; //
		 teacher1.name = "Muntasir Md. Nafis" ;
		 teacher1.gender = "Male" ;
		 teacher1.phoneNo = 1711234567 ;
		 System.out.println("Name :"+teacher1.name) ;
		 System.out.println("Gender:"+teacher1.gender) ;
		 System.out.println("phoneNO:"+teacher1.phoneNo) ;
	}

}
