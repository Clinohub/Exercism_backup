class Darts {
    int score(double xOfDart, double yOfDart) {
        double aim = (xOfDart * xOfDart) + (yOfDart * yOfDart);

        if (aim <= 1)
            return 10;

        if (aim <= 5*5)
            return 5;

        if (aim <= 10*10)
            return 1;

        return 0;
    }
}
