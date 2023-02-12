package com.mx.accenture.challenge;

import com.mx.accenture.challenge.CodeChallenge;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CodeChallengeTest {
    private final CodeChallenge cc = new CodeChallenge();
    private Integer[] numbers;
    private Integer target;
    private Integer[] expected;

    @Test
    void happyPath() {
        numbers = new Integer[]{2, 7, 11, 15};
        target = 18;
        expected = new Integer[]{7, 11};

        assertArrayEquals(expected, cc.resolve(numbers, target));
    }

    @Test
    void noPairToAchieveTargetSum() {
        numbers = new Integer[]{2, 7, 11, 15};
        target = 11;

        assertArrayEquals(null, cc.resolve(numbers, target));
    }

    @Test
    void twoPossibleSolutions() {
        numbers = new Integer[]{2, 7, 11, 15, 3};
        target = 18;
        expected = new Integer[]{7, 11};
        Integer[] expected2 = new Integer[]{15, 3};

        assertTrue(Arrays.equals(expected, cc.resolve(numbers, target))
                || Arrays.equals(expected2, cc.resolve(numbers, target)));
    }

    @Test
    void negativeCase() {
        numbers = new Integer[]{};
        target = 0;

        assertArrayEquals(null, cc.resolve(numbers, target));
    }
}