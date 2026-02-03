
import java.util.*;



class OrderIt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine().trim());
        sc.nextLine(); // skip the line "shuffled"

        List<String> shuffled = new ArrayList<>();//ArrayList to stored shuffled List
        for (int i = 0; i < N; i++) {
            shuffled.add(sc.nextLine().trim());
        }

        sc.nextLine(); // skip the line "original"

        List<String> original = new ArrayList<>();//ArrayList to store Original List
        for (int i = 0; i < N; i++) {
            original.add(sc.nextLine().trim());
        }

        // Map each instruction in original to its index
        Map<String, Integer> pos = new HashMap<>();
        for (int i = 0; i < N; i++) {
            pos.put(original.get(i), i);
        }

        // Convert shuffled list to index array
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = pos.get(shuffled.get(i));
        }

        // Find longest contiguous increasing subsequence
        int longest = 1, curr = 1;
        for (int i = 1; i < N; i++) {
            if (arr[i] > arr[i - 1]) {
                curr++;
                longest = Math.max(longest, curr);
            } else {
                curr = 1;
            }
        }

                  

        // Minimum number of cut-and-insert operations
        int result = N - longest;
        System.out.println(result);
    }
}




