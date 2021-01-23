package task2;

public class Pupil {
    private String name;
    public Pupil (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void study(){
        System.out.print(this.getName() + " study: ");
    }
    void read (){
        System.out.print(this.getName() + " read: ");
    }
    void write(){
        System.out.print(this.getName()+ " write: ");
    }
    void relax(){
        System.out.print(this.getName() + " relax: ");
    }

}
