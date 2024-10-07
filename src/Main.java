import java.util.Scanner; // before the class at top of the file
public class Main
{
    public static void main(String[] args)
    {
        //Convert C to F (0C * 9/5)+32=32F
        //freezing point 0C / 32F
        //Boiling point 100C / 212F

        Scanner in = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;
        String trash = ""; // use for bad input which will read as a String
        boolean done = false;
        do
        {
            System.out.print("Enter temperature in celsius: ");
            if(in.hasNextDouble()) // OK safe to read in a double
            {
                celsius = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                fahrenheit = (celsius * 9/5)+32;
                System.out.println("The Celsius value " + celsius + " when converted to Fahrenheit is " + fahrenheit);
                done = true; // we got a valid number so we can end the loop
            }
            else
            {
                // Not a double so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("\nYou have entered an invalid value for Celsius.");
                System.out.println("You entered: " + trash);
            }
        }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
        // when done is true !done i.e. NOT TRUE is false

    }
}
