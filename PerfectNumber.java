import java.util.Scanner;


public class PerfectNumber{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=1, total=0;
        System.out.println("Please write a number to learn its perfectness: ");
        n=input.nextInt();
        
            for(int i=1; i<n; i++){
                if(n%i==0){
                    total+=i;
                }
                       
            }
             if(total==n){
                System.out.println("This number is a perfect number!");
            }else{
                System.out.println("This number is not a perfect number");
            }
           
            

        

    }
}