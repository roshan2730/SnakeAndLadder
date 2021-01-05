import java.util.Random;

public class SnakeLadder {
    static Random rn=new Random();
    final static int winPoint=100;
    final static int startPosition=0;
    final static int NumberOfPlayer=0;
    final static int noPlay=1;
    final static int ladder=2;
    final static int snake=3;
    static int userPosition=startPosition;

    public static int getUserPosition() {
        return userPosition;
    }

    public static void setUserPosition(int userPosition) {
        SnakeLadder.userPosition = userPosition;
    }

    public static int rollDice()
    {
        int diceValue=rn.nextInt(6)+1;
        return diceValue;
    }

    public static int playerOption()
    {
        int option=rn.nextInt(3)+1;
        return option;
    }
    public static void main(String[] args) {
        int numberOnDice=rollDice();
        int option= playerOption();

        if (option == noPlay)
        {
            setUserPosition(getUserPosition());
        }
        else if (option == ladder)
        {
            setUserPosition(getUserPosition()+rollDice());
        }
        else if(option == snake)
        {
            setUserPosition(getUserPosition()-rollDice());
        }
        System.out.println(getUserPosition());
    }
}
