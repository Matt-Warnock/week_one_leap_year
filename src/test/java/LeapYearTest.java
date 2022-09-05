import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class LeapYearTest {
    @Test
    void is_false_if_not_dividable_by_four() {
        assertFalse(LeapYear.check(1997));
    }

}