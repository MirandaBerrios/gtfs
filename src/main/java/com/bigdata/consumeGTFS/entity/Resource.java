package com.bigdata.consumeGTFS.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Resource {
    public String mimetype;
    public Object cache_url;
    public String hash;
    public String description;
    public String name;
    public Date created;
    public String url;
    public boolean datastore_active;
    public String format;
    public String package_id;
    public String id;
    public Object cache_last_updated;
    public String state;
    public Object mimetype_inner;
    public Date last_modified;
    public int position;
    public String revision_id;
    public String url_type;
    public boolean datastore_contains_all_records_of_source_file;
    public Object resource_type;
    public int size;
}
