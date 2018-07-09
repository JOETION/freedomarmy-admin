import com.snow.freedomarmy.admin.app.dao.mapper.website_preview.UsersMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: Wonderland
 * @Date: 2018/7/8 17:32
 * @Description: PACKAGE_NAME
 * freedomarmy-admin
 */

public class UserMapperImpl  {
    public static  void  main( String[] args){
        InputStream config=null;
        //构建SQLsession
        try {
            //获得配置文件信息
            config= Resources.getResourceAsStream("generatorConfig.xml");
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(config);
            //开启事务
            SqlSession session=factory.openSession();
            //获得DAO，操作数据
            UsersMapper usersMapper = null;




        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
