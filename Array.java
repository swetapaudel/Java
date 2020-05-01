import java.util.Scanner;
class Array{
public static void main(String args[]){

int arr[][][] = new int [2][2][2];
Scanner sc = new Scanner(System.in);
int i;
int j;
int k;
for(i=0; i<2; i++){
for(j=0; j<2; j++){
for(k=0; k<2; k++){
System.out.println("Enter a number: ");
arr[i][j][k]=sc.nextInt();
}
}
}
for(i=0;i<2; i++){
for(j=0; j<2; j++){
for(k=0; k<2; k++){
System.out.print(arr[i][j][k]+" ");

}
System.out.println();
}
System.out.println();
}

}
}