class FamilyAccount {
    public static void main(String[] args) {

        boolean isFlag = true;
        String details = "收支\t账户金额\t收支金额\t说    明\n";
        int balance = 0;
        while (isFlag) {
            System.out.println("家庭收支记账软件");
            System.out.println("                      1.收支明细");
            System.out.println("                      2.登记收入");
            System.out.println("                      3.登记支出");
            System.out.println("                      4.退  出");
            System.out.println("                      请选择（1-4）");
            // 获取用户的选择：1-4
            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    System.out.println("---------------当前收支明细记录--------------");
                    System.out.println(details);
                    System.out.println("--------------------------------------------");
                    break;
                case '2':
                    System.out.println("本次收入金额：");
                    int addmoney = Utility.readNumber();
                    System.out.println("本次收入说明：");
                    String addinfo = Utility.readString();
                    balance += addmoney;
                    details += ("收入\t" + balance + "\t\t" + addmoney + "\t\t" + addinfo + "\n");
                    System.out.println("--------------------登记完成------------------");
                    break;

                case '3':
                    System.out.println("本次支出金额：");
                    int minusmoney = Utility.readNumber();
                    System.out.println("本次支出说明：");
                    String minusinfo = Utility.readString();
                    if (balance >= minusmoney) {
                        balance -= minusmoney;
                        details += ("支出\t" + balance + "\t\t" + minusmoney + "\t\t" + minusinfo + "\n");

                    } else {
                        System.out.println("支出超过账户额度，支付失败");
                    }
                    System.out.println("--------------------登记完成------------------");

                    break;
                case '4':
                    System.out.println("确认是否退出（Y/N）");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
                    break;
            }
        }

    }
}