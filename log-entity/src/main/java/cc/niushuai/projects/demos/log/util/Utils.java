package cc.niushuai.projects.demos.log.util;

import cc.niushuai.projects.demos.log.entity.UserInfo;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;

/**
 * TODO
 *
 * @author niushuai
 * @date 2021/12/13 11:30
 */
public class Utils {

    public static UserInfo randomUserInfo() {
        return new UserInfo(IdUtil.simpleUUID(), RandomUtil.randomString(8));
    }
}
