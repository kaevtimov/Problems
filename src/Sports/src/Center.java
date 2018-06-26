import Properties.*;

import java.util.ArrayList;
import java.util.List;

public class Center {

    public static void main(String[] args){

        Individual player1 = new Tennis("Grigor Dimitrov",
                Gadget.ROCKET_AND_BALL,
                0,
                Duration.WITH_POINTS,
                "Roger Federer",
                Pitch.GRASS,
                SportType.TENNIS,
                new ArrayList<>());

        player1.addBodyType(BodyType.ATHLETIC);


        Basketball player2 = new Basketball("LeBron James",
                Gadget.BASKET,
                48,
                Duration.WITH_TIME,
                "Michael Jordan",
                5,
                SportType.BASKETBALL,
                new ArrayList<>());

        player2.addBodyType(BodyType.VERY_TALL);

        Weightlifting player3 = new Weightlifting("Yoan Pashov",
                Gadget.WEIGHTS,
                0,
                Duration.NO_DURATION,
                "YoanPashov",
                Category.SUPERHEAVY,
                SportType.WEIGHTLIFTING,
                new ArrayList<>());

        player3.addBodyType(BodyType.MUSCLE);

        System.out.println(player3);


        }
}
