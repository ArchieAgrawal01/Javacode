import java.util.Scanner;
class linearsearch
{
   public static void main(String args[])
   {
      int c, num, item, array[];
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      num = input.nextInt(); 
      array = new int[num]; 
      System.out.println("Enter " + num + " integers");
      for (c = 0; c < num; c++)
        array[] = input.nextInt();

      System.out.println("Enter the search value:");
      item = input.nextInt();

      for (c = 0; c < num; c++)
      {
         if (array[c] == item) 
         {
           System.out.println(item+" is present at location "+(c+1));
           break;
         }
      }
      if (c == num)
        System.out.println(item + " doesn't exist in array.");
   }
}
