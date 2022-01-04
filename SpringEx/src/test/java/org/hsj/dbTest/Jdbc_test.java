package org.hsj.dbTest;

import java.sql.Connection;

import java.sql.DriverManager;

import org.junit.Test;

public class Jdbc_test {
	private static final String DRIVER="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://127.0.0.1:3306/dbtest?serverTimezone=Asia/Seoul";
	private static final String USER="root";
	private static final String PW="1234";
	
	//테스트용 메서드 
	/* Annotaition
	 * 테스트와 관련된 어노테이션 (@)
	 * @RunWith
	 * @Contextconfiguration
	 * @Test
	 * 
	 * 테스트 방법 Run As -> 2 JUnit Test
	 * */
	@Test
   public void testConnection() throws Exception{
      Class.forName(DRIVER);
      try (Connection con=DriverManager.getConnection(URL,USER,PW)){
         System.out.println(con);
      }catch(Exception e) {
         e.printStackTrace();
      }
   }
}
