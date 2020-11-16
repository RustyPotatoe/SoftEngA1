import org.joda.time.DateTime;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class Test {

    private Student trump = null;
    private Student biden = null;
    private Module wallBuilding = null;
    private Module publicRally = null;
    private Course republican = null;
    private Course democrat = null;
    private final DateTime startTime = new DateTime(2020,9,1,15,0);
    private final DateTime endTime = new DateTime(2021,6,1,15,0);

    @Before
    public void setUp(){
        trump = new Student("Donald Trump", 5, 74, "14/06/1946");
        biden = new Student("Joe Biden", 9, 77, "20/11/1942");
        wallBuilding = new Module("Wall Building101", 98);
        publicRally = new Module("Public Rally for Dummies", 188);
        republican = new Course("BA Republican Nominee", startTime, endTime);
        democrat = new Course("BA Democrat Nominee", startTime, endTime);
    }

    @org.junit.Test
    public void studentValid(){
        assertEquals("Donald Trump", trump.getName());
        assertEquals(5, trump.getId());
        assertEquals(74, trump.getAge());
        assertEquals("14/06/1946", trump.getDateOfBirth());
        assertEquals("Donald Trump74", trump.getUsername());
        assertEquals(null, trump.getCourses());

        trump.addModule(wallBuilding);
        trump.setCourses(republican);

        assertEquals(List.of(wallBuilding), trump.getModules());
        assertEquals(republican, trump.getCourses());
    }

    @org.junit.Test
    public void moduleValid(){
        publicRally.addCourse(republican);
        publicRally.addStudent(trump);

        assertEquals(188, publicRally.getId());
        assertEquals("Public Rally for Dummies", publicRally.getName());
        assertEquals(List.of(trump), publicRally.getStudents());
        assertEquals(List.of(republican), publicRally.getCourses());
    }

    @org.junit.Test
    public void courseValid(){
        publicRally.addStudent(biden);
        wallBuilding.addStudent(trump);
        democrat.addModule(publicRally);
        democrat.addModule(wallBuilding);
        democrat.addStudents(biden);

        assertEquals("BA Democrat Nominee", democrat.getName());
        assertEquals(startTime, democrat.getStartDate());
        assertEquals(endTime, democrat.getEndDate());
        assertEquals(List.of(publicRally,wallBuilding), democrat.getModules());
        assertEquals(List.of(biden), democrat.getStudents());

        democrat.toString();
    }
}
