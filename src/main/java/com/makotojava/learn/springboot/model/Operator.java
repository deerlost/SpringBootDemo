package com.makotojava.learn.springboot.model;


public enum Operator {
    ADD {
        @Override
        public int calculate(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT {
        @Override
        public int calculate(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY {
        @Override
        public int calculate(int a, int b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        public int calculate(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("divisor must not be 0");
            }
            return a / b;
        }
    };

    public abstract int calculate(int a, int b);

}

