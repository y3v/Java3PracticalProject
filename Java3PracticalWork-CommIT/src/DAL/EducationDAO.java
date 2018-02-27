package DAL;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import Model.Education;
import DAL.MyBatisUtil;

public class EducationDAO {
	
	public static Education getById(Integer id) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  Education education = session.selectOne("mybatis.maps.EducationMapper.selectEducation", id);
		  session.close();
		  return education;
	}
	
	public static List<Education> getByEmployeeId(Integer id) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  List<Education> educations = session.selectList("mybatis.maps.EducationMapper.selectEducationByEmployeeId", id);
		  session.close();
		  return educations;
	}
		
	public static Education insert(Education education){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.insert("mybatis.maps.EducationMapper.insertEducation", education);
		  session.commit();
		  session.close();
		  
		  return education;
	}
	
	public static Education update(Education education){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.update("mybatis.maps.EducationMapper.updateEducation", education);
		  session.commit();
		  session.close();
		  
		  return education;
	}
	
	public void softDelete(Education education){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.update("mybatis.maps.EducationMapper.softDeleteEducation", education);
		  session.commit();
		  session.close();
	}
	
	public void delete(Integer id){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.delete("mybatis.maps.EducationMapper.deleteEducation", id);
		  session.commit();
		  session.close();
		}
}
