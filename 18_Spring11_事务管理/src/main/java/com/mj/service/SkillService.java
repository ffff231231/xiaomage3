package com.mj.service;

import com.mj.domain.Skill;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author 贾登辉
 * @version 1.0
 */
public interface SkillService {
    List<Skill> list();

    boolean save(Skill skill);

    boolean update(Skill skill);

    void test();
}
