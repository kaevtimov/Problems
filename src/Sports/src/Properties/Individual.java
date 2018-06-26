package Properties;

import java.util.List;

public class Individual extends Sports {

    private SportType sportType;

    public Individual(String name, Gadget gadget, int duration, Duration durationn, String bestPlayer, SportType sportType, List<BodyType> bodyType) {
        super(name, gadget, duration, durationn, bestPlayer, sportType, bodyType);
        setSportType(sportType);
    }

    @Override
    public void playing() {
        super.playing();
        System.out.println("Playing individual..");
    }

    public SportType getSportType() {
        return sportType;
    }

    public void setSportType(SportType sportType) {
        this.sportType = sportType;
    }
}
