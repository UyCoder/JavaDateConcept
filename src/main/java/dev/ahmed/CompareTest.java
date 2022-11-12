package dev.ahmed;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Ahmed Bughra
 * @create 2022-11-12  3:37 PM
 *
 * * Comparable class and Comparator Class
 * 1. Java object can be compare with == , != and cannot be compared with > , <
 *      but we need to camplare with < , > on development
 *
 * 2. How to use Comparable
 * 3. If we need to sort, we can implement Goods to  Comparable method and Override compareTo method
 *
 * Compareble implements once no need to create new Comparable object
 * Comparetor any to wants need to create new declaration
 *
 */
public class CompareTest {

    /**
     * Camparable Class implementation
     *      java.lang.Comparable
     *      compareTo(Object o)
     */
    @Test
    public void testCompare() {
        String[] a = new String[]{"gg","aa","cc", "bb","ab"};
        // Comoarable sorted compareTo(obj) method
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void testGoodsCompare(){
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("iPhone", 399);
        arr[1] = new Goods("Sumsung", 299);
        arr[2] = new Goods("Nokia", 15);
        arr[3] = new Goods("XiaoMi", 199);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Comparator Class
     *      java.lang.Comparator
     *      compare(Object o1, Object o2)
     */
    @Test
    public void testComparator() {
        String[] a = new String[]{"gg","aa","cc", "bb","ab"};
        Arrays.sort(a, new Comparator<String>() {
            // sort from big to small
            @Override
            public int compare(String o1, String o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return -s1.compareTo(s2);
                }
//                return 0;
                throw new RuntimeException("Information type mismatch");
            }
        });
        System.out.println(Arrays.toString(a));
    }


    @Test
    public void testGoodsCompare3() {
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("iPhone", 399);
        arr[1] = new Goods("Sumsung", 299);
        arr[2] = new Goods("Nokia", 15);
        arr[3] = new Goods("XiaoMi", 199);
        arr[4] = new Goods("ZTO", 185);

        Arrays.sort(arr, new Comparator<Goods>() {
            // sort by name then, sort by price from big to small
            @Override
            public int compare(Goods o1, Goods o2) {
               if (o1 instanceof Goods && o2 instanceof Goods) {
                   Goods g1 = (Goods) o1;
                   Goods g2 = (Goods) o2;
                   if (g1.getName().equals(g2.getName())) {
                        return -Double.compare(g1.getPrice(), g2.getPrice());
                   }else {
                       return g1.getName().compareTo(g2.getName());
                   }

               }
                throw new RuntimeException("Information type mismatch");
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
