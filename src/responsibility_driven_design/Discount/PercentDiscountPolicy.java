package responsibility_driven_design.Discount;

import responsibility_driven_design.Money;
import responsibility_driven_design.Screening;

public class PercentDiscountPolicy extends DefaultDiscountPolicy{
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition ... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMoveFee().times(percent);
    }
}
