public class nestedLoopSeven
{
    public static void main(String[] args)
    {
        // Outer loop for rows
        for (int i = 1; i <= 5; i++)
        {
            // Inner loop for columns (to print 5 asterisks in each row)
            for (int j = 1; j <= 5; j++)
            {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing 5 asterisks
        }
    }
}