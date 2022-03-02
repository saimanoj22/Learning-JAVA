import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class ExerciseManagementTest {
    
    private ExerciseManagement management;
    
    @Before
    public void initialize(){
        management = new ExerciseManagement();
    }
    
    @Test
    public void exerciseListEmptyAtBeginning(){
        assertEquals(0,management.exerciseList().size());
    }
    
    @Test
    public void addingExerciseGrowsListByOne(){
        management.add("Writing a Test");
        assertEquals(1,management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList(){
        management.add("Writing a Test");
        assertTrue(management.exerciseList().contains("Writing a Test"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted(){
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }
}
