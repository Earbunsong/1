package model;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

public class JdbcImpl {
    public DataSource dataSource(){
     PGSimpleDataSource dataSource = new PGSimpleDataSource();
     dataSource.setUser("postgres");
     dataSource.setPassword("391738");
     dataSource.setDatabaseName("topic");
     return dataSource;
    }

}
