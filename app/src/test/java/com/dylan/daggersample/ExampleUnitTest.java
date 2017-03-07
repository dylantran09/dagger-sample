package com.dylan.daggersample;

import com.dylan.daggersample.dagger2.component.DaggerGameComponent;
import com.dylan.daggersample.session.GameSession;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testGameSession() {
        GameSession session = new GameSession();
        DaggerGameComponent.create().inject(session);
        assertEquals("Hello", session.data.data);
    }
}