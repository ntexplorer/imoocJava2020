# JAVA选择结构

## 流程控制

- 顺序
- 选择
- 循环

### 选择结构

- if、if-else结构
- 多重if
- 嵌套if
- switch结构

### 循环结构

- while, do-while, for
- 循环嵌套

## 多重if-else结构

```java
if (condition) {
	code block;
} else {
    code block;
}
```

多行注释： /* */

```java
if (condition1) {
	code block1;
} else if (condition2) {
	code block2;
} else {
	code block3;
}
```

## 嵌套if结构

```java
if(condition1){
	if(condition2){
		if(condition3){
			...
		}
	}
}
```

## 可以相互比较的数据类型

- int和long可以相互比较
- byte/short/int和long可以相互比较
- 浮点型之间可以相互比较
- 浮点型和整型之间可以相互比较
- 整型和字符型之间可以进行比较，是将整型与字符型的**编码值**进行比较
- 字符串和整型、浮点型以及字符型是不可以进行比较的
- 布尔类型不能与任何其它数据类型进行比较

## if和switch的区别

1. if结构
   - 判断条件是布尔类型
   - 判断条件是一个范围
2. switch结构
   - 判断条件是常量值

## switch结构

```java
switch(expression){
    case (constant expression1): {
        code block1;
        break; //break不必须
    }
    case(constant expression2):{
        code block2;
        break;
    }
    default: //default不必须
        {
            code block3;
        }
}
```

JDK 7.0以上版本的表达式的值可以是基本数据类型的byte,short,int,char以及String类型

```java
String str = "aaa"
str.toUpperCase()//转换大写
```

