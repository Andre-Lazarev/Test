public class Payer {

    private String surname;
    private String name;
    private String address;
    private String cardNumber;


    public Payer(String surname, String name, String address, String cardNumber) {
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.cardNumber = cardNumber;
    }

    public String toString(){
        String srt = "Payer: " + this.surname + " " + this.name + ", address: " + this.address + ", card: " + this.cardNumber + ".";
        return srt;
    }

    public static void main(String[] args) {
        Payer payer = new Payer("Lazarev", "Andrey", "Moscow", "12345");
        System.out.println(payer.toString());
    }

}
