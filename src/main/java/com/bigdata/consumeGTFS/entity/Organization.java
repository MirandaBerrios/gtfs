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
public class Organization {
    public String description;
    public Date created;
    public String title;
    public String name;
    public boolean is_organization;
    public String state;
    public String image_url;
    public String revision_id;
    public String type;
    public String id;
    public String approval_status;
}
