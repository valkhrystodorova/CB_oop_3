package task2;

public class ExcelentPupil extends Pupil{
    public ExcelentPupil(String name) {
        super(name);
    }

    @Override
    void study() {
        super.study();
        System.out.println("excellent.");
    }

    @Override
    void read() {
        super.read();
        System.out.println("excellent.");
    }

    @Override
    void write() {
        super.write();
        System.out.println("excellent");
    }

    @Override
    void relax() {
        super.relax();
        System.out.println("Excellent");
    }
}
