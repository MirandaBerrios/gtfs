package com.bigdata.consumeGTFS.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


import java.util.ArrayList;
import java.util.Date;
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    public String license_title;
    public String maintainer;
    public ArrayList<Object> relationships_as_object;
    @JsonProperty("private")
    public boolean myprivate;
    public String maintainer_email;
    public int num_tags;
    public String id;
    public Date metadata_created;
    public Date metadata_modified;
    public String author;
    public String author_email;
    public String state;
    public String version;
    public String creator_user_id;
    public String type;
    public ArrayList<Resource> resources;
    public int num_resources;
    public ArrayList<Tag> tags;
    public ArrayList<Group> groups;
    public String license_id;
    public ArrayList<Object> relationships_as_subject;
    public Organization organization;
    public String name;
    public boolean isopen;
    public String url;
    public String notes;
    public String owner_org;
    public ArrayList<Extra> extras;
    public String license_url;
    public String title;
    public String revision_id;
}
