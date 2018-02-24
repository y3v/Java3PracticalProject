package DAL;

import org.apache.ibatis.session.SqlSession;
import Model.Language;
import DAL.MyBatisUtil;

public class LanguageDAO {
	
	public Language getByCode(String code) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  Language language = session.selectOne("mybatis.maps.LanguageMapper.selectLanguage", code);
		  session.close();
		  return language;
	}
		
	public void insert(Language language){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.insert("mybatis.maps.LanguageMapper.insertLanguage", language);
		  session.commit();
		  session.close();
	}
	
	public void update(Language language){
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
}
