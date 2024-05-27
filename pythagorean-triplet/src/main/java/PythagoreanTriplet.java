import java.util.ArrayList;
import java.util.List;es

class PythagoreanTriplet {
    private int a;
    private int b;
    private int c;

    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String toString() {
        return String.format("(%d, %d, %d)", a, b, c);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof PythagoreanTriplet) {
            PythagoreanTriplet pt = (PythagoreanTriplet) o;
            return a == pt.a && b == pt.b && c == pt.c;
        } else {
            return false;
        }
    }

    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    static class TripletListBuilder {
        private int n;
        private Integer maxFactor = null;

        TripletListBuilder thatSumTo(int sum) {
            this.n = sum;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }

        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            for (int a = 1; a < n / 2; a++) {
                for (int b = a + 1; b < n / 2; b++) {
                    int c = n - a - b;
                    if (a * a + b * b == c * c) {
                        if (maxFactor == null || (a <= maxFactor && b <= maxFactor && c <= maxFactor)) {
                            triplets.add(new PythagoreanTriplet(a, b, c));
                        }
                    }
                }
            }
            return triplets;
        }
    }


}
