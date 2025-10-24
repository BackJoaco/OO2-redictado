package com.patterns;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DatabaseAuthProxy implements DatabaseAccess{
    private DatabaseRealAccess db;
    private String session;
    private String secretKey;

    public DatabaseAuthProxy(DatabaseRealAccess db, String sk){
        this.db = db;
        this.secretKey = sk;
    }

    public boolean authenticate(String session){
        if (session == secretKey){
            this.session = session;
            return true;
        }
        return false;
    }

    public boolean checkAccess(){
        return true;
    }

    public Collection<String> getSearchResults(String queryString) {
        return db.getSearchResults(queryString);
    }

    public int insertNewRow(List<String> rowData) {
        return db.insertNewRow(rowData);
    }

}
