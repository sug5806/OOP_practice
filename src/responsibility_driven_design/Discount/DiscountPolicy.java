package responsibility_driven_design.Discount;


import responsibility_driven_design.Money;
import responsibility_driven_design.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}