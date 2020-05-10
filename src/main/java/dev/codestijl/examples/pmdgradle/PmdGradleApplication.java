package dev.codestijl.examples.pmdgradle;

/**
 * The driver application for this example.
 *
 * @author darredanvers
 * @since 1.0.0
 */
public final class PmdGradleApplication {

    /**
     * Executes the application.
     *
     * @param args The application's command line arguments.
     */
    // Any suppressed warnings should have some kind of comment as to
    // why the suppression was appropriate. Don't be too quick to ignore
    // a warning, even if it will take some work to fix.
    // In this case, the main purpose of the application was to have
    // something to scan and to have something to show how to override a
    // warning. Calling System.out.println did that.
    @SuppressWarnings({"PMD.SystemPrintln"})
    public static void main(final String[] args) {

        System.out.println("Hello world.");
    }

    /**
     * This method exists to show executing PMD on the test directory.
     *
     * @return Returns 0;
     */
    public static int getValue() {
        return 0;
    }

    private PmdGradleApplication() {
        // Intentionally empty.
    }
}
