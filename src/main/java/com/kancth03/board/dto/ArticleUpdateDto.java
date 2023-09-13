package com.kancth03.board.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.kancth03.board.domain.Article}
 */
public record ArticleUpdateDto(
        String title,
        String content,
        String hashtag
) implements Serializable {
    public static ArticleUpdateDto of(String title, String content, String hashtag) {
        return new ArticleUpdateDto(title, content, hashtag);
    }
}