package com.datasource;


public class DynamicDataSourceHolder {
    private static final String defaultDataSource="dataSource1";

    private static final ThreadLocal<String> holder = new ThreadLocal<>();

    public static void putDataSourceName(String name) {
        holder.set(name);
    }

    public static String getDataSourceName() {
        return holder.get();
    }

    public static void restoreDefaultDataSource(){
        holder.set(defaultDataSource);
    }
}
