import java.util.*;
public class hw2{
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "January");
        hmap.put(2, "February");
        hmap.put(3, "March");
        hmap.put(4, "April");
        hmap.put(5, "May");
        hmap.put(6, "June");
        hmap.put(7, "July");
        hmap.put(8, "August");
        hmap.put(9, "September");
        hmap.put(10, "October");
        hmap.put(11, "November");
        hmap.put(12, "December");

        int n;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("請輸入1~12");
            n=sc.nextInt();
            if (hmap.containsKey(n)) {
                System.out.printf("英文單字：");
                System.out.println(hmap.get(n));
                        
            } 
            else {
                System.out.println("範圍錯誤");
                }
        }
    }
}

