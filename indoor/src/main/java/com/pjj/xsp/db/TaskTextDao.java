package com.pjj.xsp.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TASK_TEXT".
*/
public class TaskTextDao extends AbstractDao<TaskText, Long> {

    public static final String TABLENAME = "TASK_TEXT";

    /**
     * Properties of entity TaskText.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Text = new Property(1, String.class, "text", false, "TEXT");
        public final static Property OrderType = new Property(2, String.class, "orderType", false, "ORDER_TYPE");
        public final static Property TempletType = new Property(3, String.class, "templetType", false, "TEMPLET_TYPE");
        public final static Property OrderId = new Property(4, String.class, "orderId", false, "ORDER_ID");
        public final static Property ShowTime = new Property(5, int.class, "showTime", false, "SHOW_TIME");
    }

    private DaoSession daoSession;


    public TaskTextDao(DaoConfig config) {
        super(config);
    }
    
    public TaskTextDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TASK_TEXT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"TEXT\" TEXT NOT NULL ," + // 1: text
                "\"ORDER_TYPE\" TEXT NOT NULL ," + // 2: orderType
                "\"TEMPLET_TYPE\" TEXT NOT NULL ," + // 3: templetType
                "\"ORDER_ID\" TEXT NOT NULL ," + // 4: orderId
                "\"SHOW_TIME\" INTEGER NOT NULL );"); // 5: showTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TASK_TEXT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TaskText entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getText());
        stmt.bindString(3, entity.getOrderType());
        stmt.bindString(4, entity.getTempletType());
        stmt.bindString(5, entity.getOrderId());
        stmt.bindLong(6, entity.getShowTime());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TaskText entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getText());
        stmt.bindString(3, entity.getOrderType());
        stmt.bindString(4, entity.getTempletType());
        stmt.bindString(5, entity.getOrderId());
        stmt.bindLong(6, entity.getShowTime());
    }

    @Override
    protected final void attachEntity(TaskText entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public TaskText readEntity(Cursor cursor, int offset) {
        TaskText entity = new TaskText( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // text
            cursor.getString(offset + 2), // orderType
            cursor.getString(offset + 3), // templetType
            cursor.getString(offset + 4), // orderId
            cursor.getInt(offset + 5) // showTime
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TaskText entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setText(cursor.getString(offset + 1));
        entity.setOrderType(cursor.getString(offset + 2));
        entity.setTempletType(cursor.getString(offset + 3));
        entity.setOrderId(cursor.getString(offset + 4));
        entity.setShowTime(cursor.getInt(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(TaskText entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(TaskText entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TaskText entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
