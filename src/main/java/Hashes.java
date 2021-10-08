import java.security.Key;

public class Hashes {


    public static void main(String[] args) {
        /* Insert EASYQUTION into an initially empty table of M=5. Use hash function: 11 k % M
         * key   E A S Y Q U T I O N
         * hash  0 0 2
         * value 0 1 2 3 4 0 1 2 3 4*/
//        Hashes hashClass = new Hashes();
//        System.out.println("E: " + hashClass.hashIt("E", 5, 11, 0));
//        System.out.println("A: " + hashClass.hashIt("A", 5, 11, 1));
//        System.out.println("S: " + hashClass.hashIt("S", 5, 11, 2));
//        System.out.println("Y: " + hashClass.hashIt("Y", 5, 11, 3));
//        System.out.println("Q: " + hashClass.hashIt("Q", 5, 11, 4));
//        System.out.println("U: " + hashClass.hashIt("U", 5, 11, 5));
//        System.out.println("T: " + hashClass.hashIt("T", 5, 11, 6));
//        System.out.println("I: " + hashClass.hashIt("I", 5, 11, 7));
//        System.out.println("O: " + hashClass.hashIt("O", 5, 11, 8));
//        System.out.println("N: " + hashClass.hashIt("N", 5, 11, 9));
//        Character[] characters = {'S', 'E', 'A', 'R', 'C', 'H', 'X', 'M', 'P', 'L'};

        //characters = new Character[]{'E', 'A', 'S', 'y', 'Q', 'U', 'T', 'I', 'O', 'N'};
        //hashClass.hash(characters,5);
        String s = "EASYQUTION";
        //hashClass.hash(s,5);
        for (Character c: s.toCharArray()) System.out.println(11*(c.hashCode()%5));

    }

    private int hash(String s, int M) {
        int hash = 0;
        // R = 11
        for (int i = 0; i < s.length(); i++) {
            hash = 11 * (s.charAt(i)% M) ;
            System.out.println(" " + hash + " ");
        }
        return hash;
    }

    private int hashIt(String s, int M, int R, int hash) {
        for (int i = 0; i < s.length(); i++) {
            hash = (R * hash + s.charAt(i)) % M;
        }
        return hash;
    }

}
