package lec_22;
import java.util.*;
public class HashArray {
    public static int BestNum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int best = -1;
        int bestCount = 0;

        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            int value = e.getKey();
            int count = e.getValue();

            if(count > bestCount) {
                bestCount = count ;
                best = value;
            }
        }
        return best;
    }
    public static void ReturnFreq(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : arr) {
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()) {
            System.out.println("Freq " + e.getKey() + ":" + e.getValue());
        }
    }
    public static char firstNonRepeating(char[] arr) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i< arr.length ; i++) {
            map.put(arr[i] , map.getOrDefault(arr[i],0) + 1);
        }
        for(Map.Entry<Character, Integer> e  : map.entrySet()) {
            char res = e.getKey();
            Integer count = e.getValue();
            if(count == 1) {
                 return res;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
//        int[] arr = {1,2,3,1,2,3,1,2,2,2,2,4};
//        Syst em.out.print(BestNum(arr));
        char[] arr2 = {'L','m','e','e','t','t'};
        System.out.print("First NON repeating :" + firstNonRepeating(arr2));
//        ReturnFreq(arr);
    }

}
