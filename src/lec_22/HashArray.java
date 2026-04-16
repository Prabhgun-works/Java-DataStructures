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


    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,1,2,2,2,2,4};
//        System.out.print(BestNum(arr));
        ReturnFreq(arr);
    }

}
