package DAL;

import org.apache.ibatis.session.SqlSession;
import Model.Field;
import DAL.MyBatisUtil;

public class FieldDAO {
	
	public Field getByCode(Integer id) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  Field field = session.selectOne("mybatis.maps.FieldMapper.selectField", id);
		  session.close();
		  return field;
	}
		
	public void insert(Field field){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.insert("mybatis.maps.FieldMapper.insertField", field);
		  session.commit();
		  session.close();
	}
	
	public void update(Field field){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.update("mybatis.maps.FieldMapper.updateField", field);
		  session.commit();
		  session.close();
	}
	
	public void delete(Integer id){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.delete("mybatis.maps.FieldMapper.deleteField", id);
		  session.commit();
		  session.close();
		}
}
