public class Assignment01_20220808025 {

    public static void main(String[] args) {

    }

}
class Course{
    private String departmentCode;
    private int courseNumber;

    private String title;
    private  String description;
    private int akts;

public Course(String departmantCode, int courseNumber, String title, String description, int akts){
this.departmentCode=departmantCode;
this.courseNumber=courseNumber;
this.title=title;
this.akts=akts;
this.description=description;
}

    public String getDepartmentCode() {
        return departmentCode;
    }


    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAkts() {
        return akts;
    }

    public void setAkts(int akts) {
        this.akts = akts;
    }
    public String courseCode(){
    return departmentCode+courseNumber;
    }

    @Override
    public String toString() {
        return courseCode()+ " - "+ title+ " ("+ akts + ")";
    }
}


class Person{
    private String name;
    private String email;
    private int id;
    private String departmentCode;
public Person(String name, String email, int id, String departmentCode){
    this.name=name;
    this.email=email;
    this.id=id;
    this.departmentCode=departmentCode;
}

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name+" - ("+id+") - "+email;
    }
}

class Teacher extends Person {
    private int rank;

    public Teacher(String name, String email, int id, String deparmentCode, int rank) {
        super(name, email, id, deparmentCode);
        this.rank = rank;
    }

    public void setRank(int rank) {
        if (rank > 0 && rank < 5) {
            this.rank = rank;
        }
    }

    public String getTitle() {
        switch (rank) {
            case 1:
                return "Lecturer";
            case 2:
                return "Assistant Professor";
            case 3:
                return "Associate Professor";
            case 4:
                return "Professor";
            default:
                System.out.println("ERROR: Invalid rank");
                return "Error";
        }
    }

    public void promote(){
        if(rank!=4) {rank++;}
    }
    public void  demote(){
        if(rank!=0){rank--;}

    }

    @Override
    public String toString() {
        return getTitle()+ " " +super.toString();
    }
}


class Student extends Person {
    private int akts;
    public Student(String  name,String  email,int id, String department){
    super(name,email,id,department);
    this.akts = 0;
    }

    public int getAkts() {
        return akts;
    }
    public void passCourse(Course course) {
    this.akts+=course.getAkts();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class GradStudent extends Person{
    private int rank;
    private String thesisTopic;
    public GradStudent(String name, String email, int id, String department, int rank, String thesisTopic){
    super(name,email,id,department);
    this.rank=rank;
    this.thesisTopic=thesisTopic;
    }

    public void setRank(int rank) {
        if(rank>0 && rank<4){this.rank = rank;}
    }
    public String getLevel(){
    switch (rank){
        case 1: return "Master’s Student";
        case 2: return "Doctoral Student";
        case 3: return  "Doctoral Candidate";
        default:
            System.out.println("error");
    }
return "error";

    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }

}


