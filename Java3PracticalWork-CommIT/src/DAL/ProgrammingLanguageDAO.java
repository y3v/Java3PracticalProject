package DAL;

import org.apache.ibatis.session.SqlSession;
import Model.ProgrammingLanguage;
import DAL.MyBatisUtil;

public class ProgrammingLanguageDAO {
	
	public ProgrammingLanguage getByCode(Integer id) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  ProgrammingLanguage language = session.selectOne("mybatis.maps.ProgrammingLanguageMapper.selectProgrammingLanguage", id);
		  session.close();
		  return language;
	}
		
	public void insert(ProgrammingLanguage language){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.insert("mybatis.maps.ProgrammingLanguageMapper.insertProgrammingLanguage", language);
		  session.commit();
		  session.close();
	}
	
	public void update(ProgrammingLanguage language){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.update("mybatis.maps.ProgrammingLanguageMapper.updateProgrammingLanguage", language);
		  session.commit();
		  session.close();
	}
	
	public void delete(Integer id){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.delete("mybatis.maps.ProgrammingLanguageMapper.deleteProgrammingLanguage", id);
		  session.commit();
		  session.close();
		}
}
