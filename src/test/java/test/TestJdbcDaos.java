package test;

import dao.jdbc.JdbcDaoFactory;
import dao.interfaces.direccion.PaisDao;
import dao.interfaces.direccion.ProvinciaDao;
import dao.jdbc.direccion.JdbcPaisDao;
import dao.jdbc.direccion.JdbcProvinciaDao;
import model.direccion.Pais;
import model.direccion.Provincia;
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

    @Test
    public void provinciaDao() {
        try (JdbcDaoFactory f = new JdbcDaoFactory()) {
            final ProvinciaDao provinciaDao = f.getDao(JdbcProvinciaDao.class);
            Provincia p = new Provincia("Fornosa");
            provinciaDao.insert(p);
            Provincia pro = new Provincia("Formosa");
            provinciaDao.update(p.getIdProvincia(), pro);
            for (Provincia provincia : provinciaDao.getAll()) {
                System.out.println(provincia);
            }
            provinciaDao.delete(p.getIdProvincia());
        }
    }

}