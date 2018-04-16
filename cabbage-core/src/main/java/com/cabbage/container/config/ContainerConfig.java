package com.cabbage.container.config;

import java.util.Properties;

/**
 * container config
 */
public interface ContainerConfig {
    int getInt(String key, int defaultValue);
    long getLong(String key, long defaultValue);
    double getDouble(String key, double defaultValue);
    short getShort(String key, short defaultValue);
    boolean getBoolean(String key, boolean defaultValue);
    float getFloat(String key, float defaultValue);
    String get(String key, int defaultValue);
    Properties properties();
}
