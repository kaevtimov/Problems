package Properties;

import java.util.List;

public class Tennis extends Individual {

    private Pitch pitch;

    public Tennis(String name, Gadget gadget, int duration, Duration durationn, String bestPlayer, Pitch pitch, SportType sportType, List<BodyType> bodyType) {
        super(name, gadget, duration, durationn, bestPlayer, sportType, bodyType);
        setPitch(pitch);
    }

    @Override
    public void playing() {
        super.playing();
        System.out.println("I am serving and acing..tennis");
    }




    public Pitch getPitch() {
        return pitch;
    }

    public void setPitch(Pitch pitch) {
        this.pitch = pitch;
    }

    public void playTennis(){
        System.out.println("Serve");
        System.out.println("Ace");
    }
}
