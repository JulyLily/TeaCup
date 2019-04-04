package com.teacup.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SQ_BEAN".
*/
public class SqBeanDao extends AbstractDao<SqBean, Long> {

    public static final String TABLENAME = "SQ_BEAN";

    /**
     * Properties of entity SqBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Uid = new Property(0, Long.class, "uid", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Path = new Property(2, String.class, "path", false, "PATH");
    }


    public SqBeanDao(DaoConfig config) {
        super(config);
    }
    
    public SqBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SQ_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: uid
                "\"NAME\" TEXT," + // 1: name
                "\"PATH\" TEXT);"); // 2: path
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SQ_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, SqBean entity) {
        stmt.clearBindings();
 
        Long uid = entity.getUid();
        if (uid != null) {
            stmt.bindLong(1, uid);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(3, path);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, SqBean entity) {
        stmt.clearBindings();
 
        Long uid = entity.getUid();
        if (uid != null) {
            stmt.bindLong(1, uid);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(3, path);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public SqBean readEntity(Cursor cursor, int offset) {
        SqBean entity = new SqBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // uid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // path
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, SqBean entity, int offset) {
        entity.setUid(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPath(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(SqBean entity, long rowId) {
        entity.setUid(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(SqBean entity) {
        if(entity != null) {
            return entity.getUid();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(SqBean entity) {
        return entity.getUid() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}