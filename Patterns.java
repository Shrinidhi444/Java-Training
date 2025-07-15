package PacJava;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//E
		// for(int i = 1;i<=5;i++) {
//			 for(int j = 1;j<=5;j++) {
//				 if(i==1 || i==3 || i==5 || j==1) {
//				 System.out.print("#");
//				 }else {
//			 System.out.print(" ");
//				 }
//		    }
		//   System.out.println();
//			}
				
		// //F
		// for(int i = 1;i<=5;i++) {
//			 for(int j = 1;j<=5;j++) {
//				 if(i==1 || i==3 || j==1) {
//				 System.out.print("#");
//				 }else {
//			 System.out.print(" ");
//				 }
//		    }
		//   System.out.println();
//			}
				
			
//				//I
//				 for(int i = 1;i<=5;i++) {
//					 for(int j = 1;j<=5;j++) {
//						 if(i==1 || i==5 || j==3) {
//						 System.out.print("#");
//						 }else {
//					 System.out.print(" ");
//						 }
//				    }
//				   System.out.println();
//					}
				

//				//L
//				 for(int i = 1;i<=5;i++) {
//					 for(int j = 1;j<=5;j++) {
//						 if( i==5 || j==1) {
//						 System.out.print("#");
//						 }else {
//					 System.out.print(" ");
//						 }
//				    }
//				   System.out.println();
//					}
				
		//N	

//				for(int i =1;i<=5;i++) {
//					for(int j =1;j<=5;j++) {
//						if(i==j || j==1 || j==5) {
//							System.out.print("#");
//						}else {
//							System.out.print(" ");
//						}
//					}
//					System.out.println();
//				}
				
		//Z
//				for(int i =1;i<=5;i++) {
//					for(int j =1;j<=5;j++) {
//						if(j+i==6 || i==1 || i==5) {
//							System.out.print("#");
//						}else {
//							System.out.print(" ");
//						}
//					}
//					System.out.println();
//				}
				
		//RMQK
				//R
//				for(int i =1;i<=5;i++) {
//					for(int j =1;j<=5;j++) {
//						if((i==j && i>3)|| i==1 || i==3 || j==1 || (j==5 && i<3) ) {
//							System.out.print("#");
//						}else {
//							System.out.print(" ");
//						}
//					}
//					System.out.println();
//				}
				
				//M
//				for(int i =1;i<=5;i++) {
//					for(int j =1;j<=5;j++) {
//						if((i==j && i<=3)|| j==1 || j==5 ||  (j+i==6 && j>=3) ) {
//							System.out.print("#");
//						}else {
//							System.out.print(" ");
//						}
//					}
//					System.out.println();
//				}
			
				//Q
//				for(int i =1;i<=5;i++) {
//					for(int j =1;j<=5;j++) {
//						if(i==j|| i==1 || i==5 || j==1 || j==5 ) {
//							System.out.print("#");
//						}else {
//							System.out.print(" ");
//						}
//					}
//					System.out.println();
//				}
				
//				//K
//				for(int i =1;i<=5;i++) {
//					for(int j =1;j<=5;j++) {
//						if(j==1 ||(i+j==6 && i<=3)||(j==i && j>=3)) {
//							System.out.print("#");
//						}else {
//							System.out.print(" ");
//						}
//					}
//					System.out.println();
//				}
				
				//SHRINIDHI
				
				for(int i =1;i<=5;i++) {
					//S
					for(int j =1;j<=5;j++) {
						if(i==1 || i==3 || i==5 ||(j==1 && i==2)||(j==5 && i==4)) {
							System.out.print("#");
						}else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
					//H
					 for(int j = 1;j<=5;j++) {
						 if(i==3 || j==5 || j==1) {
						 System.out.print("#");
						 }else {
					 System.out.print(" ");
						 }
				    }
				   System.out.print("  ");
			       //R
					for(int j =1;j<=5;j++) {
					if((i==j && i>3)|| i==1 || i==3 || j==1 || (j==5 && i<3) ) {
						System.out.print("#");
					}else {
						System.out.print(" ");
					}
		 	}
					System.out.print("  ");
					//I
						 for(int j = 1;j<=5;j++) {
							 if(i==1 || i==5 || j==3) {
							 System.out.print("#");
							 }else {
						 System.out.print(" ");
							 }
					    }
						 System.out.print("  ");
					//N
					for(int j =1;j<=5;j++) {
						if(i==j || j==1 || j==5) {
							System.out.print("#");
						}else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
					//I
					 for(int j = 1;j<=5;j++) {
						 if(i==1 || i==5 || j==3) {
						 System.out.print("#");
						 }else {
					 System.out.print(" ");
						 }
				    }
				   System.out.print("  ");	
				   //D
					 for(int j = 1;j<=5;j++) {
						 if(i==1 || i==5 || j==1 ||j==5) {
						 System.out.print("#");
						 }else {
					 System.out.print(" ");
						 }
				    }
				   System.out.print("  ");
				   //H
					 for(int j = 1;j<=5;j++) {
						 if(i==3 || j==5 || j==1) {
						 System.out.print("#");
						 }else {
					 System.out.print(" ");
						 }
				    }
				   System.out.print("  ");
				   //I
					 for(int j = 1;j<=5;j++) {
						 if(i==1 || i==5 || j==3) {
						 System.out.print("#");
						 }else {
					 System.out.print(" ");
						 }
				    }
				   System.out.println(" ");//Nextline 
					}	
 
				
//DAY 1
//				import java.util.Scanner;
//				public class Arrcurd {
//					int size = 0;
//					int[] arr = new int[100];
//					
//					Arrcurd(int s) { //constructor
//						size = s;
//						arr = new int[size];
//					}
//					public static void create(int value) {
//						arr[size++]=value;
//					}
//					
//					
//					public static void read() {
//						System.out.print("Array elements are: ");
//						for(int i = 0;i<size;i++) {
//							System.out.print(arr[i] + " ");
//							
//							}
//						System.out.print();
//					}

				
//				import java.util.Scanner;
//
//				public class Arraycrud {
//				    static int size = 0;
//				    static int[] arr = new int[100]; 
//
//				    public static void create(int value) {
//				        arr[size++] = value;
//				    }
//
//				    public static void read() {
//				        System.out.print("Array elements: ");
//				        for (int i = 0; i < size; i++) {
//				            System.out.print(arr[i] + " ");
//				        }
//				        System.out.println();
//				    }
//
//				    public static void update(int index, int newValue) {
//				        if (index >= 0 && index < size) {
//				            arr[index] = newValue;
//				            System.out.println("Updated successfully.");
//				        } else {
//				            System.out.println("Invalid index!");
//				        }
//				    }
//
//				    public static void delete(int index) {
//				        if (index >= 0 && index < size) {
//				            for (int i = index; i < size - 1; i++) {
//				                arr[i] = arr[i + 1];
//				            }
//				            size--;
//				            System.out.println("Deleted successfully.");
//				        } else {
//				            System.out.println("Invalid index!");
//				        }
//				    }
//
//				    public static void main(String[] args) {
//				        Scanner sc = new Scanner(System.in);
//				        int choice, value, index;
//
//				        do {
//				            System.out.println("\n--- Array CRUD Operations ---");
//				            System.out.println("1. Create");
//				            System.out.println("2. Read");
//				            System.out.println("3. Update");
//				            System.out.println("4. Delete");
//				            System.out.println("5. Exit");
//				            System.out.print("Choose: ");
//				            choice = sc.nextInt();
//
//				            switch (choice) {
//				                case 1://insertion of value 
//				                    System.out.print("Enter value to insert: ");
//				                    value = sc.nextInt();
//				                    create(value);
//				                    break;
//				                case 2:
//				                    read();
//				                    break;
//				                case 3:
//				                    System.out.print("Enter index to update: ");
//				                    index = sc.nextInt();
//				                    System.out.print("Enter new value: ");
//				                    value = sc.nextInt();
//				                    update(index, value);
//				                    break;
//				                case 4:
//				                    System.out.print("Enter index to delete: ");
//				                    index = sc.nextInt();
//				                    delete(index);
//				                    break;
//				                case 5:
//				                    System.out.println("Exiting...");
//				                    break;
//				                default:
//				                    System.out.println("Invalid choice!");
//				            }
//				        } while (choice != 5);
//				    }
//				}
//				//efhilnz

				}
	}

