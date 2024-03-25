public class Main {
    public static void main(String[] args) {
        //base info given inside of zip file
        Student s1 = new Student();
        Student s2 = new Student("Mohammad","Alshibli");
        System.out.println(s2.toString());
        System.out.println();

        //the following uses setter and getter for the student class along with use of date
        myDOB date = new myDOB(3,5,2022);
        Student s3 = new Student("Simon", "Ramirez",  date );
        System.out.println(s3.toString());
        s3.setStudentID("R02110079");
        System.out.println();

        System.out.println(s3.getStudentID());
        System.out.println();

        myDOB fac = new myDOB(5,2,2000);
        HiringDate fachiringd = new HiringDate(1,1,2024);
        Faculty teacher = new Faculty("Oscar", "Gurrero", fac, fachiringd);
        System.out.println(teacher.toString());
        System.out.println();

        Admin tech = new Admin("Simon","Gonzales");
        System.out.println(tech.toString());






    }
}
