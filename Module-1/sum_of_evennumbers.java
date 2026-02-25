public class sum_of_evennumbers{
    public static void main(String args[]){
    int sum=0;
    int i=2;
   // for(int i=2;i<=100;i+=2)
   while(i<=100){
        sum=sum+i;
        i=i+2;
        }
        System.out.println("Sum of even numbers is:"+sum);
    }
}