package cc.niushuai.projects.demos.log.log4j2;

import cc.niushuai.projects.demos.log.app.Application;
import cc.niushuai.projects.demos.log.util.Utils;

/**
 * TODO
 *
 * @author niushuai
 * @date 2021/12/13 11:42
 */
public class Log4j2Application {

    public static void main(String[] args) {

        new Application().printInfo(Utils.randomUserInfo());
    }
}
