package election;
public  class Percentage extends Votes
{
   // System.out.println("ddadasda");
     int  percentage[]=new int[4];
    Percentage()
    {
        System.out.println("calculating percentage");
        int i=0;
        while (i<4)
        {
            percentage[i]=(votes[i]*100)/TotalVotes;
            i++;

        }
    }
}
