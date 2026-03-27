package BridgeLabz_Java.generics;

import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public void display() {
        System.out.println("Role: " + roleName);
    }
}

// Different job roles
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String roleName) {
        super(roleName);
    }
}

class DataScientist extends JobRole {
    public DataScientist(String roleName) {
        super(roleName);
    }
}

class ProductManager extends JobRole {
    public ProductManager(String roleName) {
        super(roleName);
    }
}


// Generic Resume class
class Resume<T extends JobRole> {   // bounded generic

    private List<T> resumes = new ArrayList<>();

    public void addResume(T resume) {
        resumes.add(resume);
    }

    public List<T> getResumes() {
        return resumes;
    }
}


// Utility class
class ResumeUtils {

    // Generic method to process resume
    public static <T extends JobRole> void processResume(T role) {
        System.out.print("Processing Resume for: ");
        role.display();
    }

    // Wildcard method to handle multiple job roles
    public static void processAll(List<? extends JobRole> roles) {
        for (JobRole r : roles) {
            r.display();
        }
    }
}
public class AIDrivenResumeScreeningSystem {

    public static void main(String[] args) {

        Resume<SoftwareEngineer> seResumes = new Resume<>();
        seResumes.addResume(new SoftwareEngineer("Backend Developer"));
        seResumes.addResume(new SoftwareEngineer("Frontend Developer"));

        Resume<DataScientist> dsResumes = new Resume<>();
        dsResumes.addResume(new DataScientist("ML Engineer"));
        dsResumes.addResume(new DataScientist("Data Analyst"));

        Resume<ProductManager> pmResumes = new Resume<>();
        pmResumes.addResume(new ProductManager("Associate PM"));
        pmResumes.addResume(new ProductManager("Senior PM"));

        System.out.println("Processing Individual Resume:");
        ResumeUtils.processResume(new SoftwareEngineer("Full Stack Developer"));

        System.out.println("\nAll Software Engineer Roles:");
        ResumeUtils.processAll(seResumes.getResumes());

        System.out.println("\nAll Data Scientist Roles:");
        ResumeUtils.processAll(dsResumes.getResumes());

        System.out.println("\nAll Product Manager Roles:");
        ResumeUtils.processAll(pmResumes.getResumes());
    }
}