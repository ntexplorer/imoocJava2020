# JAVA二维数组

## 二维数组的声明和创建

### 二维数组的声明

```java
// method 1
int[][]intArray;
// method 2
        float floatArray[][];
// method 3
        double[]doubleArray[];
```

### 二维数组的创建

```java
//创建一个三行三列的int数组
intArray=new int[3][3];
```

### 声明数组的同时进行创建

```java
char[][]ch=new char[3][5];
//创建float数组时不能省略行的数量（可省略列数量）
        floatArray=new float[3][];
//此时直接引用会抛出空指针异常
//不同行数可以指定不同的列数
        floatArray[0]=new float[3];
        floatArray[1]=new float[4];
        floatArray[2]=new float[5];
```

## 二维数组的初始化

```java
int[][]num={{1,2,3},{4,5,6},{7,8,9}};
//行数表示
        int row=num.length;
//列数表示
        int column=num[0].length;
```

