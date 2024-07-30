package br.dev.henriquekh.senacCourse;

sealed interface Sex {
    public String toSexString();
}

record Man() implements Sex {
    @Override
    public String toSexString() {
        return "Man";
    }
}

record Woman() implements Sex {
    @Override
    public String toSexString() {
        return "Woman";
    }
}

record Other(String other) implements Sex {
    @Override
    public String toSexString() {
        return other;
    }
}
