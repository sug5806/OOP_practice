package responsibility_driven_design_practice;

import responsibility_driven_design.Money;

import java.time.Duration;
import java.util.List;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

    private Money calculateDiscountAmount() {
        switch (movieType) {
            case AMOUNT_DISCOUNT -> calculateAmountDiscountAmount();
            case PERCENT_DISCOUNT -> calculatePercentDiscountAmount();
            case NONE_DISCOUNT -> calculateNoneDiscountAmount();


        }

        throw new IllegalStateException();
    }

    public Money calculateMovieFee(int audienceCount) {
        if (isDiscountable(screening)) {
            return fee.minus(calculateDiscountAmount());
        }

        return fee;
    }

    private boolean isDiscountable(Screening screening) {
        return discountConditions.stream().anyMatch(condition -> condition.isSatisfiedBy(screening));
    }

    private Money calculateAmountDiscountAmount() {
        return discountAmount;
    }

    private Money calculatePercentDiscountAmount() {
        return fee.times(discountPercent);
    }

    private Money calculateNoneDiscountAmount() {
        return Money.ZERO;
    }


}
