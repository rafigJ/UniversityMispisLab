import generate.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        University university = new University("VSU");
        Faculty faculty = new Faculty("Computer science faculty");
        Institute institute = new Institute("Institute", "address");
        university.setFaculties(getArrayList(faculty));
        faculty.setInstitutes(getArrayList(institute));
        Dean dean = new Dean("Alexander Abramovich Krylovetskiy", 1, "kryl@mail.ru", 1);

        faculty.setDean(dean);

        ResearchEmployee researchEmployeeFirst = new ResearchEmployee("Research Research", 2, "some_email2@gmail.com", 2);
        ResearchEmployee researchEmployeeSecond = new ResearchEmployee("Research Research", 2, "some_email2@gmail.com", 2);

        institute.setResearchEmployees(getArrayList(researchEmployeeFirst, researchEmployeeSecond));
        researchEmployeeFirst.setInstitute(institute);
        researchEmployeeSecond.setInstitute(institute);

        Project projectFirst = new Project("Project first", 240, new Date(), new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 240));
        Project projectSecond = new Project("Project second", 450, new Date(), new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 450));

        researchEmployeeFirst.setProjects(getArrayList(projectFirst, projectSecond));

        AdministrativeEmployee administrativeEmployee = new AdministrativeEmployee("Administrative name", 3, "admin@vsu.ru", 3);

        Lecturer lecturer = new Lecturer("Evgeny Alexandrovich Kiselev", 4, "kiselev4@gmail.com", 4);

        Course courseFirst = new Course(1, "first course", 2);
        Course courseSecond = new Course(2, "second course", 3);

        lecturer.setCourses(getArrayList(courseFirst, courseSecond));
        System.out.println("END working");
    }

    @SafeVarargs
    private static <T> ArrayList<T> getArrayList(T ...elements) {
        return new ArrayList<>(List.of(elements));
    }

}