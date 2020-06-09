package org.example;

import org.testng.annotations.DataProvider;

public class CalculatorTestData {

    @DataProvider(name = "intSumData")
    Object[][] intSumData() {
        Object[][] testData = {
                {2, 2, 4},
                {0, 0, 0},
                {-3, -5, -8},
                {-10, 9, -1}
        };
        return testData;
    }

    @DataProvider(name = "floatSumData")
    Object[][] floatSumData() {
        Object[][] testData = {
                {2.0, 2.1, 4.1},
                {0.0, 0.05, 0.05},
                {-3.2, -4.8, -8.0},
                {-10.1, 9.1, -1.0}
        };
        return testData;
    }

    @DataProvider(name = "intSubData")
    Object[][] intSubData() {
        Object[][] testData = {
                {4, 2, 2},
                {0, 0, 0},
                {-8, -5, -3},
                {-1, 9, -10}
        };
        return testData;
    }

    @DataProvider(name = "floatSubData")
    Object[][] floatSubData() {
        Object[][] testData = {
                {4.1, 2.1, 2.0},
                {0.05, 0.05, 0.0},
                {-8.0, -4.8, -3.2},
                {-1.0, 9.1, -10.1}
        };
        return testData;
    }

    @DataProvider(name = "intMultData")
    Object[][] intMultData() {
        Object[][] testData = {
                {2, 2, 4},
                {1, 0, 0},
                {3, 1, 3},
                {-2, 9, -18}
        };
        return testData;
    }

    @DataProvider(name = "floatMultData")
    Object[][] floatMultData() {
        Object[][] testData = {
                {2.1, 2.0, 4.2},
                {1.1, 0.0, 0.0},
                {3.1, 1.0, 3.1},
                {-2.0, 9.2, -18.4}
        };
        return testData;
    }

    @DataProvider(name = "intDivData")
    Object[][] intDivData() {
        Object[][] testData = {
                {2, 2, 1},
                {3, -1, -3},
                {18, -9, -2}
        };
        return testData;
    }

    @DataProvider(name = "floatDivData")
    Object[][] floatDivData() {
        Object[][] testData = {
                {2.3, 2.3, 1},
                {3, -1.5, -2},
                {18.4, -9.2, -2}
        };
        return testData;
    }


    @DataProvider(name = "powData")
    Object[][] powData() {
        Object[][] testData = {
                {2.1, 0.0, 1.0},
                {2.1, 1.0, 2.1},
                {2.0, 5.0, 32.0},
                {-2.0, 3.0, -8.0},
                {4.0, 1.5, 8.0},
                {2.0, -1.0, 0.5}
        };
        return testData;
    }

    @DataProvider(name = "sqrtData")
    Object[][] sqrtData() {
        Object[][] testData = {
                {4.0, 2.0},
                {0.0, 0.0},
        };
        return testData;
    }

    @DataProvider(name = "sinData")
    Object[][] sinData() {
        Object[][] testData = {
                {0.0, 0.0},
                {Math.PI / 2, 1.0},
                {Math.PI / 6, 0.5},
                {Math.PI, 0.0},
                {Math.PI * 3 / 2, -1.0},
                {Math.PI * 5 / 6, 0.5},
                {Math.PI * 7 / 6, -0.5}
        };
        return testData;
    }

    @DataProvider(name = "cosData")
    Object[][] cosData() {
        Object[][] testData = {
                {0.0, 1.0},
                {Math.PI / 2, 0.0},
                {Math.PI / 3, 0.5},
                {Math.PI, -1.0},
                {Math.PI * 3 / 2, 0.0},
                {Math.PI * 2 / 3, 0.5},
                {-Math.PI / 3, 0.5},
                {Math.PI * 4 / 3, -0.5}
        };
        return testData;
    }

    @DataProvider(name = "tgData")
    Object[][] tgData() {
        Object[][] testData = {
                {0.0, 0.0},
                {Math.PI, 0.0},
                {Math.PI / 4, 1.0},
                {-Math.PI / 4, -1.0}
        };
        return testData;
    }

    @DataProvider(name = "ctgData")
    Object[][] ctgData() {
        Object[][] testData = {
                {Math.PI / 4, 1.0},
                {-Math.PI / 4, -1.0},
                {Math.PI / 2, 0.0},
                {-Math.PI / 2, 0.0}
        };
        return testData;
    }

    @DataProvider(name = "isPositiveData")
    Object[][] isPositiveData() {
        Object[][] testData = {
                {-1, false},
                {0, false},
                {1, true}
        };
        return testData;
    }

    @DataProvider(name = "isNegativeData")
    Object[][] isNegativeData() {
        Object[][] testData = {
                {-1, true},
                {0, false},
                {1, false}
        };
        return testData;
    }

}
