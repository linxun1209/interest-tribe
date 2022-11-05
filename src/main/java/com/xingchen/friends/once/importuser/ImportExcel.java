package com.xingchen.friends.once.importuser;

import com.alibaba.excel.EasyExcel;

import java.util.List;


/**
 * 导入 Excel
 *
 * @author xingchen
 */
public class ImportExcel {

    /**
     * 读取数据
     */
    public static void main(String[] args) {
        // 写法1：JDK8+
        // since: 3.0.0-beta1
        String fileName = "E:\\后端大佬成才之路\\匹配伙伴项目文件\\interest-tribe\\src\\main\\resources\\testExcel.xlsx";
        readByListener(fileName);
        System.out.println("-----------");
        synchronousRead(fileName);
    }

    /**
     * 监听器读取
     * @param fileName
     */
    public static void readByListener(String fileName) {
        EasyExcel.read(fileName, com.xingchen.friends.once.importuser.XingQiuTableUserInfo.class, new com.xingchen.friends.once.importuser.TableListener()).sheet().doRead();
    }

    /**
     * 同步读
     * @param fileName
     */
    public static void synchronousRead(String fileName) {
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 同步读取会自动finish
        List<XingQiuTableUserInfo> totalDataList =
                EasyExcel.read(fileName).head(com.xingchen.friends.once.importuser.XingQiuTableUserInfo.class).sheet().doReadSync();
        for (com.xingchen.friends.once.importuser.XingQiuTableUserInfo xingQiuTableUserInfo : totalDataList) {
            System.out.println(xingQiuTableUserInfo);
        }
    }

}
