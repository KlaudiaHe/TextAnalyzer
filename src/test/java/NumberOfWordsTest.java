package TextOperations;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class NumberOfWordsTest {

    private TextInformation textInformation;

    @Before
    public void setUp(){
        textInformation = new NumberOfWords();
    }

    @Test
    @Parameters(method = "parametersToTest")
    public void checkTest(String text, int number) {
        assertEquals(number, textInformation.getData(text));
    }

    private Object[] parametersToTest() {
        return new Object[]{
                new Object[]{"W praktyce zdarzają się (a przynajmniej zdarzały i wciąż istnieją) numery PESEL z błędami. Błędy w dacie zwykle były zauważane i poprawiane od razu, lecz zdarzały się też powtórzenia numeru porządkowego, błędy w określeniu płci i błędne cyfry kontrolne, które zostały wychwycone po latach przy okazji wprowadzania numeru PESEL do komputerowych baz danych. W związku z tym nie można zakładać, że wynik sprawdzania jednoznacznie określa istnienie bądź nieistnienie podanego numeru PESEL.",
                        71},
                new Object[]{"Ala ma kota", 3},
                new Object[]{"In the above example, one idea is to add", 9},
        };
    }
}