package com.github.kuangcp.reply.dao;

import com.github.kuangcp.reply.domain.Teacher;
import com.github.kuangcp.reply.domain.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by https://github.com/kuangcp on 17-12-4  下午12:17
 *
 * @author kuangcp
 */
public interface TopicDao extends JpaRepository<Topic, Long>{

    List<Topic> findAllByGuideId(Teacher guideId);
}
