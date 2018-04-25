/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning_sql_server;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class ConnectSQL {
   private String Url="jdbc:sqlserver://localhost:1433;databaseName=QLNS;user=sa;password=Hoamoclan123@";
   private Connection Con ;
   private Statement stmt;
   private ResultSet Rs;
   
           public void Connectdata() throws SQLException
           {
             Con= DriverManager.getConnection(Url);
            if(Con!= null)
		{
		 System.out.println("Connected with SQL Server");
		 DatabaseMetaData Dt= (DatabaseMetaData) Con.getMetaData();
		 System.out.println("Information Drivername"+Dt.getDriverName() );
                 System.out.println(" Information DriverVision "+ Dt.getDriverVersion());
		 System.out.println(" Information Driver Productname "+ Dt.getDatabaseProductName());
		}
            else
                System.out.println("Something Wrong ");
           }
    public void Querydata(String a) throws SQLException
    {
        Statement stmt= (Statement) Con.createStatement();
        Rs= stmt.executeQuery(a);
        
    }

    public ConnectSQL() {
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public Connection getCon() {
        return Con;
    }

    public void setCon(Connection Con) {
        this.Con = Con;
    }

    public Statement getStmt() {
        return stmt;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

    public ResultSet getRs() {
        return Rs;
    }

    public void setRs(ResultSet Rs) {
        this.Rs = Rs;
    }
        
}
