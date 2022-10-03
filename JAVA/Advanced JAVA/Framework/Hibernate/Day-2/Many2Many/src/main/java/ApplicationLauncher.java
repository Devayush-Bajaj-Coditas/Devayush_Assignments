import com.dao.OperationDao;

public class ApplicationLauncher {
    public static void main(String[] args) {
        OperationDao operationDao = new OperationDao();
        operationDao.create();
    }
}
