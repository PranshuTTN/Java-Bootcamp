package Question1;

public class SbiBank extends Bank {
    NameOfBank.Bank b =  NameOfBank.Bank.SBI;
    SbiBank() {}

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
