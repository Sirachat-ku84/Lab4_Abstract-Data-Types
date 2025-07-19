import java.util.ArrayList;

/** ADT a Full set of Integer sort from Least to Most and not have null, same numbers
 */

public class IntegerSet {
    ArrayList<Integer> Numbers; // REP

    // Abstraction Function (AF)
    // - AF(s) = the set of numbers in ArrayList 

    // Rep Invariant (RI)
    // - numbers is not null
    // - numbers must not contains duplicate numbers

    public IntegerSet(){
        Numbers = new ArrayList<>();
        CheckRep();
    }
    private void CheckRep(){
        if (Numbers == null) 
            throw new RuntimeException("Numbers is null");
        if (Numbers.size() > 1){  // have more then 2
            for (int i = 0; i < Numbers.size() - 1; i++) {
                if(Numbers.get(i) >= Numbers.get(i+1))
                    throw new RuntimeException("error sort");
            }   
        }
    }
    /** 
     *  เพื่มตัวเลข
     *  @param x คือค่าที่ต้องการเพิ่มเข้าไป
     */
    public void add(Integer x){ 
        if (!Numbers.contains(x) && Numbers != null && x != null) {
            if (Numbers.size() == 0) {
                Numbers.add(x);
            }else {
                for (int i = 0; i < Numbers.size(); i++) {
                    if(x < Numbers.get(0)) {  // add หน้า
                        Numbers.add(0,x);
                        break;
                    }
                    if(i == Numbers.size() - 1){  // add หลัง
                        Numbers.add(x);
                        break;
                    }
                    if(Numbers.get(i) < x && x < Numbers.get(i+1)) {  // add ตรงกลาง
                        Numbers.add(i+1,x); // เป็น 1+i เพราะเอาไปต่อหลัง i
                        break;
                    }

                }
            }
        }
        CheckRep();
    }

    
    public String toString(){
        return Numbers.toString();
    }
}

