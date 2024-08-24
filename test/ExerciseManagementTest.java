import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ExerciseManagementTest {
    private ExerciseManagement management;

    @Before
    public void initialize(){
         management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning(){
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne(){
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList(){
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted(){
        Exercise exercise = new Exercise("hui");
        management.add("New exercis");
        management.markAsCompleted("New exercis");
        assertFalse(exercise.isCompleted());
    }
}
