
import java.util.*;
class ArrIn{
public static void main(String args[]){
int[] a=new int[10];
Scanner inp=new Scanner(System.in);
for(int i=0;i<a.length;i++){
a[i]=inp.nextInt();
}System.out.println("array");
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
}
}
}
