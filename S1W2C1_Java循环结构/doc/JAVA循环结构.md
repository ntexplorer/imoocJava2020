# JAVA循环结构

## while循环

```java
while(condition){
	code block;
}
```

## 多种数据类型接收方法总结

| 接收数据   | 方法          |
| ---------- | ------------- |
| int类型    | nextInt()     |
| long类型   | nextLong()    |
| float类型  | nextFloat()   |
| double类型 | nextDouble()  |
| 字符串类型 | next()        |
| 布尔类型   | nextBoolean() |

## do-while循环

```java
do
{
    code block;
} while(condition);
```

1. do-while循环至少执行一次
2. 循环条件后的分号不能丢

**随机数**：Math.random()得到[0,1)之间的随机数

## for循环

```java
for(condition1; condition2; condition3){
    code block;
}
```

**break**：跳出当前循环

```java
for(;;){}
//语法上成立，需手动设置其他条件
```

## 三种环结构的应用场景

1. 从for循环的结构看，三个表达式会依次被执行到，执行的顺序也是固定的，所以for循环适用于循环次数固定的场景；
2. while循环，只有一个判断条件，结果为布尔值，如果为true就执行，为false就不执行。所以while循环适用于不知道循环次数，只知道循环达到某个条件可以执行时使用。（循环内需要改变循环变量）；
3. do-while循环，与while循环类似，只是判断条件放到了循环最后，不管是否满足条件，循环都会被执行一次。因此适用于不知道循环具体执行次数，只知道满足某个条件继续执行或结束执行，且循环肯定执行一次时使用。

## 循环嵌套

```java
while(condition){
    code block;
        while(condition){
            code block;
        }
    code block;
}
```

## break语句

- 结束当前循环的执行
- 当前循环体后面的语句不会执行
- 多重循环中只跳出一层循环

## continue语句

- 只能用在循环里
- 结束当前循环的执行，但是继续下一次循环的执行

## debug相关

调试的作用：看清程序每一步的效果

1. 设置断点
2. 执行调试

