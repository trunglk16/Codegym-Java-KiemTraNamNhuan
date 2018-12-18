public class checkYear {
    public static void main(String[] args) {
        System.out.println("Nhap nam can kiem tra: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int year = input.nextInt();
        boolean flag = true;
        boolean	isDivisibleBy4	=	year	%	4 == 0; 
        if (isDivisibleBy4){
            boolean	isDivisibleBy100	=	year	%	100 == 0;  
            if (isDivisibleBy100){
                 boolean	isDivisibleBy400	=	year	%	400 == 0; 
                if (isDivisibleBy400){
                    flag = false;
                }
            }
        }else{
            flag = false;
        }
        if(flag){
            System.out.println(year + " la nam nhuan");
        }else {
            System.out.println(year + " khong phai la nam nhuan");
        }
    }
}
