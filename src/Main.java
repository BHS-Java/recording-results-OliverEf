import java.util.Scanner;



public class Main implements Spec{

    //Properties
    public final Scanner USER = new Scanner(System.in);

    //Constructors

    public static void main(String[] args) {
        Game game = new Game();
    }

    //Methods
    public Player createPlayer() {
        Player newPlayer = new Player();
        newPlayer.setName("What is your name?");
        System.out.println("Hello " + newPlayer.getName());
        newPlayer.getHeight();
        newPlayer.getAge();
        System.out.println("-----------------");
        System.out.println("You are " + newPlayer.name + " " + newPlayer.height + "cm tall and " + newPlayer.age + " years old.");
        System.out.println("-----------------");
        return newPlayer;
    }

    public String askString(String question) {
        
        System.out.println(question);
        String answer = USER.nextLine();
        
        System.out.println("You entered: " + answer);
        return answer;
        
    }

    @Override
    public int askNumber(String question) {
        System.out.println(question);
        int answer = USER.nextInt();
        
        System.out.println("You entered: " + answer);
        return answer;
    }

    @Override
    public Results getResults(Game guessingOrBetter) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResults'");
    }

    @Override
    public Person makePerson(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makePerson'");
    }

    @Override
    public void addResults(Person player) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addResults'");
    }
}