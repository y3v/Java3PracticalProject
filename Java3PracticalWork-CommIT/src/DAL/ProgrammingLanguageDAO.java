package DAL;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import Model.ActionsDoubleId;
import Model.Employee;
import Model.ProgrammingLanguage;
import DAL.MyBatisUtil;

public class ProgrammingLanguageDAO {
	
	public ProgrammingLanguage getById(Integer id) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  ProgrammingLanguage language = session.selectOne("mybatis.maps.ProgrammingLanguageMapper.selectProgrammingLanguage", id);
		  session.close();
		  return language;
	}
	
	public static ProgrammingLanguage getByLanguageName(String lang) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  ProgrammingLanguage language = session.selectOne("mybatis.maps.ProgrammingLanguageMapper.selectProgrammingLanguageByName", lang);
		  session.close();
		  return language;
	}
	
	public static List<ProgrammingLanguage> selectAllByEmployeeId(Integer id) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  List<ProgrammingLanguage> languages = session.selectList("mybatis.maps.ProgrammingLanguageMapper.selectProgrammingLanguagesByEmployeeId", id);
		  session.close();
		  return languages;
	}
	
	public static ProgrammingLanguage insert(ProgrammingLanguage language){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.insert("mybatis.maps.ProgrammingLanguageMapper.insertProgrammingLanguage", language);
		  session.commit();
		  session.close();
		  return language;
	}
	
	public static void insertRelationship(ActionsDoubleId idid){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.insert("mybatis.maps.ProgrammingLanguageMapper.insertProgrammingLanguageRelationship", idid);
		  session.commit();
		  session.close();
	}
	
	public void update(ProgrammingLanguage language){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.update("mybatis.maps.ProgrammingLanguageMapper.updateProgrammingLanguage", language);
		  session.commit();
		  session.close();
	}
	
	public static void delete(ActionsDoubleId idid){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.delete("mybatis.maps.ProgrammingLanguageMapper.deleteProgrammingLanguage", idid);
		  session.commit();
		  session.close();
		  
		}
}
