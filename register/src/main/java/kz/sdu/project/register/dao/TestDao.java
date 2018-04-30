package kz.sdu.project.register.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TestDao {

  @Select("select text from test_table limit 1")
  String getTestText();

  @Insert("insert into test_table(text) values (#{text})")
  void insertText(@Param("text") String text);

}
