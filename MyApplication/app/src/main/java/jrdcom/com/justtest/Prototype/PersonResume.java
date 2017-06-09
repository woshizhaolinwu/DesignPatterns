package jrdcom.com.justtest.Prototype;

/**
 * Created by longcheng on 2017/6/9.
 */

public class PersonResume extends ICloneable {
    private String personName;
    private String personSchool;

    public PersonResume(String name){
        personName = name;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonSchool(String personSchool) {
        this.personSchool = personSchool;
    }

    public String getPersonSchool() {
        return personSchool;
    }

    @Override
    public PersonResume clone() {
        return this.clone();
    }
}
