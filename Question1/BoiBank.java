package Question1;

public class BoiBank extends Bank{
    NameOfBank.Bank b = NameOfBank.Bank.BOI;
    BoiBank() {}

    public void bankDetails(){
        System.out.println("Bank name: " + b);
    }

    public String toString(){
        return "Details entered: Bank - " +
                "HeadOfficeAddress='" + headOfficeAddress +
                ", ChairmanName='" + chairmanName +
                ", BranchCount=" + branchCount +
                ", FdInterestRate=" + fdInterestRate +
                ", PersonalLoanInterestRate=" + personalLoanInterestRate +
                ", HomeLoanInterestRate=" + homeLoanInterestRate;
    }
}
