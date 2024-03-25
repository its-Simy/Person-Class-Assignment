public class Admin extends Person {
    protected HiringDate hiringdate;
    private String AdminID;
    Admin(){
        this.firstName ="";
        this.lastName = "";
        this.dob = new myDOB(1,1,1);
        this.hiringdate = new HiringDate(1,1,1);
        this.AdminID ="";

    }
    Admin(String _firstName){
        this.firstName = _firstName;
        this.lastName = "";
        this.dob = new myDOB(1,1,1);
        this.hiringdate = new HiringDate(1,1,1);
        this.AdminID = "Does not have one yet";
    }
    Admin(String _firstName,String _lastName){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(1,1,1);
        this.hiringdate = new HiringDate(1,1,1);
        this.AdminID = "Does not have one yet";
    }
    Admin(String _firstName, String _lastName, myDOB _dob){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(_dob);
        this.hiringdate = new HiringDate(1,1,1);
        this.AdminID = "Does not have one yet";
    }
    Admin(String _firstName, String _lastName, myDOB _dob, HiringDate _hiringdate) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(_dob);
        this.hiringdate = new HiringDate(_hiringdate);
        this.AdminID = "Does not have one yet";
    }
    Admin(String _firstName, String _lastName, myDOB _dob, HiringDate _hiringdate, String _AdminID) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(_dob);
        this.hiringdate = new HiringDate(_hiringdate);
        this.AdminID = _AdminID;
    }


    public void setAdminID(String _AdminID){
        this.AdminID = _AdminID;
    }
    public String getAdminID(){
        return this.AdminID;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob= " + dob.toString() +  '\'' +
                " , Hiring Date= " +
                hiringdate.toString() +
                ", Admin ID = " + AdminID +
                '}';
    }
}
