package xyz.kishorenarang;

public class MainExample
{
    public static void main(String[] args)
    {
        MainExample me = new MainExample();
        int x[] = {1,2,3,4,43,54,4,32};
        x = me.reverseArray(x);
        me.printArray(x);

        System.out.println("The Sum of Array is "+me.sumOfArray(x));
    }
    int sumOfArray(int[] arr)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    int[] reverseArray(int[] arr)
    {
        int rev[] = new int[arr.length];
        int ni = 0;
        for(int i=arr.length-1;i>=0;i--)
        {
            rev[ni++] = arr[i];
        }
        return rev;
    }
    void printArray(int arr[]){
        for(int i:arr)
        {

            System.out.print(i+"   ");

        }
    }
}
