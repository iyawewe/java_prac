package election;

public  class Highest extends Percentage {
    String high;
     Highest()
     {
         int max=0;
         int i,j;
         for ( i = 0; i < 4; i++)
         {
             for (j = 1; j < 4; j++)
             {
                 if (votes[i] > votes[j]) {
                     max = votes[i];
                 } else
                     max = votes[j];
                 high = candidate[i];
             }
         }
         System.out.println("the candidate with the most votes is " + max + " with a total of " + votes[i] + " " + high);
     }
     }

