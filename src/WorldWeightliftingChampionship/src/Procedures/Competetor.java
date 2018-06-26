package Procedures;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Competetor {

    private String name;
    private String sex;
    private String nationality;
    private int age;
    private int kilograms;
    private List<Titles> titles;
    private List<Category> categories;
    private int lifts;
    public static int bestTry = 0;
    public static String bestCompetetor;


    public Competetor(String name, String sex, String nationality, int age, int kilograms, int lifts) {
        setName(name);
        setSex(sex);
        setNationality(nationality);
        setAge(age);
        setKilograms(kilograms);
        setLifts(lifts);
        setTitles(new ArrayList<>());
        setCategories(new ArrayList<>());
    }

    public int getLifts() {
        return lifts;
    }

    public void setLifts(int lifts) {
        this.lifts = lifts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKilograms() {
        return kilograms;
    }

    public void setKilograms(int kilograms) {
        this.kilograms = kilograms;
    }

    public List<Titles> getTitles() {
        return titles;
    }

    public void setTitles(List<Titles> titles) {
        this.titles = titles;
    }

    public void addTitle(Titles title){
        this.titles.add(title);
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }


    public void addCategory(Category category){
        this.categories.add(category);
    }

    public void liftTry(Competetor competetor){
        if(competetor.getLifts()==0){
            System.out.println(competetor + " doesn't have more tries!");
            return;
        }
        Random r = new Random();
        int kilogramsTry = r.nextInt((290 - 280) + 1) + 280;
        System.out.println(kilogramsTry);
        if(kilogramsTry > bestTry){
            bestTry = kilogramsTry;
            bestCompetetor = competetor.getName();
        }
    }
}
