package com.lfboo.demo.common.dto;

import java.math.BigDecimal;

/**
 * Created by on 2018/10/7.
 *
 * @author lfb
 */
public class Probability {

    private BigDecimal min;

    private BigDecimal max;

    private double probability;

    public BigDecimal getMin() {
        return min;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    public BigDecimal getMax() {
        return max;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public Probability() {
    }

    public Probability(BigDecimal min, BigDecimal max, double probability) {
        this.min = min;
        this.max = max;
        this.probability = probability;
    }
}
