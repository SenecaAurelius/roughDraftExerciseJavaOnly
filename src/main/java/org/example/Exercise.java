package org.example;

public class Exercise {
    String name;
    private static int count;
    private int id;
    int repetitions;
    int setsCompleted;
    public Exercise(){
        id = count;
        count++;
    }

    @Override
    public String toString() {
        return name + ", id = " + id + ", has " + repetitions + " repetitions";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public int getSetsCompleted() {
        return setsCompleted;
    }

    public void setSetsCompleted(int setsCompleted) {
        this.setsCompleted = setsCompleted;
    }

}
