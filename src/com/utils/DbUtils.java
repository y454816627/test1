package com.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;

public class DbUtils {
    public static DataSource dataSource=new ComboPooledDataSource();

    public static DataSource getDataSoure() {
        return dataSource;
    }
}
