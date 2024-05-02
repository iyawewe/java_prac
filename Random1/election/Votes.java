package election;
import java.util.*;
public  class Votes extends Candidate {
    //System.out.println("votes classs");
    int votes[]=new int[4];
      int TotalVotes=0;
    Scanner input=new Scanner(System.in);
    Votes()
    {
        for (int i=0;i<4;i++)
        {
            System.out.println("enter the votes received by each of the Candidate "+candidate[i]);
            votes[i]=input.nextInt();
            TotalVotes+=votes[i];
            System.out.println("total votes are "+TotalVotes);
        }

    }

}
