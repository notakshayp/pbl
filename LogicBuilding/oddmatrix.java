import java.util.*;
class oddmatrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int start=1;
        for(int line=0;line<n;line++){
            int column=0;
            for(int i=start;column<n;i+=2){
                if(column==n/2){
                    start=i;
                }
                column++;
                System.out.print(i+" ");
                
            }
            System.out.print("\n");
        }
    }
}