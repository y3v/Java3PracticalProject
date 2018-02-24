package DAL;

import org.apache.ibatis.session.SqlSession;
import Model.Framework;
import DAL.MyBatisUtil;

public class FrameworkDAO {
	
	public Framework getById(Integer id) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  Framework framework = session.selectOne("mybatis.maps.FrameworkMapper.selectFramework", id);
		  session.close();
		  return framework;
	}
		
	public void insert(Framework framework){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.insert("mybatis.maps.FrameworkMapper.insertFramework", framework);
		  session.commit();
		  session.close();
	}
	
	public void update(Framework framework){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.update("mybatis.maps.FrameworkMapper.updateFramework", framework);
		  session.commit();
		  session.close();
	}
	
	public void delete(Integer id){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.delete("mybatis.maps.FrameworkMapper.deleteFramework", id);
		  session.commit();
		  session.close();
		}
}
