package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.lang.Integer;
import java.util.function.ToIntBiFunction;
/*
ZhangSan married 10 50
Jimmy unmarried 10 50
WangWu unmarried 15 60
LiSi unmarried 1 30
Amy unmarried 1 30
*/
//分配福利房
public class Interview_Huawei_test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        int num = in.nextInt();
        List<String> emps = new ArrayList<>();
        for(int i = 0; i < num; i++) {
            String employee = in2.nextLine();
            emps.add(employee);
        }

        HashMap<Integer, HashMap> infos = new HashMap<>();
        for(int i = 0; i < emps.size(); i++){
            String[] t = emps.get(i).split(" ");
            HashMap<String, String> info = new HashMap<>();
            info.put("name", t[0]);
            info.put("marriage", t[1]);
            info.put("empDate", t[2]);
            info.put("grade", t[3]);
            infos.put(i, info);
        }

        for(int i = 0; i < infos.size(); i++){
            String hGrade = (String) infos.get(i).get("grade");
            String hDate = (String) infos.get(i).get("empDate");
            String status = (String) infos.get(i).get("marriage");
            String name = (String) infos.get(i).get("name");
            if(name.equals("LiSi")){

            }
//            for(int j = i + 1; j < infos.size(); j++){
//                if(hGrade > (String) infos.get(j).get("grade")){
//
//                }
//            }
            System.out.println(infos.get(i).get("name"));
        }
    }
}