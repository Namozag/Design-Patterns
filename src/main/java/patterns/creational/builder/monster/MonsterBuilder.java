package patterns.creational.builder.monster;

/**
 *
 * @author Hany
 */
public class MonsterBuilder {
    
    private int numberOfEyes;
    private String faceShape;
    private String voice;
    
    
    public MonsterBuilder withFaceLike(String face) {
        this.faceShape = face;
        return this;
    }
    
    public MonsterBuilder addEyes(int count) {
        this.numberOfEyes += count;
        return this;
    }
    
    public MonsterBuilder withVoice(String voice) {
        this.voice = voice;
        return this;
    }
    
    public Monster build() {
        return new Monster(numberOfEyes, faceShape, voice);
    }
}
