/*
 *  CS312 Assignment 2.
 *  On my honor, <NAME>, this programming assignment is my own work.
 *
 *  A program to print out the UT Tower in ASCII art form.
 *
 *  Name:
 *  email address:
 *  UTEID:
 *  Section 5 digit ID:
 *  Grader name:
 *  Number of slip days used on this assignment:
 */

public class TowerAlgoTest {
    
    // CS312 students, DO NOT ALTER THE FOLLOWING LINE except for the 
    // value of the literal int.
    // You may change the literal int assigned to SIZE to any value from 2 to 100.
    // In the final version of the program you submit set the SIZE to 3.
    
    public static final int SIZE = 3;

    public static void main(String[] args) 
    {
        TowerAlgoTest foo = new TowerAlgoTest();
        foo.doTheThing();
        //foo.printTheTower();
        
    }

    public void doTheThing()
    {
        int numTopElements = ((TowerAlgoTest.SIZE - 1)*2);
        int numTopElementRows = ((2 * TowerAlgoTest.SIZE) - 2);
        int numSecondElements = TowerAlgoTest.SIZE;
        int numSecondElementRows = (TowerAlgoTest.SIZE * TowerAlgoTest.SIZE);
        int numThirdElementsFirstRow = 0;
            for(int i = 0; i < TowerAlgoTest.SIZE; i++)
            {
                numThirdElementsFirstRow = numThirdElementsFirstRow + (5 - (3 * (i % 2)));
            }
        int numThirdElementRows = ((TowerAlgoTest.SIZE / 2) + 1);
        int numBaseElements = (TowerAlgoTest.SIZE * 5);
        int numBaseElementRows = TowerAlgoTest.SIZE;
        int numThirdElementIncrement = (5 - (3 * (TowerAlgoTest.SIZE % 2)));
        
        
            String strRow = TowerAlgoTest.SIZE + "\t" + numTopElements + "\t\t" + numTopElementRows + "\t\t" + numSecondElements + "\t\t\t" + numSecondElementRows + "\t\t" +numThirdElementIncrement + "\t\t\t" + numThirdElementsFirstRow +"\t\t\t\t" + numThirdElementRows + "\t\t\t" + numBaseElements + "\t\t\t" + numBaseElementRows + "\n";
            
            
        System.out.println("Size\tTop Elements\tTop Rows\tSecond Elements\t\tSecond Rows\tThird Increment\t\tThird Elements (1st row)\tThird Element Rows\tBase Elements\t\tBase Rows");
        System.out.println(strRow);
    }
    

}