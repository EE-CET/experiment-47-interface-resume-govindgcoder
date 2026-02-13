import java.util.Scanner;

interface Resume {
    // Declare method void biodata();
    public void biodata();
}

class Teacher implements Resume {

    // Attributes
    String name;
    String qualification;
    int years;

    // Implement biodata() method to print details in the required format
    public void biodata() {
        System.out.print(
            "Name: " +
                this.name +
                "\nQualification: " +
                this.qualification +
                "\nExperience: " +
                this.years+" years"
        );
    }
}

public class InterfaceResume {

    public static void main(String[] args) {
        // Read input (Name, Qualification, Experience)
        // Assign to teacher object attributes
        Scanner sc = new Scanner(System.in);
        Teacher tc = new Teacher();
        tc.name = sc.nextLine();
        tc.qualification = sc.nextLine();
        tc.years = sc.nextInt();
        // Call teacher.biodata()
        tc.biodata();
    }
}
