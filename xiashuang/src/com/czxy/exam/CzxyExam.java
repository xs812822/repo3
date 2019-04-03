package com.czxy.exam;

import com.czxy.model.AllAction;
import com.czxy.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author zhangjian1@itcast.cn
 * @date 2018/12/27
 * @infos
 */
public class CzxyExam implements AllAction {


    @Override
    public ArrayList<Student> readStudentFile(File file) {
        file =new File("student.cz");
        try {
            FileInputStream is =new FileInputStream(file.getPath());
            Properties pro =new Properties();
            pro.load(is);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    public int saveToFile(ArrayList<Student> students) {
        return 0;
    }

    @Override
    public int addStudent(Student student) {
        return 0;
    }

    @Override
    public List<Student> allQuery() {
        return null;
    }

    @Override
    public Student nameQuery(String name) {
        return null;
    }

    @Override
    public Student phoneQuery(String phone) {
        return null;
    }

    @Override
    public ArrayList<Student> phoneQuery(String phone, int type) {
        return null;
    }

    @Override
    public ArrayList<Student> sexQuery(String sex) {
        return null;
    }

    @Override
    public int updateStudentInfos(Student student) {
        return 0;
    }

    @Override
    public int removeStudentInfos(Student student) {
        return 0;
    }
}
