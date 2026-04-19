// User defined exception classes
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidJobProfileException extends Exception {
    public InvalidJobProfileException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Applicant {
    private String name;
    private String jobProfile;
    private int age;

    public String getName() {
        return name;
    }
      
    public void setName(String name) {
        this.name = name;
    }
      
    public String getJobProfile() {
         return jobProfile;
    }
      
    public void setJobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
    }
      
    public int getAge() {
        return age;
    }
      
    public void setAge(int age) {
        this.age = age;
    }
}

class Validator {
    
    public boolean validateName(String name) {
        // FIXED: Added .trim() to catch names that are just blank spaces
        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean validateJobProfile(String jobProfile) {
        if (jobProfile == null) {
            return false;
        }
        
        // Case-insensitive comparison
        if (jobProfile.equalsIgnoreCase("Associate") || 
            jobProfile.equalsIgnoreCase("Clerk") || 
            jobProfile.equalsIgnoreCase("Executive") || 
            jobProfile.equalsIgnoreCase("Officer")) {
            return true;
        }
        return false;
    }

    public boolean validateAge(int age) {
        if (age >= 18 && age <= 30) {
            return true;
        }
        return false;
    }

    public void validate(Applicant applicant) throws InvalidNameException, InvalidJobProfileException, InvalidAgeException {
        if (!validateName(applicant.getName())) {
            throw new InvalidNameException("Invalid name");
        }
        
        if (!validateJobProfile(applicant.getJobProfile())) {
            throw new InvalidJobProfileException("Invalid job profile");
        }
        
        if (!validateAge(applicant.getAge())) {
            throw new InvalidAgeException("Invalid age");
        }
    }
}

class Tester {
    public static void main(String[] args) {
        try {
            Applicant applicant = new Applicant();
            applicant.setName("Jenny");
            applicant.setJobProfile("Clerk");
            applicant.setAge(25);
            
            Validator validator = new Validator();
                  
            validator.validate(applicant);
            System.out.println("Application submitted successfully!");
            
        } catch (InvalidNameException | InvalidJobProfileException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println(); // Spacing
        
        // Testing a failure case (Input 2 from your screenshots)
        try {
            Applicant applicant2 = new Applicant();
            applicant2.setName(null);
            applicant2.setJobProfile("clerk");
            applicant2.setAge(27);
            
            Validator validator2 = new Validator();
            validator2.validate(applicant2);
            System.out.println("Application submitted successfully!");
            
        } catch (InvalidNameException | InvalidJobProfileException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
