public class nestedLoopSix
{
    public static void main(String[] args)
    {
        // Outer loop for rows
        for (int i = 5; i >= 1; i--)
        {
            // Inner loop for columns
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}