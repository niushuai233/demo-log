package cc.niushuai.projects.demos.log.logback;

import cc.niushuai.projects.demos.log.app.Application;
import cc.niushuai.projects.demos.log.util.Utils;

/**
 * TODO
 *
 * @author niushuai
 * @date 2021/12/13 11:09
 */
public class LogbackApplication {

    public static void main(String[] args) {

        new Application().printInfo(Utils.randomUserInfo());
    }
}
