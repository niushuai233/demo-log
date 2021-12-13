package cc.niushuai.projects.demos.log.app;

import cc.niushuai.projects.demos.log.entity.UserInfo;
import cn.hutool.core.util.RandomUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO
 *
 * @author niushuai
 * @date 2021/12/13 10:50
 */
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    /**
     * 打印用户信息
     *
     * @param userInfo 用户信息
     * @author niushuai
     * @date: 2021/12/13 11:01
     * @return: void
     */
    public void printInfo(UserInfo userInfo) {

        log.trace("trace UserInfo: id = {}, username = {}, randomValue = {}",
                userInfo.getId(), userInfo.getUsername(), RandomUtil.randomInt(100));

        log.debug("UserInfo: id = {}, username = {}, randomValue = {}",
                userInfo.getId(), userInfo.getUsername(), RandomUtil.randomInt(100));

        log.info("UserInfo: id = {}, username = {}, randomValue = {}",
                userInfo.getId(), userInfo.getUsername(), RandomUtil.randomInt(100));

        log.warn("UserInfo: id = {}, username = {}, randomValue = {}",
                userInfo.getId(), userInfo.getUsername(), RandomUtil.randomInt(100));

        log.error("UserInfo: id = {}, username = {}, randomValue = {}",
                userInfo.getId(), userInfo.getUsername(), RandomUtil.randomInt(100));
    }
}
