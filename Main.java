public class Main {

   public static void main(String []args) {
      // ID ARRAYS is a block of memory that stores a COLLECTION of data items (elements) of the same type UNDER ONE VARIABLE NAME!!! 

      // How to DECLARE & CREATE an empty Array variable 
      String[] apCompSci = new String[13]; 
      double[] prices = new double[5]; // default values: 0.0 
      String[] names = new String[5]; // default value: null 
      int[] luckyNums = new int[10]; // default value: 0 
      boolean[] yesNo = new boolean[3]; // default value: 

      // How to ACCESS an item in an Array 
      // arrayName[] => 1 is INDEX (position)
      System.out.println(prices[0]); // FIRST ITEM! 

      // Use the same syntax to SET a value in an Array 
      luckyNums [0] = 13; 
      luckyNums[5] = 7; 
      System.out.println(luckyNums[0]); 
      System.out.println(luckyNums[5]); 
      System.out.println(luckyNums[3]); 
      // System.out.prtinln(luckynums[45]); // index 45 is out of bounds!

      // Create an array with values using an INITIALIZER LIST 
      String[] table = {"Matthew", "Danny", "Kyanni"}; 
      System.out.println(table[1]); // gets the SECOND value in an array 
      System.out.println(table[0]); // gets the FIRST value (index 0) 
      // ONLY use INITIALIZER LIST shortcut when first declaring array 
      // like we can't do: apCompSci = {"name1", "name2"}; 

      // The .length ATTRIBUTE gets the NUMBER OF ITEMS in array 
      int lengthOfTableArray = table.length; 
      System.out.println(lengthOfTableArray);
      // To get the LAST INDEX use; arrayName.length - 1;\
      int finalIndex = table.length - 1; 
      System.out.println(finalIndex); // 2 is final index    
      // To get the LAST ITEM  use: [arrayName.length - 1];
      System.out.println(table[finalIndex]); // table[2] => "kyanni"
      System.out.println(table[table.length - 1]); // same as above 

   } // end main METHOD 
} // END Main CLASS 
