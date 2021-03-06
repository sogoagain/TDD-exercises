package Lotto.model;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RandomSimulationTest {

    private static final int TIMES_OF_SIMULATION = 1000;
    private RandomSimulation randomSimulation = new RandomSimulation();

    @Test (expected = NullPointerException.class)
    public void test_notRegisterObserver() throws Exception {
        randomSimulation.initialize(TIMES_OF_SIMULATION);
        randomSimulation.simulate();
    }

    @Test
    public void test_lessThan0Times() throws Exception {
        ViewObserverMock view = new ViewObserverMock();
        randomSimulation.registerObserver(view);
        randomSimulation.initialize(TIMES_OF_SIMULATION);
        randomSimulation.simulate();

        assertThat(view.getCountOfCallWinningTicket()).isEqualTo(1);
        assertThat(view.getCountOfCallResult()).isEqualTo(1);
        assertThat(view.getCountOfCallStatus()).isEqualTo(TIMES_OF_SIMULATION);
    }
}