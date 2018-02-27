package DAL;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import Model.Experience;
import DAL.MyBatisUtil;

public class ExperienceDAO {
	
	public static Experience getById(Integer id) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  Experience experience = session.selectOne("mybatis.maps.ExperienceMapper.selectExperience", id);
		  session.close();
		  return experience;
	}
	
	public static List<Experience> getAllExperiencesForEmployeeId(Integer id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<Experience> experiences = session.selectList("mybatis.maps.ExperienceMapper.selectAllExperiencesForEmployee", id);
		session.close();
		return experiences;
	}
		
	public static Experience insert(Experience experience){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.insert("mybatis.maps.ExperienceMapper.insertExperience", experience);
		  session.commit();
		  session.close();
		  return experience;
	}
	
	public static Experience update(Experience experience){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.update("mybatis.maps.ExperienceMapper.updateExperience", experience);
		  session.commit();
		  session.close();
		  
		  return experience;
	}
	
	public static void softDelete(Experience experience){
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
