class Numbers{
public static void main(String Args[]){

int n = 153;
int sum = 0;
int r;

while(n > 0){

r = n % 10;
n = n / 10;


sum = sum + (r * r * r);



} 
System.out.println(sum);

}

}