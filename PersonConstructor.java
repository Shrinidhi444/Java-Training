import java.util.Scanner;

class Person(){

String name;
int age;

Person(String name,int age){
this.name=name;
this.age=age;
}

void display(){
System.out.println("The name is"+name+"and the age is"+age+".");
}
}

public class man(){
	public static void main(String args[]){


	Scanner sc=new Scanner(System.in);

	System.out.print("Enter name:");
	String name=sc.nextLine();
	System.out.print("Enter age:");
	int age=sc.nextInt();

	Person p=new Person(name,age);
	p.display();
	sc.close();
}
}

 	
