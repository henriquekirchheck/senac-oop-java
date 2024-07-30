package br.dev.henriquekh.senacCourse;

public enum AgeRating {
    AgeL {
        @Override
        public int getMinimumAge() {
            return 0;
        }
    },
    AgeAL {
        @Override
        public int getMinimumAge() {
            return 0;
        }
    },
    Age10 {
        @Override
        public int getMinimumAge() {
            return 10;
        }
    },
    AgeA10 {
        @Override
        public int getMinimumAge() {
            return 10;
        }
    },
    Age12 {
        @Override
        public int getMinimumAge() {
            return 12;
        }
    },
    AgeA12 {
        @Override
        public int getMinimumAge() {
            return 12;
        }
    },
    Age14 {
        @Override
        public int getMinimumAge() {
            return 14;
        }
    },
    AgeA14 {
        @Override
        public int getMinimumAge() {
            return 14;
        }
    },
    Age16 {
        @Override
        public int getMinimumAge() {
            return 16;
        }
    },
    AgeA16 {
        @Override
        public int getMinimumAge() {
            return 16;
        }
    },
    Age18 {
        @Override
        public int getMinimumAge() {
            return 18;
        }
    },
    AgeA18 {
        @Override
        public int getMinimumAge() {
            return 18;
        }
    };

    public abstract int getMinimumAge();
}
