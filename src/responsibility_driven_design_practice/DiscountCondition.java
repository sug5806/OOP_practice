package responsibility_driven_design_practice;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
