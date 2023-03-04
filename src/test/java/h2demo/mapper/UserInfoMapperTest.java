package h2demo.mapper;

import h2demo.domain.UserInfoDO;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


public class UserInfoMapperTest extends BaseMapperTest {

    @Resource
    private UserInfoMapper userInfoMapper;

    /**
     * 使用事务和回滚，保证dao的单元测试用例的独立性
     */
    @Test
    @Transactional(rollbackFor = Exception.class)
    @Rollback(true)
    public void testDeleteById() {
        int rows = userInfoMapper.deleteById(1L);
        Assertions.assertThat(rows).isGreaterThan(0);
    }


    /**
     * 使用事务和回滚，保证dao的单元测试用例的独立性
     */
    @Test
    @Transactional
    @Rollback(true)
    public void testSelectById() {
        UserInfoDO userInfoDO = userInfoMapper.selectById(1L);
        Assert.assertNotNull(userInfoDO);
        Assert.assertTrue(userInfoDO.getName().length() > 0);
    }
}
