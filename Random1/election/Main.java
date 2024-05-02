package election;

import java.util.Scanner;

public class Main  extends Highest {
    public static void main(String[] args) {

        Main m=new Main();
        m.Candidate();
        m.Votes();

    }

    class Candidate {
        String candidate[] = new String[4];
        Scanner input = new Scanner(System.in);

        Candidate() {
            System.out.println("enter the name of the candidate ");
            for (int i = 0; i < 4; i++) {
                candidate[i] = input.nextLine();
            }
        }
    }

    class Votes extends Candidate {
        //System.out.println("votes classs");
        int votes[] = new int[4];
        int TotalVotes = 0;
        Scanner input = new Scanner(System.in);

        Votes() {
            for (int i = 0; i < 4; i++) {
                System.out.println("enter the votes received by each of the Candidate " + candidate[i]);
                votes[i] = input.nextInt();
                TotalVotes += votes[i];
                System.out.println("total votes are " + TotalVotes);
            }

        }

    }

    class Percentage extends Votes {
        // System.out.println("ddadasda");
        int percentage[] = new int[4];

        Percentage() {
            System.out.println("calculating percentage");
            int i = 0;
            while (i < 4) {
                percentage[i] = (votes[i] * 100) / TotalVotes;
                i++;

            }
        }
    }
    class Highest extends election.Percentage {
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




}