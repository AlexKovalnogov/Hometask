package Com;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanActionsTestSuite {

    HumanActions humanActions;
    @Before
    public void setUp()  {
        humanActions  = new HumanActions();
    }

    @Test
    public void checkingThatCurrentActionIsWorking() {
        assertEquals("I'm working",humanActions.checkCurrentActionDependOnHourOfDay(10));

    }
    @Test
    public void checkingBehaviorWhenTimeValueOutOfHighBound () {
        assertEquals("Wrong number",humanActions.checkCurrentActionDependOnHourOfDay(30));
    }
    @Test
    public void checkingBehaviorWhenTimeValueOutOfLowBound () {
        assertEquals("Wrong number",humanActions.checkCurrentActionDependOnHourOfDay(-5));
    }
    @Test
    public void checkingThatCurrentActionIsRelaxing () {
        assertEquals("I'm relaxing",humanActions.checkCurrentActionDependOnHourOfDay(5));
    }
    @Test
    public void checkingThatCurrentActionIsRelaxingWhenTimeValueOnLowBound() {
        assertEquals("I'm relaxing",humanActions.checkCurrentActionDependOnHourOfDay(0));
    }
    @Test
    public void checkingThatCurrentActionIsRelaxingWhenTimeValueOnHighBound() {
        assertEquals("I'm relaxing",humanActions.checkCurrentActionDependOnHourOfDay(24));
    }

}