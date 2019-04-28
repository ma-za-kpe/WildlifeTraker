public class EndangeredAnimal extends Animal{

    public EndangeredAnimal(String name) {
        this.name = name;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getHealthLevel() {
        return super.getHealthLevel();
    }

    @Override
    public String getAgeLevel() {
        return super.getAgeLevel();
    }

    @Override
    public int getEndangeredAnimalId() {
        return super.getEndangeredAnimalId();
    }
}
