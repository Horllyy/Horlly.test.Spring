package domain;

public class Account {
    private Integer id;//这里 名字尽量保持和数据库一致 虽然我现在没有理出来从哪里开始数据库开始匹配的 但是一定从某个地方开始存在联系
                       //和另一个程序对比一下 一定要找出差异 另外 数据库properties文档的使用这里没使用 但是以后碰到了要注重了解一下！
                       //我知道为什么了 见AccountDaoImpl.java开头注释
    private String name;
    private Integer money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
