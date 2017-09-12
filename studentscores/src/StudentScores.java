/**
 * Created @ 2017-9-7.
 * Auther chenfan
 */
class Student {
    private String stuno;
    private String name;
    private float math;
    private float english;
    private float computer;

    public Student(String s, String n, float m, float e, float c){
        stuno = s;
        name = n;
        math = m;
        english = e;
        computer = c;
    }

    public void setStuno(String s){
        stuno = s;
    }
    public void setName(String n){
        name = n;
    }
    public void setMath(float m){
        math = m;
    }
    public void setEnglish(float e){
        english = e;
    }
    public void setComputer(float c){
        computer = c;
    }

    public String getName() {
        return name;
    }
    public String getStuno() {
        return stuno;
    }
    public float getComputer() {
        return computer;
    }
    public float getEnglish() {
        return english;
    }
    public float getMath() {
        return math;
    }

    public float sum(){ //求和
        return math + english + computer;
    }
    public float avg(){
        return this.sum() / 3;
    }
    public float max(){ //最大值
        float max = math;
        max = max>computer?max:computer;
        max = max>english?max:english;
        return max;
    }

}

public class StudentScores{
    public static void main(String args[]){
        Student stu = new Student("no 3", "Tom",91.2f,93.5f,99.0f);
        System.out.println(stu.max());
        System.out.println(stu.avg());
        stu.setComputer(22.5f);
        System.out.println(stu.getComputer());
    }
}