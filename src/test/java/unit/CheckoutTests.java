package unit;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class CheckoutTests {

    @Test
    public void testTrue() {

        assertThat(true, is(org.hamcrest.Matchers.equalTo(true)));

    }
}
