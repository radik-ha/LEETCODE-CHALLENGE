class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int start = Math.max(todays(arriveAlice),todays(arriveBob));
        int end = Math.min(todays(leaveAlice),todays(leaveBob));
        if(start>end)
        {
            return 0;
        }
        return end-start+1;
    }

    public int todays(String date)
    {
        int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int day = Integer.parseInt(date.substring(3,5));
        int month = Integer.parseInt(date.substring(0,2));
        int total = day;
        for(int i=0;i<month-1;i++)
        {
            total += months[i];
        }
        return total;
    }
}