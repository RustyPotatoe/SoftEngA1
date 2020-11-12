import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Test {

    private Student trump = null;
    private Student biden = null;
    private Module wallBuilding = null;
    private Module publicRally = null;
    private Course republican = null;
    private Course democrat = null;

    @Before
    public void setUp(){
        trump = new Student("Donald Trump", 5, 74, "14/06/1946");
        biden = new Student("Joe Biden", 9, 77, "20/11/1942");
        wallBuilding = new Module("Wall Building101", 98);
        publicRally = new Module("Public Rally for Dummies", 188);
        republican = new Course("BA Republican Nominee", new DateTime(2020,9,1,15,0), new DateTime(2021,6,1,15,0));
        democrat = new Course("BA Democrat Nominee", new DateTime(2020,9,1,15,0), new DateTime(2021,6,1,15,0));
    }

    @org.junit.Test
    public void studentValid(){
        assertEquals("Student name does not match.","Donald Trump", trump.getName());
        assertEquals("Student id does not match.", 5, trump.getId());
        assertEquals("Student age does not match", 74, trump.getAge());
        assertEquals("Student date of birth does not match.", "14/06/1946", trump.getDateOfBirth());
        assertEquals("Student username does not match", "Donald Trump74", trump.getUsername());
        assertEquals("Student courses expected to be null.", null, trump.getCourses());
        assertEquals("Student modules expected to be null.", List.of(), trump.getModules());

        trump.addModule(wallBuilding);
        trump.setCourses(republican);

        assertEquals("Student modules does not match.", List.of(wallBuilding), trump.getModules());
        assertEquals("Student course does not match.", republican, trump.getCourses());
    }

    @org.junit.Test
    public void moduleValid(){
        assertEquals("Module id does not match.", 188, publicRally.getId());
        assertEquals("Module name does not match.", "Public Rally for Dummies", publicRally.getName());

    }

    @org.junit.Test
    public void courseValid(){

    }
}
