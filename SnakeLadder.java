
public class SnakeLadder {

	public static final int IS_LADDER = 1;
        public static final int IS_SNAKE = 2;

        public static void main(String[] args) {
                int player_position = 0;
                System.out.println("***Welcome To Snake N Ladder Game***");
                while (player_position < 100 ) {
                        double roll_dice = Math.floor(Math.random() * 10 ) % 6 + 1;
                        System.out.println(" Dice Rolled : " + roll_dice);
                        double check_option = Math.floor(Math.random() * 10 ) % 3;
                        System.out.println("User Checks The Option : " + check_option);
                        switch ((int)check_option) {
                                case IS_LADDER:
                                        player_position+=roll_dice;
                                        break;
                                case IS_SNAKE:
                                        player_position-=roll_dice;
                                        if (player_position < 0 )
                                                player_position = 0;
                                        break;
                                default:
                                        player_position=player_position;
                        }
                System.out.println("Player's New Position is :" + player_position);
                }
        }
}

