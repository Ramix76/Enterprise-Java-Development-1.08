package Enterprise;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyMath {
    public static double roundToHundredth(BigDecimal value) {
        if (value == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return value.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double invertSignAndRoundToTenth(BigDecimal value) {
        if (value == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return value.negate().setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
}

