//Importing java.io package 
import java.io.*;
//Name the Class
class Main 
{
  public static void main(String args[]) throws IOException /* It means that it remove the input output errors */

  {

    // Making InputStreamReader Object
    InputStreamReader read = new InputStreamReader(System.in);
    // Making BufferedReader Object
    BufferedReader br = new BufferedReader(read);

    // Taking "x" Co-ordinates of point A as Input
    System.out.print("Enter x coordinate of point A: ");
    // Storing the "x" Co-ordinates of point A in a variable
    int x1 = Integer.parseInt(br.readLine());

    // Taking "y" Co-ordinates of point A as Input
    System.out.print("Enter y coordinate of point A: ");
    // Storing the "y" Co-ordinates of point A in a variable
    int y1 = Integer.parseInt(br.readLine());

    // Taking "x" Co-ordinates of point B as Input
    System.out.print("Enter x coordinate of point B: ");
    // Storing the "x" Co-ordinates of point B in a variable
    int x2 = Integer.parseInt(br.readLine());

    // Taking "y" Co-ordinates of point B as Input
    System.out.print("Enter y coordinate of point B: ");
    // Storing the "y" Co-ordinates of point B in a variable
    int y2 = Integer.parseInt(br.readLine());
    
    // Calculating the Line slope of all the co-ordinates of point A and B
    float lineSlope = (y2 - y1) / (float) (x2 - x1);

    // Displaying the Line Slope after calculating it !!
    System.out.println("Slope of line: " + lineSlope);
  }
}