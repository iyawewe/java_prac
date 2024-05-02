package election;
import java.util.*;

public  class Candidate {
   String candidate[]=new String[4];
 Scanner input= new Scanner(System.in);
 Candidate()
 {
     System.out.println("enter the name of the candidate ");
     for (int i=0;i<4;i++)
     {
         candidate[i]=input.nextLine();
     }
 }

}
