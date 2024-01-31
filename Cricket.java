import java.util.*;
class Cricket
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String p_nm[] = new String[3];
		int run[][] = new int[3][3];
		int trun[] = new int[3];
		int p=1;
		for(int i=0;i<=2;i++)
		{
			System.out.print("Enter Name of Player "+p+":");
			p_nm[i] = sc.nextLine();
			p++;
		}
		int tot=0;
		System.out.println("------------------Enter Player Runs------------------");		
		for(int i=0;i<=2;i++){
			int t=1;
			System.out.println("------------------"+p_nm[i]+"------------------");

			for(int j=0;j<=2;j++){
				System.out.print("Enter Run of "+p_nm[i]+" in Tournament "+ t +" : ");
				run[i][j]=sc.nextInt();
				t++;
				
			}
		}
		System.out.println("------------------Overview------------------\n");	

		System.out.println("Name\tTournament 1\tTournament 2\tTournament 3\tTotal");
		System.out.println("================================================================");

		for(int i=0;i<=2; i++){
			for(int j=0;j<=2;j++)
			{
				tot=tot+run[j][i];
			}
			trun[i]=tot;
			System.out.println(p_nm[i]+"\t"+run[i][0]+"\t\t"+run[i][1]+"\t\t"+run[i][2]+"\t"+"\t"+trun[i]);
			tot=0;
		}
		System.out.println("\n------------------Man of the Match------------------\n");

		int temp=0;
		for(int i=0;i<=2;i++)
		{
			for(int j=i+1;j<=2;j++)
			{
					if(trun[j]>trun[i]){
						temp=trun[j];
						trun[j]=trun[i];
						trun[i]=temp;
					}
					int[] tempRuns = run[i];
                    run[i] = run[j];
                    run[j] = tempRuns;

				
			}
			System.out.println(p_nm[i]+"\t"+run[i][0]+"\t\t"+run[i][1]+"\t\t"+run[i][2]+"\t"+"\t"+trun[i]);

            //System.out.println(Arrays.toString(run[i]));
        }
			// System.out.println( + trun[i]);
		}



	}

