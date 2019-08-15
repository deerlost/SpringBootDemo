package com.makotojava.learn.springboot.model;

/**
 *
 */
public enum PayrollDay {
    MONDAY, TUSEDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY(PayType.WEEKDAY), SUNDAY(PayType.WEEKDEN);
    private final PayType payType;

    PayrollDay() {
        this(PayType.WEEKDAY);
    }

    PayrollDay(PayType weekday) {
        this.payType = weekday;
    }

    int pay(int minutesWorked, int payRate) {
        return payType.overtimePay(minutesWorked, payRate);
    }

    /**
     * 如果使用switch计算加班日具体工资，代码虽然十分简洁。
     * 假设将一个元素添加到PayrollDay中，表示假期天数的特殊值，但是忘记给switch或者要给switch添加相应操作，则十分费力
     * 这里提供一个较好的解决办法：
     * 将加班工资计算移到一个私有的嵌套枚举PayType中，将这个策略枚举的实力传到PayrollDay的构造器中
     */
    private enum PayType {

        WEEKDAY {
            @Override
            int overtimePay(int mins, int payRate) {
                return mins <= MINS_PER_SHIFT ? 0 : (mins = MINS_PER_SHIFT) * payRate;
            }
        },
        WEEKDEN {
            @Override
            int overtimePay(int mins, int payRate) {
                return mins*payRate/2;
            }
        };

        abstract int overtimePay(int mins, int payRate);

        private static final int MINS_PER_SHIFT = 8 * 60;

        int pay(int minisWorked, int payRate) {
            int basePay = minisWorked * payRate;
            return basePay + overtimePay(minisWorked, payRate);
        }
    }

}
