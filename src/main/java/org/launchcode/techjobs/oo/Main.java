package org.launchcode.techjobs.oo;
public class Main {

    public static void main(String[] args) {
/*
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));

        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);

        for (Job job : jobs){
            System.out.println(job);
        }
*/
    }
}

/*
TODO INSTRUCTIONS:
 ////////////////////////////////////////////////////////////////////////////
    use objects to encapsulate data & methods
    use IntelliJ generator to automate routine tasks
    use unit testing(TDD) to verify & create new methods
    apply inheritance to streamline your classes (DRY)
 /////////////////////////////////////////////////////////
    employer class is completed, code the others
    write UI to add & remove jobs:
 ////////////////////////////////////////////////////////////////////////////
    shift project to OO design
    since storing string data in HashMaps & ArrayLists only short-term solution
 ////////////////////////////////////////////////////////////////////////////
    Job class has OO, containing all fields from TechJobs console:
        name, employer, location, positionType, coreCompetency
            identify Job objects with unique id field
 ////////////////////////////////////////////////////////////////////////////
    employer differs job object from job string:
        values, location, & any non-ID fields are classes instead of strings
 ////////////////////////////////////////////////////////////////////////////
 Job Fields ---- Job class file has:
    private String name; --> only name is a string
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
 ////////////////////////////////////////////////////////////////////////////
    each property class has value & id fields:
        Employer, Location, CoreCompetency, PositionType
 ////////////////////////////////////////////////////////////////////////////
    for Job instance, get employer name:
        job is an instance of Job
        String employerName = job.getEmployer().getValue();
        toString() method of Employer class returns value field
            so that using object instance in another string context
                System.out.println(job.getEmployer()); --> prints employer name
 ////////////////////////////////////////////////////////////////////////////
    reasons to do this:
        eliminate data duplicates
        multiple jobs share field value
            for example, multiple jobs have position type “Web - Full Stack”
                since each employer may list three jobs
                    storing these field values as strings in each Job object
                        repeats that data across the app
 ================================================================================
        objects have a single PositionType object with value “Web - Full Stack”
            each job using that position type refers to an object
                use one Employer object for each employer instance
 ================================================================================
        beyond reducing raw memory data,
            this updates data in one place,
                Employer object is a company instance
 ////////////////////////////////////////////////////////////////////////////
    easy to add data properties
        Employer object has:
            address, primary contact, employer's job list
                if Location object needs zip-code list for that location
                    storing these four new properties as strings
                        within Job class is too complex
 ////////////////////////////////////////////////////////////////////////////
 run tests from their own files
 ////////////////////////////////////////////////////////////////////////////
 file tree image:
    each test file grades a task outlined below
        since no coding for first task, no TestTaskOne
            right-click on org.launchcode.techjobs.oo --> select "Run tests"
 ////////////////////////////////////////////////////////////////////////////
 run only tests associated with that task
        right-click on test file & select "Run TestTask#"
 /////////////////////////////////////////////////////////
 TASKS:
    review Employer class to see how to assign unique ID
 ================================================================================
    add getters, setters, & custom methods as needed
        to Location, CoreCompetency, & PositionType classes
 ================================================================================
    complete Job class using what you learned in steps 1 & 2
 ================================================================================
    use unit testing to verify constructors & equals methods for Job class
 ================================================================================
    use TDD to design & code custom toString() for Job class
 ================================================================================
    use inheritance to DRY:
        Employer, Location, CoreCompetency, PositionType classes
*/
