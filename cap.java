import java.util.*;

public class cap{
Scanner input = new Scanner(System.in); 
int[][] arr;
int row; 
int col; 

public cap(int row, int col){
int[][] arr = new int[row][col];
this.row = row; 
this.col = col; 
}

public void populate(int arr[][]){
System.out.print("Please enter "+(this.row*this.col)+" numbers: ");
for(int i = 0; i < this.row; i++){
for(int j = 0; j < this.col; j++){
arr[i][j]=input.nextInt(); 
}
}

}

public void display(int[][] arr){
System.out.println("Array contents: "); 
for(int i = 0; i < this.row; i++){
for(int j = 0; j < this.col; j++){
System.out.print(arr[i][j]+" \t"); 
}
System.out.print("\n"); 
}

}

public void even_numbers(int arr[][]){
    int sum = 0;
    System.out.println("Array contents: ");
    for(int i = 0; i < this.row; i++){
        for(int j = 0; j < this.col; j++){
        if(arr[i][j]%2==0){
            sum+=arr[i][j];
            System.out.print(arr[i][j]+" \t\t");
        } else{
            System.out.print(" "+"\t\t");
        }
        }
        System.out.print("\n");
    }
    System.out.print("Sum of even numbers is: "+sum);
    System.out.println();
}

public void odd_numbers(int arr[][]){
    int sum = 0;
    System.out.println("Array contents: ");
    for(int i = 0; i < this.row; i++){
        for(int j = 0; j < this.col; j++){
            if(arr[i][j]%2!=0){
                sum+=arr[i][j];
                System.out.print(arr[i][j]+" \t\t");
            } else{
                System.out.print(" "+"\t\t");
            }
        }
        System.out.print("\n");
    }
    System.out.print("Sum of odd numbers is: "+sum);
System.out.println();
}

public int[][] insertsort(int arr[][]){
    //flatten the 2d array first
    int total = row*col;
    int arrflat[] = new int[total];
    int k =0;
    for(int i = 0; i < row; i++){
        for(int j = 0 ; j < col; j++){
            arrflat[k++]=arr[i][j];
        }
    }
    // with the flatten array after, use the insertion sort
    for(int i = 1; i < total; i++){
        int key =  arrflat[i];
        int j  = i -1;
        while(j >= 0 && arrflat[j]>key){
            arrflat[j+1] = arrflat[j];
            j--;
        }
        arrflat[j+1]=key;

    }
    k = 0;
    // updating the 2d array after using insertion sort
    for(int i = 0 ; i < row; i++){
        for(int j = 0; j < col; j++){
            arr[i][j] = arrflat[k++];
        }
    }
    return arr;
 }




}