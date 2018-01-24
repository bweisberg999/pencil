import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PencilTest {
    Paper paper;
    Pencil pencil;

    @Before
    public void setUp() {
            paper = new Paper();
            pencil = new Pencil();
        }

    @Test
    public void whenPencilIsCreatedDurabilityIsAt100Percent() {
        assertEquals(100, pencil.getDurability());
    }
}
