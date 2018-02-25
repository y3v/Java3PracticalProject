package DAL;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import Model.Experience;
import DAL.MyBatisUtil;

public class ExperienceDAO {
	
	public Experience getById(Integer id) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  Experience experience = session.selectOne("mybatis.maps.ExperienceMapper.selectExperience", id);
		  session.close();
		  return experience;
	}
	
	public List<Experience> getAllExperiencesForEmployeeId(Integer empId) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<Experience> experiences = session.selectList("mybatis.maps.ExperienceMapper.selectAllExperiencesForEmployee", empId);
		session.close();
		return experiences;
	}
		
	public void insert(Experience experience){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.insert("mybatis.maps.ExperienceMapper.insertExperience", experience);
		  session.commit();
		  session.close();
	}
	
	public void update(Experience experience){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.update("mybatis.maps.ExperienceMapper.updateExperience", experience);
		  session.commit();
		  session.close();
	}
	
	public void softDelete(Experience experience){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.update("mybatis.maps.ExperienceMapper.softDeleteExperience", experience);
		  session.commit();
		  session.close();
	}
	
	public void delete(Integer id){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.delete("mybatis.maps.ExperienceMapper.deleteExperience", id);
		  session.commit();
		  session.close();
		}
}
