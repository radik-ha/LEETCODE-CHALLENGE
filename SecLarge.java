public class SecLarge {
    public static void main(String[] args)
    {
        int[] arr = {4,6,5,7,8};
        int largest = 0;
        int seclarge = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                seclarge = largest;
                largest = arr[i];
                
            }
            else
            {
                seclarge = arr[i];
            }
        }
        System.out.println(seclarge);
    }
}
