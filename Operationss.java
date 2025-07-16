package PacJava;

public class Operationss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 0;i <= 10;System.out.println(" "+(++i))) {			
//		}
//		System.out.println();
//		
//		for(int i = 0;i <= 10;System.out.println(" "+(i++))) {			
//		}
		
		if(System.out.printf("Hello") == null) {
			System.out.println("Hello World!!!");
		}
		else {
			System.out.println("World!!!");
		}
		
		System.out.println();
		//C
//		int main() {
//			int a = printf("Hello World");
//			printf(""%d",a);
//		if(!printf("Hello")) {
//			printf("Hello");
//		}
//		else {
//			printf("World");
//		}
//		return 0;
//	}

//int main() {
//	int a =printf("%d\n",10);
//	printf("%d",a);
//	return 0;
//}

		//swap ththe numbers
int a = 4;
int b = 7;
a=a*b;
b=a/b;
a=a/b;
System.out.println(a);
System.out.println(b);

System.out.println();

// Swap in other logic
int c = b;
int d = a;
b=d;
a=c;
System.out.println(a);
System.out.println(b);

//swap numbers
//a^2-2ab+b^2

System.out.println();

//Sorting
int[] arr= {1,0,5,0,2,3,0,0};

for(int i = 0;i<arr.length;i++) {
    if(arr[i] == 0) {
    	arr[i] = arr[i-1];
    	i++;
	}
    System.out.println(arr[i]);
}


}
	}

