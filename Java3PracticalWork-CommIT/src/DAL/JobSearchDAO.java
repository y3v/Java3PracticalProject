package DAL;

import org.apache.ibatis.session.SqlSession;
import Model.JobSearch;
import DAL.MyBatisUtil;

public class JobSearchDAO {
	
	public JobSearch getById(Integer id) {
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  JobSearch jobSearch = session.selectOne("mybatis.maps.JobSearchMapper.selectJobSearch", id);
		  session.close();
		  return jobSearch;
	}
		
	public void insert(JobSearch jobSearch){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.insert("mybatis.maps.JobSearchMapper.insertJobSearch", jobSearch);
		  session.commit();
		  session.close();
	}
	
	public void update(JobSearch jobSearch){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.update("mybatis.maps.JobSearchMapper.updateJobSearch", jobSearch);
		  session.commit();
		  session.close();
	}
	
	public void softDelete(JobSearch jobSearch){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.update("mybatis.maps.JobSearchMapper.softDeleteJobSearch", jobSearch);
		  session.commit();
		  session.close();
	}
	
	public void delete(Integer id){
		  SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		  session.delete("mybatis.maps.JobSearchMapper.deleteJobSearch", id);
		  session.commit();
		  session.close();
		}
}
