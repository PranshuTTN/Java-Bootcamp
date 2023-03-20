package Question1;

abstract class Bank {

    protected String headOfficeAddress, chairmanName;
    protected int branchCount;
    protected double fdInterestRate,personalLoanInterestRate,homeLoanInterestRate;

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    @Override
    public String toString() {
        return "Details entered: Bank - " +
                "HeadOfficeAddress='" + getHeadOfficeAddress() +
                ", ChairmanName='" + getChairmanName() +
                ", BranchCount=" + getBranchCount() +
                ", FdInterestRate=" + getFdInterestRate() +
                ", PersonalLoanInterestRate=" + getPersonalLoanInterestRate() +
                ", HomeLoanInterestRate=" + getHomeLoanInterestRate();
    }
}
