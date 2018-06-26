import Procedures.Category;
import Procedures.CategoryType;
import Procedures.Competetor;
import Procedures.Titles;


import static Procedures.Competetor.bestCompetetor;
import static Procedures.Competetor.bestTry;

public class ChampionshipHost {
    public static void main(String[] args){

        Competetor competetor1 = new Competetor(
                "Yelevan Komprarovic",
                "Male",
                "Croatia",
                29,
                89,
                3);

        Competetor competetor2 = new Competetor(
                "Jabos Klihoviyak",
                "Male",
                "Poland",
                33,
                95,
                3);

        Competetor competetor3 = new Competetor(
                "Daniel Hugeman",
                "Male",
                "Germany",
                26,
                99,
                3);

        competetor1.addTitle(Titles.EUROPEAN_CHAMPION);
        competetor2.addTitle(Titles.OLYMPIC_CHAMPION);
        competetor3.addTitle(Titles.WORLD_CHAMPION);

        Category snatch = new Category("Snatch", CategoryType.HEAVYWEIGTH);
        Category clean_and_jerk = new Category("Clean_And_Jerk", CategoryType.SUPER_HEAVYWEIGTH);

        competetor1.addCategory(snatch);
        competetor2.addCategory(snatch);
        competetor3.addCategory(snatch);

        competetor1.liftTry(competetor1);
        competetor1.liftTry(competetor2);
        competetor1.liftTry(competetor3);
        competetor1.liftTry(competetor1);
        competetor1.liftTry(competetor2);
        competetor1.liftTry(competetor3);
        competetor1.liftTry(competetor1);
        competetor2.liftTry(competetor2);
        competetor3.liftTry(competetor3);

        System.out.println("The new heavyweigth champion in the world is " + bestCompetetor + " with his best try of "
                              + bestTry + "!");


    }
}
