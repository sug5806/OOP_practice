package responsibility_driven_design.Discount;


import responsibility_driven_design.Money;
import responsibility_driven_design.Screening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy{
    private List<DiscountCondition> conditions = new ArrayList<>();

    public DefaultDiscountPolicy(DiscountCondition ... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    // 부모 클래스에서 기본적인 알고리즘의 흐름을 구현하고 중간에 필요한 처리를
    // 자식 클래스에게 위임하는 패턴 (템플릿 패턴)
    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}