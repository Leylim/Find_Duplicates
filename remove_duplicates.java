/*
*
*  Author : leylimyalcin  4.07.2018
*  dizideki tekrar eden elemanlarý bulma
*  Space Complexity(N)    (dizideki eleman sayisina esittir, bir for loop var dizinin uzunlugu kadar doner)
*  Time  Complexity(N)    (dizideki eleman sayisina esittir, input size)
*/


import java.util.Arrays;
import java.util.Scanner;


	public class remove_duplicates{
		
		public void duplicate_element(int [] Array) {
			Arrays.sort(Array);
				for (int i = 0; i < Array.length-1; i++) {
					if(Array[i]==Array[i+1]){
						System.out.println("Tekrarlanan elemanlar var : " + Array[i]);
					
						}
				}
		}
		
		public void array() {

			Scanner array_scanner=new Scanner(System.in);
			System.out.println("Dizinin eleman sayisini girin");
	        int lenght=array_scanner.nextInt();
	        int my_array[]=new int[lenght];
	        System.out.println("Dizinin elemanlarini girin");
	        for(int i=0;i<lenght;i++){
	        	my_array[i]=array_scanner.nextInt();
	        	}
	        new remove_duplicates().duplicate_element(my_array);
	        }

		
		public static void main(String[] args)
		{
			new remove_duplicates().array();
		       }

}



	
	
