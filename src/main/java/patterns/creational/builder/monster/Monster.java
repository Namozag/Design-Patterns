package patterns.creational.builder.monster;

/**
 *
 * @author Hany
 */
public class Monster {
    
    private int numberOfEyes;
    private String faceShape;
    private String voice;

    public Monster(int numberOfEyes, String faceShape, String voice) {
        this.numberOfEyes = numberOfEyes;
        this.faceShape = faceShape;
        this.voice = voice;
    }

    @Override
    public String toString() {
        return voice + " I'm a monster with a face like " + faceShape + " and have " + numberOfEyes + " eyes";
    }
    
}
