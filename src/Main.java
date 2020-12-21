import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String args[]) {
		int[] arr = { 2, 0, 6, 1, 5, 3, 7,1,2,3,4,6,5,7,8,9,10};
 
        System.out.println("Output : " +challengeArray(arr));
	}
	
	public static int challengeArray(int[] arr)
    {
        Set<Integer> S = IntStream.of(arr)
                                .boxed()
                                .collect(Collectors.toSet());
        int maxLen = 1;
        for (int e: arr)
        {
            if (!S.contains(e - 1))
            {
                int len = 1;
                while (S.contains(e + len)) {
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}
