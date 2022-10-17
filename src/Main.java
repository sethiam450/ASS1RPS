
public class Main {
    public static void main(String[] args) {
        String playA = "R";
        String playB = "P";


        if (playA.equalsIgnoreCase("R"))

        {

            if (playB.equalsIgnoreCase("R"))

            {
                System.out.println("R X R It's a Tie! Play Again? [Y/N]");
            }
            else if (playB.equalsIgnoreCase("P"))

            {
                System.out.println("Paper covers rock, Player B wins! Play Again? [Y/N]");
            }
            else // playB is scissors

            {

                System.out.println("Rock breaks scissors, Player A wins! Play Again? [Y/N]");
            }
        }


        else if (playA.equalsIgnoreCase("P"))

        {

                if (playB.equalsIgnoreCase("R"))

                {
                    System.out.println("P X R Paper covers rock, Player A Wins! Play Again? [Y/N]");
                }
                else if (playB.equalsIgnoreCase("P"))

                {
                    System.out.println("P X P, It is a tie! Play Again? [Y/N]");
                }
                else // playB is scissors

                {

                    System.out.println("Scissors beats paper, Player B wins! Play Again? [Y/N]");
                }

        }
        else if(playA.equalsIgnoreCase("S"))
        {
            if (playB.equalsIgnoreCase("R"))

            {
                System.out.println("S X R Rock beats scissors, Player B Wins! Play Again? [Y/N]");
            }
            else if (playB.equalsIgnoreCase("P"))

            {
                System.out.println("S X P, Scissors beats paper, player A Wins! Play Again? [Y/N]");
            }
            else // playB is scissors

            {

                System.out.println("S X S, It is a tie! Play Again? [Y/N]");
            }

        }
        }
        {




        }
        {


        }


}
