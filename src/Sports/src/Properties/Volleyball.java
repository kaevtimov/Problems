package Properties;

import java.util.List;

public class Volleyball extends Team {

    private String type;

    public Volleyball(String type, String name, Gadget gadget, int duration, Duration durationn, String bestPlayer, int numberOfPlayers, SportType sportType, List<BodyType> bodyType) {
        super(name, gadget, duration, durationn, bestPlayer, numberOfPlayers, sportType, bodyType);
        setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void playing() {
        super.playing();
        System.out.println("Playing volleyball...");
    }
}
