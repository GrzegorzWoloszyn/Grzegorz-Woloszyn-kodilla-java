package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import net.bytebuddy.build.ToStringPlugin;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList toDo = new TaskList("ToDo" ,"Tasks to do on Monday");
        TaskList done = new TaskList("Done tasks" ,"Tasks to do on Monday");
        TaskList inProgress = new TaskList("Tasks in progress" ,"Tasks to do on Monday");
        taskListDao.save(toDo);
        taskListDao.save(done);
        taskListDao.save(inProgress);

        //When
        List<TaskList> readTaskList = taskListDao.findByListName("ToDo");

        //Then
        Assert.assertEquals(1, readTaskList.size());

        //Cleanup
        taskListDao.deleteById(toDo.getId());

    }
}
