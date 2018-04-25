/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning_sql_server;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class Learning_SQL_Server {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        String Url="jdbc:sqlserver://localhost:1433;databaseName=QLNS;user=sa;password=Hoamoclan123@";
	     Connection Con = DriverManager.getConnection(Url);
            if(Con!= null)
		{
		 System.out.println("Connected with SQL Server");
		 DatabaseMetaData Dt= (DatabaseMetaData) Con.getMetaData();
		 System.out.println(" Information Drivername "+Dt.getDriverName() );
                 System.out.println(" Information DriverVision "+ Dt.getDriverVersion());
		 System.out.println(" Information Driver Productname "+ Dt.getDatabaseProductName());
       
		}
            else
                System.out.println("Something Wrong ");
		
        // Truy vÃ¢Ì�n         
        Statement Stmt= Con.createStatement();
        String Stquery=" Select * From NhanVien";
        ResultSet Rs= Stmt.executeQuery(Stquery);
        while(Rs.next())
        {
            String id= Rs.getString(1);
            String name=Rs.getString(2);
            Date birth= Rs.getDate(3);
            String Country= Rs.getString(5);
           System.out.println("Ma nhan vien: "+id+" Ten nhan vien: "+ name+ " Ngay sinh: "+birth.toString()+" que quan: "+Country);
        }
        System.out.println(Math.signum((double)('l' + 9 * 46)));
    }
    
}
