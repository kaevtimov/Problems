package Properties;

import java.util.List;

public class Team extends Sports {

    private SportType sportType;
    private int numberOfPlayers;

    public Team(String name, Gadget gadget, int duration, Duration durationn, String bestPlayer, int numberOfPlayers, SportType sportType, List<BodyType> bodyType) {
        super(name, gadget, duration, durationn, bestPlayer, sportType, bodyType);
        setNumberOfPlayers(numberOfPlayers);
        setSportType(sportType);

    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
    public SportType getSportType() {
        return sportType;
    }

    public void setSportType(SportType sportType) {
        this.sportType = sportType;
    }
    @Override
    public void playing() {
        super.playing();
        System.out.println("Playing team sports...");
    }
}
