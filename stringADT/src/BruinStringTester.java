public class BruinStringTester {
    public static void main(String[] args){
        BruinString test = new BruinString("Branham");
        test.insert(3,new char[]{'a', 'b', 'c'});
        System.out.println(test);
    }
}