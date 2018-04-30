package kz.sdu.project.impl;

import kz.sdu.project.register.controller.register.TestRegister;
import kz.sdu.project.register.dao.TestDao;
import kz.sdu.project.test.util.BeanContainerForTest;
import kz.sdu.project.register.util.JdbcBlog;

import kz.greetgo.db.ConnectionCallback;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.depinject.testng.AbstractDepinjectTestNg;
import kz.greetgo.depinject.testng.ContainerConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@ContainerConfig(BeanContainerForTest.class)
public class TestRegisterImplTest extends AbstractDepinjectTestNg {

  public BeanGetter<TestRegister> testRegister;
  public BeanGetter<JdbcBlog> jdbcBlog;
  public BeanGetter<TestDao> testDao;

  @Test
  public void testFotTest(){

    testDao.get().insertText("qwerty");

    Void execute = jdbcBlog.get().execute(new ConnectionCallback<Void>() {
      @Override
      public Void doInConnection(Connection connection) throws Exception {
        try(PreparedStatement preparedStatement = connection.prepareStatement("select text from test_table")){
          try(ResultSet resultSet = preparedStatement.executeQuery()){
            while (resultSet.next()){
              String text = resultSet.getString("text");
              Assert.assertEquals(text,"expected");
            }
          }
        }
        return null;
      }
    });

    String text = testRegister.get().getText();
    Assert.assertEquals(text, "expectedText");
  }
}