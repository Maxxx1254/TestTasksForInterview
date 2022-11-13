class Task4 {
    public static void main(java.lang.String[] args) {
        int[] nums = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        int average = 0;
        int sum = 0;
        int dif;
        if (nums.length != 0)
        {
            for (int x : nums) {
                sum += x;
            }
            average = sum/nums.length;
        }
        int[] a = new int[nums.length];
        int j = 0;
        for (int i = nums[j]; j < nums.length; i++) {
            if (i < average) {
                dif = average - i;
                a[j] = dif;
                j++;
            } else if (i > average) {
                dif = i - average;
                a[j] = dif;
                j++;
            } else {
                a[j] = 0;
                j++;
            }
        }
        int sumDif = 0;
        for (int k : a) {
            sumDif += k;
        }
        System.out.println(sumDif);
    }
}
