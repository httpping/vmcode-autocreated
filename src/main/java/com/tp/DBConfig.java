package com.tp;

/**
 * 数据库配置
 *
 * @author tanping
 * @create 2017-11-09 9:50
 **/
public class DBConfig {
    public static String DB_HOST = "127.0.0.1:3306";
    public static String DB_NAME = "spring_boot";
    public static String DB_USERNAME = "root";
    public static String DB_PASSWORD = "123456";


    public static String PROJECT_ROOT_PATH = "D:\\java-work\\demo\\vmcode-autocreated\\src\\main";

    public static String PROJECT_CONSUMER_PACKAGE = "com.vpclub.consumer";
    public static String PROJECT_PROVIDER_PACKAGE = "com.vpclub.provider";

    public final static String providerConfig = "autocreate-proveider"; //提供者 配置


    //为了使用 相同的 proto文件 必须使用相同的 proto生成package
    public final static String providerProtoPackage = PROJECT_PROVIDER_PACKAGE+".rpc.api"; //提供者 proto java package


    /**
     * 一键生成
     * @param args
     */
    public static void main(String[] args) {
        MysqlProviderGenerator.run();
        MysqlConsumerGenerator.run();
    }


}
