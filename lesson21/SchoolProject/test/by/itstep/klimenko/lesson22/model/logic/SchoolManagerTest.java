package by.itstep.klimenko.lesson22.model.logic;

import static org.junit.Assert.*;

import org.junit.Test;


public class SchoolManagerTest {

    private int[][] getGroups() {

        int[][] groups =
                {
                        {7, 7, 8, 2},         // 4.0
                        {9, 8, 9, 10},        // 9.0
                        {7, 7, 1},
                        {8, 8, 10, 10}                  // 5.0
                };


        return groups;

    }


    @Test

    public void testCalculateAvgMarkPositive() {
        int[][] groups = getGroups();
        double expected = 7.5;

        double actual = SchoolManager.CalculateAvgMark(groups);

        assertEquals(expected, actual, 0.5);

    }

    @Test
    public void testFindBadStudentGroups() {
        int[][] groups = getGroups();
        String expected = "1 3";

        String actual = SchoolManager.FindBadStudentGroups(groups);

        assertEquals(expected, actual);

    }

    @Test
    public void testFindGroupsWithoutBadStudentsPositive() {
        int[][] groups = getGroups();
        String expected = "1 3";

        String actual = SchoolManager.FindBadStudentGroups(groups);

        assertEquals(expected, actual);


    }


}

