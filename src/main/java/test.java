public class test {
    public static void main(String [] args) {
        int N = 24;
        if (N%2==1) System.out.println("Weird");
        if (N%2==0  && (2<=N)&&(5>=N)) System.out.println("Not Weird");
        if (N%2==0 && (6<=N)&&(N<=20)) System.out.println("Weird");
        if (N%2==0 && (20>N)) System.out.println("Not Weird");
    }
}
