import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Tian Zhang
 * 从键盘接收证型数据存放到数组中，并对数组中的数据进行管理
 */
public class DataManage {
    public static void main(String[] args) {
        DataManage dm = new DataManage();
        Scanner sc = new Scanner(System.in);
        int input;
        int[] a = null;
        //n插入的数据，k插入的位置
        int n, k;
        while (true) {
            dm.notice();
            System.out.println("请输入对应的数字进行操作：");
            try {
                input = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("输入的格式有误");
                sc.next();
                continue;
            }
            if (input == 0) {
                System.out.println("退出程序");
                break;
            }
            switch (input) {
                case 1: {
                    a = dm.insertData();
                    System.out.println("数组元素为:");
                    dm.showData(a, a.length);
                    break;
                }
                case 2: {
                    if (a != null) {
                        System.out.println("数组元素为：");
                        if (a[a.length - 1] == 0) {
                            //如果数组最后一个元素为0，还没有插入数据，不显示最后一个元素
                            dm.showData(a, a.length - 1);

                        } else {
                            dm.showData(a, a.length);
                        }
                    } else {
                        System.out.println("还未在数组中插入数据，请重新选择操作！");
                    }
                    break;
                }
                case 3: {
                    if (a != null) {
                        System.out.println("请输入要插入的数据：");
                        try {
                            n = sc.nextInt();
                            System.out.println("请输入要插入的位置：");
                            k = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("输入的数据格式有误，不能有非数字！");
                            sc.next();
                            break;
                        }
                        dm.insetAtArray(a, n, k - 1);
                    } else {
                        System.out.println("还未在数组中插入数据，请重新选择操作！");
                    }
                    break;
                }
                case 4: {
                    if (a != null) {
                        dm.divideByThree(a);
                    } else {
                        System.out.println("还未在数组中插入数据，请重新选择操作！");
                    }
                    break;
                }
                default: {
                    System.out.println("无效输入，请重试");
                }
            }
        }
    }

    /**
     * 从键盘接收数据
     *
     * @return 接收数据的数组
     */
    public int[] insertData() {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        //少接收一个数据，为在指定位置处插入数据做准备
        for (int i = 0; i < a.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数据:");
            try {
                a[i] = sc.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("输入数据格式有误，不能有非数字！");
                sc.next();
                i--;
            }
        }
        return a;
    }

    /**
     * 显示数组中元素的内容
     *
     * @param a      素组名
     * @param length 要显示的数组元素的个数
     */
    public void showData(int[] a, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + "   ");
        }
        System.out.println();
    }

    /**
     * 从键盘接收数据，插入到数组的指定位置处
     *
     * @param a 要插入数据的数组
     * @param n 要插入的数据
     * @param k 要插入的位置，从0开始
     */
    public void insetAtArray(int[] a, int n, int k) {
        //注意从最后一个数据开始移动，避免数据覆盖
        for (int i = a.length - 1; i > k; i--) {
            a[i] = a[i - 1];
        }
        a[k] = n;
    }

    /**
     * 输出数组中能被3整除的元素
     *
     * @param a 数组
     */
    public void divideByThree(int[] a) {
        int count = 0;
        String str = "";
        for (int i : a) {
            if (i % 3 == 0) {
                str = str + i + "  ";
                count++;
            }
        }
        if (count == 0) {
            System.out.println("数组中没有能被3整除的元素！");
        } else {
            System.out.println("数组中能被3整除的元素有：" + str);
        }
    }

    /**
     * 提示信息
     */
    public void notice() {
        System.out.println("******************************");
        System.out.println("      1--插入数据");
        System.out.println("      2--显示所有数据");
        System.out.println("      3--在指定位置处插入数据");
        System.out.println("      4--查询能被3整除的数据");
        System.out.println("      0--退出");
        System.out.println("******************************");
    }
}
