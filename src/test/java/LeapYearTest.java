import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeapYearTest {
    @Test
    void is_false_if_not_dividable_by_four() {
        assertFalse(LeapYear.check(1997));
    }
    @Test
    void is_true_if_dividable_by_four() {
        assertTrue(LeapYear.check(2000));
    }

}