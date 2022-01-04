package org.hsj.dbTest;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//단위테스트를 스프링과 연동
@RunWith(SpringJUnit4ClassRunner.class)
//환경설정 파일 명시
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTests {
	
	// Autowried로  Bean 생성 확인
	@Autowired
	private DataSource dataSource;
	
	// 모든 테스트들은 @Test를 갖는다
	@Test
	public void testConnection() {
		try(Connection con = dataSource.getConnection()){
			System.out.println(con);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
}
