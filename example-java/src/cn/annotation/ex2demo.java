package cn.annotation;

@MyAnno(value = 12,per=Person.p1,anno2 = @MyAnno2,strs={"aa","bb"})
@MyAnno3
public class ex2demo {

    @MyAnno3
    public void show(){

    }
}
