package xyz.mwszksnmdys.spring5.collectionType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @className: Stu
 * @author: MWS
 * @date: 2022/9/16 下午4:44
 * @description: Todo
 */
public class Stu {
    private String[] courses;
    private List<String> list;
    private Map<String, String> maps;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    private Set<String> set;
    private List<Course> courseList;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void test(){
        System.out.println("数组类型测试： " + Arrays.toString(courses));
        System.out.println("list类型测试: " + list);
        System.out.println("map类型测试: " + maps);
        System.out.println("set类型测试: " + set);
        System.out.println("list测试值为对象: " + courseList);
    }
}
