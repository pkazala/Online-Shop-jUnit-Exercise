import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  mik
 * @version 0.1
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        SalesItem salesIte1 = new SalesItem("Java for complete Idiots", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I learned all my Java from it.", 4));
        assertEquals(1, salesIte1.getNumberOfComments());
    }

    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        SalesItem salesIte1 = new SalesItem("Java For Complete Idiots, Vol 2", 19900);
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", -5));
    }

    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals("test name", salesIte1.getName());
        assertEquals(1000, salesIte1.getPrice());
    }

    @Test
    public void testRatingAndSameAuthor()
    {
        SalesItem salesIte1 = new SalesItem("Book about something", 20);
        assertEquals(true, salesIte1.addComment("A. Complainer", "Did not like it", 1));
        assertEquals(false, salesIte1.addComment("A. Complainer", "Awful", 2));
    }

    @Test
    public void testBoundaries1()
    {
        SalesItem salesIte1 = new SalesItem("Yessir", 2050);
        assertEquals(true, salesIte1.addComment("M. Boundarier", "Dunno", 1));
    }
    @Test
    public void testBoundariesUnder()
    {
        SalesItem salesIte1 = new SalesItem("Yessir", 2050);
        assertEquals(false, salesIte1.addComment("M. Boundarier", "Dunno", 0));
    }
    @Test
    public void testBoundaries5()
    {
        SalesItem salesIte1 = new SalesItem("Yessir", 2050);
        assertEquals(true, salesIte1.addComment("M. Boundarier", "Dunno", 5));
    }
    @Test
    public void testBoundariesAbove()
    {
        SalesItem salesIte1 = new SalesItem("Yessir", 2050);
        assertEquals(false, salesIte1.addComment("M. Boundarier", "Dunno", 6));
    }

    @Test
    public void findMostHelpful()
    {
        SalesItem salesIte1 = new SalesItem("Nuthin", 3);
        //salesIte1.addComment("O. K.", "OK", 2);
        assertEquals(null, salesIte1.findMostHelpfulComment());
    }
}






