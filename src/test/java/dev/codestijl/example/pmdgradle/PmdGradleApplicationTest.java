package dev.codestijl.example.pmdgradle;

import dev.codestijl.examples.pmdgradle.PmdGradleApplication;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests PmdGradleApplication.
 *
 * @author darrendanvers
 * @since 1.0.0
 */
public class PmdGradleApplicationTest {

    /**
     * Tests getValue.
     *
     * No Inputs.
     *
     * Expects getValue to return 0.
     */
    @Test
    public void getValue_noInput_returnsZero() {

        Assert.assertEquals(0, PmdGradleApplication.getValue());
    }
}
