public class Homework_1_9 {
    public static void DoWork(){
        int[] arr = {11,12,32,41,55,64,16,8};
        int i;
        int max = arr[0];
        for (i=1; i<arr.length;i++)
            if (arr[i]>max)
                max = arr[i];

            System.out.print(max);
    }
}
