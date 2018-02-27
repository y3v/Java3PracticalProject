package DAL;

import org.apache.ibatis.session.SqlSession;
import Model.Employee;
import DAL.MyBatisUtil;

public class EmployeeDAO {
	
	public static Employee getById(Integer id) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  Employee employee = session.selectOne("mybatis.maps.EmployeeMapper.selectEmployeeById", id);
		  session.close();
		  return employee;
	}
	
	public static Employee getByUsername(String username) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  Employee employee = session.selectOne("mybatis.maps.EmployeeMapper.selectEmployeeByUsername", username);
		  session.close();
		  return employee;
	}
	
	// employee object with only username & password
	public static Employee getLogin(Employee employeeLogin) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  Employee employee = session.selectOne("mybatis.maps.EmployeeMapper.selectEmployeeLogin", employeeLogin);
		  session.close();
		  return employee;
	}
	
	public static void insert(Employee employee){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.insert("mybatis.maps.EmployeeMapper.insertEmployee", employee);
		  session.commit();
		  session.close();
	}
	
	public static void update(Employee employee){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.update("mybatis.maps.EmployeeMapper.updateEmployeeById", employee);
		  session.commit();
		  session.close();
	}
	
	public static void softDelete(Employee employee){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.update("mybatis.maps.EmployeeMapper.softDeleteEmployeeById", employee);
		  session.commit();
		  session.close();
	}
	
	public static void hardDelete(Integer id){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.delete("mybatis.maps.EmployeeMapper.deleteEmployee", id);
		  session.commit();
		  session.close();
		}
}
