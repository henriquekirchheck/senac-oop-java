package br.dev.henriquekh.senacCourse;

public enum MaritalStatus {
    Single {
        @Override
        public String getMaritalStatusString() {
            return "Single";
        }
    },

    Married {
        @Override
        public String getMaritalStatusString() {
            return "Married";
        }
    },

    Divorced {
        @Override
        public String getMaritalStatusString() {
            return "Divorced";
        }
    },

    Widow {
        @Override
        public String getMaritalStatusString() {
            return "Widow/Widower";
        }
    };

    public abstract String getMaritalStatusString();
}
