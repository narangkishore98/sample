package xyz.kishorenarang;

public class MainExample
{
    public static void main(String[] args)
    {
        MainExample me = new MainExample();
        int x[] = {1,2,3,4};

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
}
