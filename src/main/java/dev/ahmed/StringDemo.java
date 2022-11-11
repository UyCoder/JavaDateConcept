package dev.ahmed;

import org.testng.annotations.Test;

/**
 * @author Ahmed Bughra
 * @create 2022-11-11  2:11 PM
 */
public class StringDemo {
    // method 1
    public String reverse1(String str, int startIndex, int endIndex) {
        if (str != null){
                char[] arr = str.toCharArray();
                for (int x = startIndex, y = endIndex; x <y; x++, y--) {
                        char temp = arr[x];
                        arr[x] = arr[y];
                        arr[y] = temp;
                    }
                return new String(arr);
            }
            return null;
        }


    // method 2
    public String reverse2(String str, int startIndex, int endIndex) {
        if (str != null){

            String reverseStr = str.substring(0,startIndex);
            for (int i = endIndex; i >= startIndex; i--) {
                reverseStr += str.charAt(i);
            }
            reverseStr += str.substring(endIndex+1);
            return reverseStr;
        }
        return null;



    }

    // method 3
    public String reverse3(String str, int startIndex, int endIndex) {
        if (str != null){
            StringBuilder builder = new StringBuilder(str.length());

            builder.append(str.substring(0, startIndex));
            for (int i = endIndex; i >=  startIndex; i--) {

                builder.append(str.charAt(i));
            }
            builder.append(str.substring(endIndex + 1));
            return builder.toString();
        }
        return null;
    }






        @Test
        public void testString(){
            String str = "12abcd45";
            String reversed1 = reverse1(str,2,5);
            String reversed2= reverse2(str,2,5);
            String reversed3= reverse3(str,2,5);

            System.out.println(reversed1);
            System.out.println(reversed2);
            System.out.println(reversed3);
        }
    }



