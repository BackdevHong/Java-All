package domain.userinfo.dao.oracle;

import domain.userinfo.UserInfo;
import domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into Oracle DB userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("insert into Oracle DB userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("insert into Oracle DB userId = " + userInfo.getUserId());
    }
}
