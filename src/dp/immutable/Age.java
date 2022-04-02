package dp.immutable;

public class Age {

    private Integer noOfYears;

    public Age() {this.noOfYears = 0;}

    public Age(Integer noOfYears) {
        this.noOfYears = noOfYears;
    }

    public Integer getNoOfYears() {
        return noOfYears;
    }

    public void setNoOfYears(Integer noOfYears) {
        this.noOfYears = noOfYears;
    }
}
