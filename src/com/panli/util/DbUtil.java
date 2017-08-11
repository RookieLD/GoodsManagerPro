package com.panli.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ���ݿ������
 * @author Peter
 *
 */
public class DbUtil {
	//���ݿ�������
	private static String DriverName = "com.mysql.jdbc.Driver";
	//���ݿ�Э��
	private static String dbUril = "jdbc:mysql://localhost:3306/db_warehouse";
	//���ݿ��û���
	private static String dbName = "root";
	//���ݿ�����
	private static String dbPassword = "panli";
	
	/**
	 * ���ݿ������ļ��������ݿ�����
	 * @return
	 * @throws Exception
	 */
	public static Connection getCon() throws Exception{
		Class.forName(DriverName);
		Connection conn = DriverManager.getConnection(dbUril, dbName, dbPassword);
		return conn;
	}
	/**
	 * �ر����ݿ�����
	 * @param conn
	 * @throws SQLException
	 */
	public static void close(Connection conn) throws SQLException{
		if(conn!=null){
			conn.close();
		}
	}
	/**
	 * �ر����ݿ�����
	 * @param conn
	 * @param rs
	 * @throws SQLException
	 */
	public static void close(Connection conn, ResultSet rs) throws SQLException{
		if(rs!=null){
			rs.close();
			if(conn!=null){
				conn.close();
			}
		}
	}
	/**
	 * ����main()����
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			getCon();
			System.out.println("���ݿ����ӳɹ�!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��!");
		}
	}
	
	
}
