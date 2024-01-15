package com.ssafy.hoodies.model.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Builder
@Data
@CompoundIndex(def = "{'like': -1, 'createdAt': -1}")
@CompoundIndex(def = "{'type': 1, 'writer': 1}")
@Document(collection = "board")
public class Board {
    @Id
    private String _id;

    private String writer;

    private String title;

    private String content;

    private String category;

    private int type;

    private int hit;

    private int like;

    @Indexed(direction = IndexDirection.DESCENDING)
    private String createdAt;

    private String modifiedAt;

    private List<Comment> comments;

    private Map<String, Boolean> contributor;

    private Set<String> reporter;

    private List<String> filePaths;
}
