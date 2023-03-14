package Question1;

public class IciciBank extends Bank{
    NameOfBank.Bank b = NameOfBank.Bank.ICICI;
    IciciBank() {}

    public void bankDetails(){
        System.out.println("Bank name: " + b);
    }
    public void iciciSetter(String headOfficeAddress,String chairmanName,int branchCount,double fdInterestRate,double personalLoanInterestRate,double homeLoanInterestRate){
        this.headOfficeAddress=headOfficeAddress;
        this.chairmanName=chairmanName;
        this.branchCount=branchCount;
        this.fdInterestRate=fdInterestRate;
        this.personalLoanInterestRate=personalLoanInterestRate;
        this.homeLoanInterestRate=homeLoanInterestRate;
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
