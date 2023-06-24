package com.bigdata.consumeGTFS.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Group {
    public String display_name;
    public String description;
    public String image_display_url;
    public String title;
    public String id;
    public String name;
}
