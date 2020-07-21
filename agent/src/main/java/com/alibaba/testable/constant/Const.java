package com.alibaba.testable.constant;

import java.util.ArrayList;
import java.util.List;

/**
 * @author flin
 */
public class Const {

    public static final String DOT = ".";
    public static final String SLASH = "/";

    public static final List<String> SYS_CLASSES = new ArrayList<String>();
    static {
        SYS_CLASSES.add("java/lang/StringBuilder");
    }

}