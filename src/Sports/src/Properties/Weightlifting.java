package Properties;

import java.util.List;

public class Weightlifting extends Individual {

    private Category category;

    @Override
    public void playing() {
        super.playing();
        System.out.println("I am lifting weights...");
    }

    public Weightlifting(String name, Gadget gadget, int duration, Duration durationn, String bestPlayer, Category category, SportType sportType, List<BodyType> bodyType) {
        super(name, gadget, duration, durationn, bestPlayer, sportType, bodyType);
        setCategory(category);
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
