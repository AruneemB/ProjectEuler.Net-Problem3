public class LargestPrimeFactor
{
    public static long getLargestPrimeFactor(long number)
    {
        long largestPrimeFactor = 2;
        long currentFactor = 3;

        while(number % 2 == 0) number /= 2;

        while(currentFactor * currentFactor <= number)
        {
            if(number % currentFactor == 0)
            {
                number /= currentFactor;
                largestPrimeFactor = currentFactor;
            }
            else currentFactor += 2;
        }

        if(number > 2) largestPrimeFactor = number;

        return largestPrimeFactor;
    }

    public static void main(String[] args)
    {
        System.out.println(getLargestPrimeFactor(600851475143L));
    }


}
