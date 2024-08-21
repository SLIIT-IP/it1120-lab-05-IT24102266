import java.util.Scanner;

public class IT24102266Lab5Q2
{
 public static void main(String args[])
 { 
   int num;
   String price;
   
   Scanner pr = new Scanner (System.in);

   System.out.print("Enter the number of new members :");
   num = pr.nextInt();


   if(num >=0)
   {
     switch(num)
     { 
      case 0 :price="No price";
      break;
      case 1 :price="Pen";
      break;
      case 2 :price="Umbrella";
      break;
      case 3 :price="Bag";
      break;
      case 4 :price="Travelling Chair";
      break;
      case 5 :price="Headphone";
      break;
      default :price ="Headphone";
      break;
      }
     
        System.out.print("Price is a : " + price);
    }
  else
       System.out.print("Input must be a number 0 or greater ");
 }
}













      