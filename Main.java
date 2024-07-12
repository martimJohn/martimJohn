public class Main{
    int x;
    public Main(int y) {
        x = y;
      }
    public static void main(String[] args) {
        Main john =new Main(5);
        Main imma = new Main(4);
        System.out.println(john.x);
        System.out.println(imma.x);
    }
}