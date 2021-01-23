package task2;

public class BadPupil extends Pupil{
    public BadPupil(String name) {
        super(name);
    }
    @Override
    void study() {
        super.study();
        System.out.println("bad.");
    }

    @Override
    void read() {
        super.read();
        System.out.println("bad.");
    }

    @Override
    void write() {
        super.write();
        System.out.println("bad.");
    }

    @Override
    void relax() {
        super.relax();
        System.out.println("bad.");
    }
}
