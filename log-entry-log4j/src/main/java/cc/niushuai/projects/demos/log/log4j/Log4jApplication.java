package cc.niushuai.projects.demos.log.log4j;

import cc.niushuai.projects.demos.log.app.Application;
import cc.niushuai.projects.demos.log.util.Utils;

/**
 * TODO
 *
 * @author niushuai
 * @date 2021/12/13 11:42
 */
public class Log4jApplication {

    public static void main(String[] args) {

        new Application().printInfo(Utils.randomUserInfo());
    }
}
