public class dataEnumExample {

    enum SoundVolume { LOW, MEDIUM, HIGH, VERY_HIGH};
    enum CarVariant {SEDAN, COMBI, SUPER_CAR};

    public static void main(String args[]){
        SoundVolume phoneSound = SoundVolume.HIGH;
        System.out.println(phoneSound);
    }
}
