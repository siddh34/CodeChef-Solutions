import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class rouggh {
    static int maxGenePhone(int arri[],int memCon[][],int memCon_row,int memCon_col){
        int answer = 0;
        List<Integer> record = new ArrayList<Integer>();
        List<List<Integer>> levels = new ArrayList<List<Integer>>(); 
        record.add(0);
        levels.add(record);
        
        List<Integer> irecord = new ArrayList<Integer>();
        for(int i = 0; i < memCon_row; i++){
            if(record.contains(memCon[i][0])){
                irecord.add(memCon[i][1]);
            }
            else{
                levels.add(irecord);
                irecord = new ArrayList<Integer>();
                record = levels.get(levels.size() - 1);
                irecord.add(memCon[i][1]);
            }
        }

        levels.add(irecord);

        List<Integer> levelSum = new ArrayList<Integer>();
        int sum = 0;
        for(int i=0; i<levels.size(); i++){
            for(int j=0; j<levels.get(i).size(); j++){
                sum += arri[levels.get(i).get(j)];
            }
            levelSum.add(sum);
            sum = 0;
        }

        Collections.sort(levelSum);

        answer = levelSum.get(levelSum.size() - 1);
        
        return answer;
    }
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//input for arri
		int arri_size = in.nextInt();
		int arri[] = new int[arri_size];
		for(int idx = 0; idx < arri_size; idx++)
		{
			arri[idx] = in.nextInt();
		}
		// input for memCon
		int memCon_row = in.nextInt();
		int memCon_col = in.nextInt();
		int memCon[][] = new int[memCon_row][memCon_col];
		for(int idx = 0; idx < memCon_row; idx++)
		{
			for(int jdx = 0; jdx < memCon_col; jdx++)
			{
				memCon[idx][jdx] = in.nextInt();
			}
		}
		
	
		int result = maxGenePhone(arri, memCon, memCon_row, memCon_col);
		System.out.print(result);

        in.close();
	}
}
