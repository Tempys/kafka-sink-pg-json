package com.justone.kafka.sink.pg.json;

import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;

import java.util.Map;

import static org.apache.kafka.common.config.ConfigDef.*;

public class PostgresSQLSinkConnectorConfig extends AbstractConfig {

    /**
     * Database host server property key
     */
    public static final String HOST_CONFIG = "db.host";
    /**
     * Database name property key
     */
    public static final String DATABASE_CONFIG = "db.database";
    /**
     * Database username property key
     */
    public static final String USER_CONFIG = "db.username";
    /**
     * Database password property key
     */
    public static final String PASSWORD_CONFIG = "db.password";
    /**
     * Schema name property key
     */
    public static final String SCHEMA_CONFIG = "db.schema";
    /**
     * Table name property key
     */
    public static final String TABLE_CONFIG = "db.table";
    /**
     * Table column names property key
     */
    public static final String COLUMN_CONFIG = "db.columns";
    /**
     * Delivery semantics property key
     */
    public static final String DELIVERY_CONFIG = "db.delivery";
    /**
     * JSON parse paths property key
     */
    public static final String PARSE_CONFIG = "db.json.parse";
    /**
     * Buffer size property key
     */
    public static final String BUFFER_CONFIG = "db.buffer.size";


    public PostgresSQLSinkConnectorConfig(ConfigDef config, Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public PostgresSQLSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }


    public static ConfigDef conf() {
        return new ConfigDef()
                .define(HOST_CONFIG, Type.STRING, Importance.HIGH, "dd")
                .define(DATABASE_CONFIG, Type.STRING, Importance.HIGH, "dd")
                .define(USER_CONFIG, Type.STRING, Importance.HIGH, "dd")
                .define(PASSWORD_CONFIG, Type.STRING, Importance.HIGH, "dd")
                .define(SCHEMA_CONFIG, Type.STRING, Importance.HIGH, "dd")
                .define(TABLE_CONFIG, Type.STRING, Importance.HIGH, "dd")
                .define(COLUMN_CONFIG, Type.STRING, Importance.HIGH, "dd")
                .define(DELIVERY_CONFIG, Type.STRING, Importance.HIGH, "dd")
                .define(PARSE_CONFIG, Type.STRING, Importance.HIGH, "dd")
                .define(BUFFER_CONFIG, Type.INT, Importance.HIGH, "dd") ;
    }


}
