import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Tian Z
 */
public class Homework {
    public static void main(String[] args) {
        Homework hw = new Homework();
        Scanner sc = new Scanner(System.in);
        int input, index;
        float newScore;
        float[] f = null;
        float average;
        while (true) {
            hw.displayMenu();
            System.out.println("请输入对应的数字进行操作：");
            try {
                input = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("输入类型错误，请重试");
                sc.next();
                continue;
            }
            if (input == 0) {
                System.out.println("退出程序！");
                break;
            }
            switch (input) {
                case 1: {
                    f = hw.initScore();
                    break;
                }
                case 2: {
                    if (f != null) {
                        average = hw.average(f);
                        System.out.println("数学平均成绩为：" + average);
                    } else {
                        System.out.println("还未录入数学成绩，请重试！");
                    }
                    break;
                }

                case 3: {
                    if (f != null) {
                        System.out.println("成绩大于85分的人数为：" + hw.count(f));
                    } else {
                        System.out.println("还未录入数学成绩，请重试！");
                    }
                    break;
                }

                case 4: {
                    if (f != null) {
                        System.out.println("修改前：");
                        hw.displayAllScore(f);
                        System.out.println("请输入要修改数据的位置（从0开始）：");
                        try {
                            index = sc.nextInt();
                            System.out.println("请输入新数据：");
                            newScore = sc.nextFloat();
                            hw.update(f, index, newScore);
                        } catch (InputMismatchException e) {
                            System.out.println("输入数据类型错误，请重新输入");
                            sc.next();
                            break;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("超出数组范围，请重试");
                            break;
                        }
                        System.out.println("修改后：");
                        hw.displayAllScore(f);
                    } else {
                        System.out.println("还未录入数学成绩，请重试！");
                    }
                    break;
                }

                case 5: {
                    if (f != null) {
                        hw.displayAllScore(f);
                    } else {
                        System.out.println("还未录入数学成绩，请重试！");
                    }
                    break;
                }
                default: {
                    System.out.println("输入无效，请重试！");
                }
            }
        }

    }

    public void displayMenu() {
        System.out.println("**********************************");
        System.out.println("       1--初始化数学成绩");
        System.out.println("       2--求成绩的平均值");
        System.out.println("       3--统计成绩大于85分的人数");
        System.out.println("       4--修改指定位置处的成绩");
        System.out.println("       5--打印输出所有成绩");
        System.out.println("       0--退出");
        System.out.println("**********************************");
    }

    public float[] initScore() {
        float[] f = new float[5];
        int scoreInputNumber;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要存储的数学成绩的数量：");
            try {
                scoreInputNumber = sc.nextInt();
                if (scoreInputNumber <= 5 && scoreInputNumber > 0) {
                    for (int i = 0; i < scoreInputNumber; i++) {
                        System.out.println("请输入第" + (i + 1) + "个数据");
                        f[i] = sc.nextFloat();
                    }
                    System.out.println("成绩为：");
                    for (float v : f) {
                        System.out.print(v + "   ");
                    }
                    System.out.println();
                } else {
                    System.out.println("成绩数量超出范围，请重试");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("输入数据类型错误，请重新输入");
                sc.next();
            }

        }
        return f;
    }

    public float average(float[] f) {
        float sum = 0, averageScore;
        for (float v : f) {
            sum += v;
        }
        averageScore = sum / f.length;
        return averageScore;
    }

    public int count(float[] f) {
        int count = 0;
        for (float v : f) {
            if (v > 85) {
                count++;
            }
        }
        return count;
    }

    public void update(float[] f, int index, float newScore) {
        for (int i = f.length - 1; i > index; i--) {
            f[i] = f[i - 1];
        }
        f[index] = newScore;
    }

    public void displayAllScore(float[] f) {
        System.out.println("成绩为：");
        for (float v : f) {
            System.out.print(v + "   ");
        }
        System.out.println();
    }
}
