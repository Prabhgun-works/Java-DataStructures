package lec_22;
import java.util.*;
public class strings {
        public static String Inbuild(String str) {
            return new StringBuilder(str).reverse().toString();
        }
        public static String Stack(String str) {
            Stack<Character> st = new Stack<>();

            char[] arr = str.toCharArray();

            for(char c : arr) {
                st.push(c);
            }

            StringBuilder sb = new StringBuilder();

            for(int i = 0 ; i < str.length(); i++) {
                sb.append(st.pop());
            }

            return sb.toString();
        }
        public static String twoPointers(String str) {
            char[] arr = str.toCharArray();
            int i = 0, j = str.length() -  1;

            while(i < j) {
                char temp =  arr[i];
                arr[i] = arr[j];
                arr[j] = temp ;
                i++;
                j--;
            }
            return new String(arr);
        }


        public static void main(String[] args) {
            String str = "Prabhgun";

            System.out.println(Inbuild(str));
            System.out.println(Stack(str));
            System.out.println(twoPointers(str));


        }
    }

