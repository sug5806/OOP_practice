package responsibility_driven_design.Discount;

import Screening.Screening;

public interface DiscountCondition{
    boolean isSatisfiedBy(Screening screening);
}