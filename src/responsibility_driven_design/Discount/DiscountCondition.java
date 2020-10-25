package responsibility_driven_design.Discount;


import responsibility_driven_design.Screening;

public interface DiscountCondition{
    boolean isSatisfiedBy(Screening screening);
}