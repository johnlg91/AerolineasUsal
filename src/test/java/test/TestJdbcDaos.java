package test;

import dao.interfaces.cliente.ClienteDAO;
import dao.interfaces.cliente.PasajeroFrecuenteDAO;
import dao.interfaces.direccion.DireccionDao;
import dao.interfaces.direccion.PaisDao;
import dao.interfaces.direccion.ProvinciaDao;
import dao.jdbc.JdbcDaoFactory;
import dao.jdbc.cliente.JdbcClienteDao;
import dao.jdbc.cliente.JdbcPasajeroFrecuenteDao;
import dao.jdbc.cliente.JdbcPasaporteDao;
import dao.jdbc.cliente.JdbcTelefonoDao;
import dao.jdbc.direccion.JdbcDireccionDao;
import dao.jdbc.direccion.JdbcPaisDao;
import dao.jdbc.direccion.JdbcProvinciaDao;
import model.cliente.Cliente;
import model.cliente.PasajeroFrecuente;
import model.cliente.Pasaporte;
import model.cliente.Telefono;
import model.direccion.Direccion;
import model.direccion.Pais;
import model.direccion.Provincia;
import org.junit.Test;

import java.sql.Date;
import java.time.LocalDateTime;


public class TestJdbcDaos {

    public void paisDao() {
        try (JdbcDaoFactory f = new JdbcDaoFactory()) {
            PaisDao paisDao = f.getDao(JdbcPaisDao.class);
            for (Pais pais : paisDao.getAll()) {
                System.out.println(pais);
            }
        }
    }


    public void provinciaDao() {
        try (JdbcDaoFactory f = new JdbcDaoFactory()) {
            final ProvinciaDao provinciaDao = f.getDao(JdbcProvinciaDao.class);
            Provincia p = new Provincia("Fornosa");
            provinciaDao.insert(p);
            for (Provincia provincia : provinciaDao.getAll()) {
                System.out.println(provincia);
            }

        }
    }

    @Test
    public void clienteDao() {
        try (JdbcDaoFactory f = new JdbcDaoFactory()) {
            final ProvinciaDao provinciaDao = f.getDao(JdbcProvinciaDao.class);
            Provincia provincia = provinciaDao.get(2);
            System.out.println(provincia);

            final PaisDao paisDao = f.getDao(JdbcPaisDao.class);
            Pais pais = paisDao.get(1);
            System.out.println(pais);

            final DireccionDao direccionDao = f.getDao(JdbcDireccionDao.class);
            Direccion d = direccionDao.get(1);
            System.out.println(d);

            final JdbcTelefonoDao telefonoDao = f.getDao(JdbcTelefonoDao.class);
            Telefono t = telefonoDao.get(2);
            System.out.println(telefonoDao.get(2));

            final JdbcPasaporteDao pasaporteDAO = f.getDao(JdbcPasaporteDao.class);
            Pasaporte pa = pasaporteDAO.get(1);
           System.out.println(pa);

            final PasajeroFrecuenteDAO pfrecuenteDao = f.getDao(JdbcPasajeroFrecuenteDao.class);
            PasajeroFrecuente pfr = pfrecuenteDao.get(1);

            System.out.println(pfr);

            final ClienteDAO clienteDao = f.getDao(JdbcClienteDao.class);
            Date date = new java.sql.Date(0);
            // NO INSERTAAAAA
            Cliente c = new Cliente("ariel", "perez", 222, 222, date, "aa@aa.com.ar", d, t, pa, pfr);
            System.out.println(c);
            clienteDao.insert(c);
        }
    }


//    public static void main(String[] args) {
//		TestJdbcDaos ts = new TestJdbcDaos();
//		ts.clienteDao();
//	}

   // @Test
    public void provinciasTxt() {
        try (JdbcDaoFactory factory = new JdbcDaoFactory()) {
            factory.readProvincias();
        }
    }

}