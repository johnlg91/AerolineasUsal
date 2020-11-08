package test;

import dao.JdbcDaoFactory;
import dao.interfaces.direccion.PaisDao;
import dao.jdbc.direccion.JdbcPaisDao;
import model.direccion.Pais;
import org.junit.Test;

public class TestJdbcDaos {
    @Test
    public void paisDao() {
        try (JdbcDaoFactory f = new JdbcDaoFactory()) {
            PaisDao paisDao = f.getDao(JdbcPaisDao.class);
            for (Pais pais : paisDao.getAll()) {
                System.out.println(pais);
            }
        }
    }
}
