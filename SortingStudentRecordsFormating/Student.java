public class Student {
    private String name;
    private int physic;
    private int chemistry;
    private int math;
    private int average;

    public Student(String name, int physic, int chemistry, int math) {
        this.name = name;
        this.physic = physic;
        this.chemistry = chemistry;
        this.math = math;
        int total=physic+chemistry+math;
        this.average=total/3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPhysic() {
        return physic;
    }

    public void setPhysic(int physic) {
        this.physic = physic;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public double getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }
}
