package com.bigdata.consumeGTFS.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tag {
    public Object vocabulary_id;
    public String state;
    public String display_name;
    public String id;
    public String name;
}
