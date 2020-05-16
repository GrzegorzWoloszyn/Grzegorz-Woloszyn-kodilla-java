package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
<<<<<<< HEAD
import com.mysql.cj.conf.DatabaseUrlContainer;
=======
>>>>>>> 07fa6df528f3ae56c10c83110bc0f202f2baf1a6
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
<<<<<<< HEAD

=======
>>>>>>> 07fa6df528f3ae56c10c83110bc0f202f2baf1a6
import java.util.List;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskDaoTestSuite {
    @Autowired
    private TaskDao taskDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testTaskDaoSave() {
        //Given
        Task task = new Task(DESCRIPTION, 7);

        //When
        taskDao.save(task);

        //Then
        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        Assert.assertTrue(readTask.isPresent());

        //CleanUp
        taskDao.deleteById(id);
    }

    @Test
    public void testTaskDaoFindByDuration() {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        taskDao.save(task);
        int duration = task.getDuration();

        //When
        List<Task> readTasks = taskDao.findByDuration(duration);

        //Then
<<<<<<< HEAD
//        Assert.assertEquals(2, readTasks.size());

//        //Cleanup
=======
        Assert.assertEquals(3, readTasks.size());

        //Cleanup
>>>>>>> 07fa6df528f3ae56c10c83110bc0f202f2baf1a6
        int id = readTasks.get(0).getId();
        taskDao.deleteById(id);

    }
}
