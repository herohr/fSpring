import com.herohr.springStudy.dao.BookDao;
import com.herohr.springStudy.dao.StudentDao;
import com.herohr.springStudy.models.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BookDaoTest extends BaseTest {
    @Autowired
    private BookDao bookDao;

    @Test
    public void testQueryById() throws Exception {
        long bookId = 1000;
        Book book = bookDao.queryById(bookId);
        System.out.println(book);
    }
}
