package cc.niushuai.projects.demos.log.app;

import cc.niushuai.projects.demos.log.entity.UserInfo;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;

/**
 * TODO
 *
 * @author niushuai
 * @date 2021/12/13 11:04
 */
public class ApplicationTest {

    public static void main(String[] args) {

        UserInfo user = new UserInfo();
        user.setId(IdUtil.randomUUID());
        user.setUsername(RandomUtil.randomString(6));
        new Application().printInfo(user);
    }
}
