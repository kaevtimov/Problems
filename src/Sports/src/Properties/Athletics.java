package Properties;

import java.util.List;

public class Athletics extends Individual {

    private Discipline discipline;

    @Override
    public void playing() {
        super.playing();
        System.out.println("I am running/jumping/throwing...");
    }

    public Athletics(String name, Gadget gadget, int duration, Duration durationn, String bestPlayer, Discipline discipline, SportType sportType, List<BodyType> bodyType) {
        super(name, gadget, duration, durationn, bestPlayer, sportType, bodyType);
        setDiscipline(discipline);

    }


    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
}
