package models;

import play.modules.morphia.Blob;
import play.modules.morphia.Model;

import com.google.code.morphia.annotations.Entity;

@SuppressWarnings("serial")
@Entity(noClassnameStored = true)
public class User extends Model {

    @Column("nm")
    public String name;
    public Blob photo;
    public String tag = "testing";
    
}
