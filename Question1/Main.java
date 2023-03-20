package Question1;

public class Main {
    public static void main(String[] args) {
        SbiBank sbi = new SbiBank();
        sbi.bankDetails();
        sbi.setHeadOfficeAddress("Model Town");
        sbi.setChairmanName("Pranshu");
        sbi.setBranchCount(12);
        sbi.setFdInterestRate(8);
        sbi.setPersonalLoanInterestRate(5);
        sbi.setHomeLoanInterestRate(6);
        sbi.getHeadOfficeAddress();
        sbi.getChairmanName();
        sbi.getBranchCount();
        sbi.getFdInterestRate();
        sbi.getPersonalLoanInterestRate();
        sbi.getHomeLoanInterestRate();
        System.out.println(sbi.toString());

        BoiBank boi = new BoiBank();
        boi.bankDetails();
        boi.setHeadOfficeAddress("Ashok Vihar");
        boi.setChairmanName("Yaman");
        boi.setBranchCount(31);
        boi.setFdInterestRate(7.5);
        boi.setPersonalLoanInterestRate(6);
        boi.setHomeLoanInterestRate(8);
        boi.getHeadOfficeAddress();
        boi.getChairmanName();
        boi.getBranchCount();
        boi.getFdInterestRate();
        boi.getPersonalLoanInterestRate();
        boi.getHomeLoanInterestRate();
        System.out.println(boi.toString());

        IciciBank icici = new IciciBank();
        icici.bankDetails();
        icici.setHeadOfficeAddress("Pitampura");
        icici.setChairmanName("Rocky");
        icici.setBranchCount(17);
        icici.setFdInterestRate(8.5);
        icici.setPersonalLoanInterestRate(5.5);
        icici.setHomeLoanInterestRate(7);
        icici.getHeadOfficeAddress();
        icici.getChairmanName();
        icici.getBranchCount();
        icici.getFdInterestRate();
        icici.getPersonalLoanInterestRate();
        icici.getHomeLoanInterestRate();
        System.out.println(icici.toString());
    }
}