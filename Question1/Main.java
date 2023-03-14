package Question1;

public class Main {
    public static void main(String[] args) {
        SbiBank sbi = new SbiBank();
        sbi.bankDetails();
        sbi.sbiSetter("Model Town","Pranshu",12,8,5,6);
        sbi.bankGetter();

        BoiBank boi = new BoiBank();
        boi.bankDetails();
        boi.boiSetter("Ashok Vihar","Yaman",31,7.5,6,8);
        boi.bankGetter();

        IciciBank icici = new IciciBank();
        icici.bankDetails();
        icici.iciciSetter("Pitampura","Rocky",17,8.5,5.5,7);
        icici.bankGetter();
    }
}