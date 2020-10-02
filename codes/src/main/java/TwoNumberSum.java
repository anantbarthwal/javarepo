import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {
    public static void main(String args[]) {
          /*int result[] = twoNumberSum(new int[]{3,5,-4,8,11,1,-1,6}, 10);*/
        int result[] = twoNumberSum(new int[]{5,7,8,6,5,3}, 8);
          if(result == null) {
              System.out.println("sum doesn't exist");
          }
          else{
              for(int i=0; i< result.length; i++) {
                  System.out.print(result[i] + " ");
              }
          }


    }


    public static int [] twoNumberSum(int [] arr, int sum) {
        Map<Integer, Boolean> inputMap = new HashMap<Integer, Boolean>(arr.length);
        for(int i=0; i< arr.length; i++) {
            if( inputMap.containsKey(sum-arr[i])) {
                return new int[]{arr[i], sum-arr[i]};
            }
            else
            {
                inputMap.put(arr[i], true);
            }
        }
        return null;
    }
}
