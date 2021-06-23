# JAVA方法

主方法：程序的入口

方法：用来解决一类问题的代码的有序组合，是一个功能模块

## 方法的声明和调用

### 语法格式：

访问修饰符 返回类型 方法名(参数列表){

 方法体

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

### 注意事项：

- 主方法中调用同类的方法，必须使用对象进行调用
- 普通方法中调用同类的方法，可直接用方法名调用
- 基本数据类型传值：方法中对参数的修改，不会对主方法中传来的变量值产生影响
- 数组作为方法参数时，方法中对数组的值的改变会对主方法中作为实际参数传进来的数组产生影响

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

## 带参有返回值方法

```java
// 求阶乘
// 方法不能嵌套定义
public int fac(int n){
        int s=1;
        for(int i=1;i<=n;i++){
        s*=i;
        }
        return s;
        }
```

## 方法的重载

方法名**相同**，参数列表**不同**（可以是数量不同或数据类型不同）

和返回值**无关**

## 可变参数列表

```java
// 可变参数求和
public void getSum(int...n){
        int sum=0;
        for(int i:n){
        sum+=i;
        }
        System.out.println("sum = "+sum);
        }
// 类似于python中的kwarg
```

- 参数列表中如有两个以上的参数，可变参数一定在**最后**
- 可以将数组传递给可变参数列表（正向兼容）——可变参数的底层实现就是数组
- 数组作为参数时不能将多个值传给数组（反向不兼容）
- 方法定义时，数组和可变参数列表认定为非重载（其余条件相同时）
- 一个方法中只能有一个可变参数列表
- 可变参数列表所在的方法最后被调用

## 文档注释

```java
/**
 *
 * @author xxx
 * @version 1.0
 *
 */
```

可通过Javadoc命令生成文档

```cmd
javadoc -d doc xxx.java
```

