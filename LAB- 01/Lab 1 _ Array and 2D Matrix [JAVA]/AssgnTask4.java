//Assignment Task 04: Game Arena
class AssgnTask4{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void playGame( Integer[][] arena ){

        //For this task you don't need to create any new 2D array
        //just print the result inside the function

        int point = 0;
        int row = arena.length;
        int col = arena[0].length;

        for (int r=0; r<row; r++)
        {
            for (int c=0; c<col; c++)
            {
                if (arena[r][c]>0 && arena[r][c] % 50 == 0)
                {
                    if (r == 0)
                    {
                        if (c==0) //Top left corner
                        {
                            if (arena[r][c+1] ==2) 
                            {
                                point += 2; 
                            }
                            if (arena[r+1][c] ==2) point += 2;
                        }

                        else if (c==col-1)   //Top right corner
                        {
                            if (arena[r+1][c] == 2)
                            {
                                point += 2;
                            }
                            if (arena[r][c-1]==2) point += 2;
                        }

                        else{
                            if(arena[r][c+1] ==2)
                            {
                                point += 2;
                            }
                            if (arena[r][c-1] ==2) point += 2;
                            if (arena[r+1][c] ==2) point += 2;
                        }
                    }

                    else if (r>0 && r<row-1)
                    {
                        if (c == 0)
                        {                          
                            if (arena[r-1][c] ==2) 
                            {
                                point += 2;
                            }
                            if (arena[r+1][c] ==2) point += 2;
                            if (arena[r][c+1] ==2) point += 2;
                        }

                        else if (c == col-1)
                        {
                            if (arena[r][c-1] == 2)
                            {
                                point += 2;
                            }
                            if (arena[r-1][c]==2) point += 2;
                            if (arena[r+1][c]==2) point += 2;
                        }

                        else
                        {
                            if (arena[r][c-1] == 2)
                            {
                                point += 2;
                            }
                            if (arena[r][c+1] == 2) point += 2;
                            if (arena[r-1][c] == 2) point += 2;
                            if (arena[r+1][c] == 2) point += 2;
                        }
                    }

                    else if (r == row-1)
                    {
                        if (c == 0)   //Bottom left corner
                        {
                            if (arena[r][c+1] ==2) 
                            {
                                point += 2; 
                            }
                            if (arena[r-1][c] ==2) point += 2; 
                        }

                        else if (c == col-1)     //Bottom right corner
                        {
                            if (arena[r][c-1] == 2)
                            {
                                point += 2;
                            }
                            if (arena[r-1][c] == 2) point += 2;
                        }


                        else
                        {
                            if (arena[r][c-1] == 2)
                            {
                                point += 2;
                            }
                            if (arena[r][c+1] == 2) point += 2;
                            if (arena[r-1][c] == 2) point += 2;
                        }                   
                    }
                }

            }
        }

        if (point >= 10)
        {
            System.out.println("Points Gained: " + point + "." + " Your team has survived the game.");
        }
        else
        {
            System.out.println("Points Gained: " + point + "." + " Your team is out.");
        }      
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}