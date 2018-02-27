package DAL;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import Model.ActionsDoubleId;
import Model.Language;
import DAL.MyBatisUtil;

public class LanguageDAO {
	
	public static Language getByCode(String code) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  Language language = session.selectOne("mybatis.maps.LanguageMapper.selectLanguage", code);
		  session.close();
		  return language;
	}
	
	public static Language getByLanguageName(String name) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  Language language = session.selectOne("mybatis.maps.LanguageMapper.selectLanguageByName", name);
		  session.close();
		  return language;
	}
	
	public static List<Language> getByEmployeeId(Integer employeeId) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  List<Language> languages = session.selectList("mybatis.maps.LanguageMapper.selectLanguagesByEmployeeId", employeeId);
		  session.close();
		  return languages;
	}

	public static void insert(Language language){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.insert("mybatis.maps.LanguageMapper.insertLanguage", language);
		  session.commit();
		  session.close();
	}
	
	public static void insertRelationShip(ActionsDoubleId idid){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.insert("mybatis.maps.LanguageMapper.insertLanguageRelationShip", idid);
		  session.commit();
		  session.close();
	}
	
	public static void update(Language language){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.update("mybatis.maps.LanguageMapper.updateLanguage", language);
		  session.commit();
		  session.close();
	}

	public void delete(String code){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.delete("mybatis.maps.LanguageMapper.deleteLanguage", code);
		  session.commit();
		  session.close();
		}
	
	public static void deleteRelationship(ActionsDoubleId idid){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.delete("mybatis.maps.LanguageMapper.deleteLanguage", idid);
		  session.commit();
		  session.close();
		}
}
