import java.lang.reflect.Array;
import java.util.HashMap;
import java.io.*;
import java.util.*;


public class Main {
        public static int[] twoSum(int[] nums, int target) {
            if(nums == null || nums.length < 2){
                return new int[]{-1,-1};
            }
            int[] res = new int[]{-1,-1};
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i =0; i< nums.length;i++){
                if (map.containsKey(target - nums[i])){
                    res[0] = map.get(target - nums[i]);
                    res[1] = i;
                    break;
                }
                map.put(nums[i],i);
            }
            return res;
        }

    public static void main(String[] args) {
            int t = 6;
            int[] m = new int[]{3,2,4};
            //Main s = new Main();
            //System.out.println(s.twoSum(m, t));
            System.out.println(Arrays.toString(twoSum(m,t)));

    }
}
