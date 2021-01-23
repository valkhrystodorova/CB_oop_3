package task2;

public class GoodPupil extends Pupil{
    public GoodPupil(String name) {
        super(name);
    }
    @Override
    void study() {
        super.study();
        System.out.println("good.");
    }

    @Override
    void read() {
        super.read();
        System.out.println("good.");
    }

    @Override
    void write() {
        super.write();
        System.out.println("good");
    }

    @Override
    void relax() {
        super.relax();
        System.out.println("good");
    }
}
