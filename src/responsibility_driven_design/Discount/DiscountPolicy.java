package responsibility_driven_design.Discount;

import Money.Money;
import Screening.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}