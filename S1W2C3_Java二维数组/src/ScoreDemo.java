import java.util.Scanner;

/**
 * @Author: Tian
 */

public class ScoreDemo {
    public static void main(String[] args) {
        int[][] intArray = new int[3][2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                String moduleName;
                if (j == 0) {
                    moduleName = "语文";
                } else {
                    moduleName = "数学";
                }
                System.out.println("请输入第" + (i + 1) + "个学生的" + moduleName + "成绩：");
                intArray[i][j] = sc.nextInt();
            }
        }
        int chineseSum = 0;
        int chineseAvg;
        int mathSum = 0;
        int mathAvg;
        for (int i = 0; i < 3; i++) {
            chineseSum += intArray[i][0];
            mathSum += intArray[i][1];
        }
        chineseAvg = chineseSum / 3;
        mathAvg = mathSum / 3;
        System.out.println("语文的总成绩为：" + chineseSum);
        System.out.println("语文的平均分为：" + chineseAvg);
        System.out.println("数学的总成绩为：" + mathSum);
        System.out.println("数学的平均分为：" + mathAvg);

    }
}
