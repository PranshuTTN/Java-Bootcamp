package Question1;

public class IciciBank extends Bank{
    NameOfBank.Bank b = NameOfBank.Bank.ICICI;
    IciciBank() {}

    public void bankDetails(){
        System.out.println("Bank name: " + b);
    }

    public String toString(){
        return "Details entered: Bank - " +
                "HeadOfficeAddress='" + getHeadOfficeAddress() +
                ", ChairmanName='" + getChairmanName() +
                ", BranchCount=" + getBranchCount() +
                ", FdInterestRate=" + getFdInterestRate() +
                ", PersonalLoanInterestRate=" + getPersonalLoanInterestRate() +
                ", HomeLoanInterestRate=" + getHomeLoanInterestRate();
    }
}
