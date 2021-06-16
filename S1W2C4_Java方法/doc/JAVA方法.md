# JAVA方法

主方法：程序的入口

方法：用来解决一类问题的代码的有序组合，是一个功能模块

## 方法的声明和调用

### 语法格式：

访问修饰符 返回类型 方法名(参数列表){

​ 方法体

}

访问修饰符：方法允许被访问的权限范围

- public
- private
- protected

返回类型：void或其他任意数据类型

### 方法分类：

- 无参无返回值
- 无参带返回值
- 带参无返回值
- 带参带返回值

## 无参无返回值方法

```java
// 输出一串星号
public void printAster(){
        System.out.println("********************")
        }
```

\***方法在类的内部定义**

1. 在主方法中创建类的对象
2. 使用对象名.方法名()去调用方法

## 无参带返回值方法

```java
// 求长方形的面积
public int getArea(){
        int length=10;
        int width=5;
        int area=length*width;
        return area;
        }
```

## 带参无返回值方法

```java
// 求两个float类型数据最大值并打印输出
public void getMaxFloat(float a,float b){
        float max;
        if(a>b){
        max=a;
        }else{
        max=b;
        }
        System.out.println("The larger number is "+max);
        }

```

## 方法的重载