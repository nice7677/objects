package kr.springboot.ch2.step2;

public interface DiscountPolicy {

    Money calculateDiscountAmount(Screening screening);

}
