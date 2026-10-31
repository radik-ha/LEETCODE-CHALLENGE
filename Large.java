public class Large {
    public static void main(String[] args)
    {
        int[] arr = {4,6,5,7,8};
        int large = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                large = arr[i];
            }
        }
        System.out.println(large);
    }
}
