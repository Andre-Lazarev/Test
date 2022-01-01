public class Programmer {

    private String name;
    private String company;
    private String position = "intern";


    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
    }


    public String getPosition() {
        return position;
    }

    public void work() {
        String[] pozition = {"intern", "junior", "middle", "senior", "lead"};
        if (position.equals(pozition[0])) position = pozition[1];
        else if (position.equals(pozition[1])) position = pozition[2];
        else if (position.equals(pozition[2])) position = pozition[3];
        else if (position.equals(pozition[3])) position = pozition[4];
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer("Andrey", "free");
        System.out.println(programmer.getPosition());
        programmer.work();
        System.out.println(programmer.getPosition());
        programmer.work();
        System.out.println(programmer.getPosition());
        programmer.work();
        System.out.println(programmer.getPosition());
        programmer.work();
        System.out.println(programmer.getPosition());
        programmer.work();
        System.out.println(programmer.getPosition());
        programmer.work();
        System.out.println(programmer.getPosition());
    }
}
