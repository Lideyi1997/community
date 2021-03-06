package life.lidy.community.dto;

import life.lidy.community.model.User;
import lombok.Data;
import org.springframework.stereotype.Controller;

@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private String commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private String content;
    private Integer commentCount;
    private User user;
}
