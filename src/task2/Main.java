package task2;

public class Main {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(new GoodPupil("Sophie"), new BadPupil("Vasya"));
        classRoom.action();
    }
}
