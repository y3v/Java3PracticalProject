package DAL;

import org.apache.ibatis.session.SqlSession;
import Model.Employer;
import DAL.MyBatisUtil;

public class EmployerDAO {
	
	public Employer getById(Integer id) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  Employer employer = session.selectOne("mybatis.maps.EmployerMapper.selectEmployerById", id);
		  session.close();
		  return employer;
	}
	
	public Employer getByUsername(String username) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  Employer employer = session.selectOne("mybatis.maps.EmployerMapper.selectEmployerByUsername", username);
		  session.close();
		  return employer;
	}
	
	// employer object with only username & password
	public Employer getLogin(Employer employerLogin) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  Employer employer = session.selectOne("mybatis.maps.EmployerMapper.selectEmployerLogin", employerLogin);
		  session.close();
		  return employer;
	}
	
	public void insert(Employer employer){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.insert("mybatis.maps.EmployerMapper.insertEmployer", employer);
		  session.commit();
		  session.close();
	}
	
	public void update(Employer employer){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.update("mybatis.maps.EmployerMapper.updateEmployerById", employer);
		  session.commit();
		  session.close();
	}
	
	public void softDelete(Employer employer){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.update("mybatis.maps.EmployerMapper.softDeleteEmployerById", employer);
		  session.commit();
		  session.close();
	}
	
	public void hardDelete(Integer id){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.delete("mybatis.maps.EmployerMapper.deleteEmployer", id);
		  session.commit();
		  session.close();
		}
}
