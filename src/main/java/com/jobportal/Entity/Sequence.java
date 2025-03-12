package com.jobportal.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sequence")
public class Sequence {
    @Id
    private String id;
    private Long seq;
}
