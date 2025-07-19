public class IntegerSetManualTest {
    public static void main(String[] args) {
        IntegerSet a = new IntegerSet();
        a.add(30);
        a.add(70);
        a.add(10);
        a.add(50);
        String s = "[10, 30, 50, 70]";
        if (a.toString().equals(s)) {
            System.out.println("PASS!!! " + a.toString());
        } else 
            System.out.println("FAIL!!! " + a.toString());
        
    }
}