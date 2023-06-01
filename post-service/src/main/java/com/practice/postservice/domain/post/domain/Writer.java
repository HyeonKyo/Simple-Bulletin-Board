package com.practice.postservice.domain.post.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Writer {
    @Column(name = "member_id")
    private Long id;

    @Column(name = "nickname")
    private String name;
}
