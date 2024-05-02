public class Towerofhanoi {
     static int  count;
    public static void towerofhanoi(int n, char source, char auxilary, char destination) {
        if (n == 1) {
            System.out.println(source + " -> " + destination);
            count++;
            return;
        }
        towerofhanoi(n - 1, source, destination, auxilary);
        towerofhanoi(1, source, auxilary, destination);
        towerofhanoi(n - 1, destination, auxilary, source);

    }

    public static void main(String[] args) {
        towerofhanoi(5, 'A', 'B', 'C');
        System.out.println("total number of steps are->"+count);
    }
}

