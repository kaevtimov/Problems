package Properties;

import java.util.List;

public class Basketball extends Team {
    public Basketball(String name, Gadget gadget, int duration, Duration durationn, String bestPlayer, int numberOfPlayers, SportType sportType, List<BodyType> bodyType) {
        super(name, gadget, duration, durationn, bestPlayer, numberOfPlayers, sportType, bodyType);
    }

    @Override
    public void playing() {
        super.playing();
        System.out.println("Playing basketball...YEAH");
    }
}
