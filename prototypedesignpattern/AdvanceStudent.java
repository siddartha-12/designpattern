package prototypedesignpattern;

import lombok.Setter;

@Setter
public class AdvanceStudent extends Student{
    private int rank;

    @Override
    public String toString() {
        return "AdvanceStudent{" +
                "rank=" + rank +
                '}';
    }

    public AdvanceStudent(int rank) {
        this.rank = rank;
    }
    private AdvanceStudent(AdvanceStudent advanceStudent){
        super(advanceStudent);
        this.rank = advanceStudent.rank;
    }

    @Override
    public AdvanceStudent clone() {
        return new AdvanceStudent(this);
    }
}
