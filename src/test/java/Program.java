import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.junit.runners.Parameterized;

        import static org.junit.Assert.assertEquals;

    @RunWith(Parameterized.class)
    public class CheckIsAdultTest {

        private final int age;
        private final boolean result;
        private final int legalAge;

        public CheckIsAdultTest(int age, int legalAge, boolean result) {
            this.age  = age;
            this.legalAge = legalAge;
            this.result = result;
        }

        @Parameterized.Parameters
        public static Object[][] getTextData() {
            return new Object[][] {
                    {19, 18, true},
                    {4, 21, false},
                    {18, 18, true},
                    {21, 21, true},
            };
        }

        @Test
        public void checkIsAdultWhenAgeThenResult() {
            Program program = new Program (legalAge);
            boolean isAdult = program.checkIsAdult(age);
            assertEquals(result, isAdult);
        }
    }