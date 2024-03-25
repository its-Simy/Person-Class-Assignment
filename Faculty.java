public class Faculty extends Person {
    protected HiringDate hiringdate;
    private String facultyID;

    Faculty(){
        this.firstName ="";
        this.lastName = "";
        this.dob = new myDOB(1,1,1);
        this.hiringdate = new HiringDate(1,1,1);
        this.facultyID = "";
    }
    Faculty(String _firstName){
        this.firstName = _firstName;
        this.lastName = "";
        this.dob = new myDOB(1,1,1);
        this.hiringdate = new HiringDate(1,1,1);
        this.facultyID = "Does not have one yet";
    }
    Faculty(String _firstName,String _lastName){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(1,1,1);
        this.hiringdate = new HiringDate(1,1,1);
        this.facultyID = "Does not have one yet";
    }
    Faculty(String _firstName, String _lastName, myDOB _dob){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(_dob);
        this.hiringdate = new HiringDate(1,1,1);
        this.facultyID = "Does not have one yet";

    }
    Faculty(String _firstName, String _lastName, myDOB _dob, HiringDate _hiringdate) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(_dob);
        this.hiringdate = new HiringDate(_hiringdate);
        this.facultyID = "Does not have one yet";
    }
    Faculty(String _firstName, String _lastName, myDOB _dob, HiringDate _hiringdate, String _facultyID) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(_dob);
        this.hiringdate = new HiringDate(_hiringdate);
        this.facultyID = _facultyID;
    }


    public void setFacultyID(String _facultyID){
        this.facultyID = _facultyID;
    }
    public String getFacultyID(){
        return this.facultyID;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob= " + dob.toString() +  '\'' +
                " , Hiring Date= " +
                hiringdate.toString() +
                '}';
    }
}
