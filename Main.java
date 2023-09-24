import java.util.*; 

public class Main{

public static void main(String[]args){

Scanner input = new Scanner(System.in); 

int row, col; 

int[][] arr = new int[10][10];

System.out.print("Enter the size of the 2D array: "); 
row = input.nextInt(); 
col = input.nextInt(); 

cap j1 = new cap(row, col);
j1.populate(arr); 
j1.display(arr); 
j1.even_numbers(arr);
j1.odd_numbers(arr);
j1.insertsort(arr);
// updated 2d array sort using insertion sort
j1.display(arr);




}

}