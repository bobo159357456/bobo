package cn.eoe.usinglistview;

/**
 * Created by lyb on 14-12-12.
 */
public class ListCellData {
    public ListCellData(String userName,String sex,int age){
        this.userName = userName;
        this.sex = sex;
        this.age = age;
    }

    private String userName="小李";
    private String sex="发";
    private int age = 0;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getUserName();
    }


}
