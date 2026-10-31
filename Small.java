public class Small {
    public static void main(String[] args)
    {
        int[] arr = {4,6,5,7,8};
        int small = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<small)
            {
                small = arr[i];
            }
        }
        System.out.println(small);
    }
}
