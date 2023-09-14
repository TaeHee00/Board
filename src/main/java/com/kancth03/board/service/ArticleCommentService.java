package com.kancth03.board.service;

import com.kancth03.board.domain.ArticleComment;
import com.kancth03.board.dto.ArticleCommentDto;
import com.kancth03.board.repository.ArticleCommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleCommentService {

    private final ArticleCommentRepository articleCommentRepository;

    @Transactional(readOnly = true)
    public List<ArticleCommentDto> searchArticleComments(Long articleId) {
        return List.of();
    }

    public void saveArticleComment(ArticleComment articleComment) {
    }

    public void updateArticleComment(Long articleCommentId, String comment) {

    }

    public void deleteArticleComment(Long articleCommentId) {
    }
}
