package org.neo4j.graphalgo.similarity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SimilaritiesTest {

    private final List<Number> input;

    @Parameterized.Parameters(name = "{0}")
    public static Collection<List<Number>> data() {
        return Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 2, 3, 3),
                Arrays.asList(104, 101, 108, 108, 111)
        );
    }

    public SimilaritiesTest(List<Number> input) {
        this.input = input;
    }

    @Test
    public void jaccardIdenticalInput() {
        // given identical input

        // when
        Similarities s = new Similarities();
        double result = s.jaccardSimilarity(input, input);

        // then
        assertEquals(1.0, result, 0.01);
    }

    @Test
    public void cosineIdenticalInput() {
        // given identical input

        // when
        Similarities s = new Similarities();
        double result = s.cosineSimilarity(input, input);

        // then
        assertEquals(1.0, result, 0.01);
    }

    @Test
    public void pearsonIdenticalInput() {
        // given identical input

        // when
        Similarities s = new Similarities();
        double result = s.pearsonSimilarity(input, input, Collections.emptyMap());

        // then
        assertEquals(1.0, result, 0.01);
    }

    @Test
    public void euclideanIdenticalInput() {
        // given identical input

        // when
        Similarities s = new Similarities();
        double result = s.euclideanSimilarity(input, input);

        // then
        assertEquals(1.0, result, 0.01);
    }

    @Test
    public void overlapIdenticalInput() {
        // given identical input

        // when
        Similarities s = new Similarities();
        double result = s.euclideanSimilarity(input, input);

        // then
        assertEquals(1.0, result, 0.01);
    }
}
