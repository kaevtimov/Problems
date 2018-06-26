package Properties;

import java.util.ArrayList;
import java.util.List;

public class Sports {

    private String name;
    private Gadget gadget;
    private int duration;
    private Duration durationn;
    private String bestPlayer;
    private List<BodyType> bodyType;
    private SportType sportType;

    public Sports(String name, Gadget gadget, int duration, Duration durationn, String bestPlayer, SportType sportType, List<BodyType> bodyType) {
        setName(name);
        setGadget(gadget);
        setDuration(duration);
        setDurationn(durationn);
        setBestPlayer(bestPlayer);
        setBodyType(new ArrayList<>());
        setSportType(sportType);

    }

    public SportType getSportType() {
        return sportType;
    }

    public void setSportType(SportType sportType) {
        this.sportType = sportType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gadget getGadget() {
        return gadget;
    }

    public void setGadget(Gadget gadget) {
        this.gadget = gadget;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Duration getDurationn() {
        return durationn;
    }

    public void setDurationn(Duration durationn) {
        this.durationn = durationn;
    }

    public String getBestPlayer() {
        return bestPlayer;
    }

    public void setBestPlayer(String bestPlayer) {
        this.bestPlayer = bestPlayer;
    }

    public List<BodyType> getBodyType() {
        return bodyType;
    }

    public void setBodyType(List<BodyType> bodyType) {
        this.bodyType = bodyType;
    }

    public void playing(){
        System.out.println("It is playing sports...");
    }

    public void addBodyType(BodyType bodyType){
        this.bodyType.add(bodyType);
    }

    public String toString(){
        return "NAme: " + getName() + "\n" + "Sport: " + getSportType() + "\n" + "Best player: " + getBestPlayer() + "!";
    }
}
