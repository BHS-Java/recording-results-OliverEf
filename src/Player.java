public class Player implements Person{
    Main main = new Main();
    String name;
    int height;
    int age;
    public Player() {
        
    }

    @Override
    public void setName(String name) {
        this.name = main.askString("What is your name?");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHeight() {
        this.height = main.askNumber("What is your height?");
        return height;
        
    }

    @Override
    public int getAge() {
        this.age = main.askNumber("What is your age?");
        return age;
    }

    @Override
    public Results getResults() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResults'");
    }
}
