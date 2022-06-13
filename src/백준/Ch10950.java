package 백준;

import java.util.Scanner;

public class Ch10950 {
	public static void main(String[] args) throws Exception {
		/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
		for (int i = 1; i <= n; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(stringTokenizer.nextToken());
			int b = Integer.parseInt(stringTokenizer.nextToken());
			bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n");
		}
		
		bw.flush(); br.close();
		*/
		Scanner scanner = new Scanner(System.in);
        
        int caseNum = scanner.nextInt();

        for (int i = 0; i < caseNum; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a+b);
        }
	}

}
