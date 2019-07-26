import java.util.Scanner;
public class Tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.print("Enter a name: ");
        String [] hocsinh ={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        String input_name = sr.nextLine();
        boolean isExist =false;
        for (int i=0;i<hocsinh.length;i++){
            if (hocsinh[i].equals(input_name)){
                System.out.println("Position of the students in the list "+ input_name+" is: "+(i+1));
                isExist=true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found" + input_name + " in the list.");
    }
}
