import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class Suijishu {
	 public static void main (String args[]) {
		 System.out.print("请输入题数：");
		  Scanner scan = new Scanner(System.in);
		  String read = scan.nextLine();
		  int m = Integer.parseInt(read);
	 Random rn = new Random(); 
			for(int p=0;p<m;p++)
		     {
		         int i=rn.nextInt(10);
		         int j=rn.nextInt(10);
		         int x=rn.nextInt(10);
		         int y=rn.nextInt(10);
		         while(y==0||x==0)
		         {
		             x=rn.nextInt(10);
		             y=rn.nextInt(10);
		         }
		         int yi=rn.nextInt(10);
		         int er=rn.nextInt(10);
		         int k=rn.nextInt(100)%20;
		         int v=i*10+j;//第一个数；
            	 int l=x*10+y;//第二个数；
            	 while(yi==0||er==0)
		         {
		             yi=rn.nextInt(10);
		             er=rn.nextInt(10);
		         }
            	 int san=yi*10+er;
            	 int no;
		         switch(k)
		         {
		             case 0:
		            	 no=v+l+san;
		            	 System.out.print(v+"+"+l+"+"+san+"=");
		            	 try {
			         			//1、打开文件流
			         			Writer w=new FileWriter("e:/exercisefile.txt",true);
			         			Writer answer=new FileWriter("e:/answerfile.txt",true);
			         			//2、写入内容
			         			w.write(i*10+j+"+"+(x)+"+"+san+"=");
			         			w.write("\r\n");
			         			answer.write(no+"\r\n");
			         			//3、关闭文件流
			         			w.close();
			         			answer.close();
		         		} catch (IOException e) {
		         			System.out.println("文件写入错误："+e.getMessage());
		         		}
		                 break;
		             case 1:
		            	 no=v-l+san;
		            	 if(no>0){
		            	 System.out.print(v+"-"+l+"+"+san+"=");
		            	 try {
			         			//1、打开文件流
			         			Writer w=new FileWriter("e:/exercisefile.txt",true);
			         			Writer answer=new FileWriter("e:/answerfile.txt",true);
			         			//2、写入内容
			         			w.write(v+"-"+x+"+"+san+"=");
			         			w.write("\r\n");
			         			answer.write(no+"\r\n");
			         			//3、关闭文件流
			         			w.close();
			         			answer.close();
			         		} catch (IOException e) {
			         			System.out.println("文件写入错误："+e.getMessage());
			         		}
		                 break;}
		            	 else
		            	 {
		            		 System.out.print(l+"-"+v+"+"+san+"=");
		            		 no=l-v+san;
		            		 try {
				         			//1、打开文件流
				         			Writer w=new FileWriter("e:/exercisefile.txt",true);
				         			Writer answer=new FileWriter("e:/answerfile.txt",true);
				         			//2、写入内容
				         			w.write(v+"-"+(x)+"+"+san+"=");
				         			w.write("\r\n");
				         			answer.write(no+"\r\n");
				         			//3、关闭文件流
				         			w.close();
				         			answer.close();
				         		} catch (IOException e) {
				         			System.out.println("文件写入错误："+e.getMessage());
				         		}
			                 break;
		            	 }
		             case 2:
		            	 no=v*l+san;
		            	 System.out.print(v+"*"+l+"+"+san+"=");
		            	 try {
			         			//1、打开文件流
			         			Writer w=new FileWriter("e:/exercisefile.txt",true);
			         			Writer answer=new FileWriter("e:/answerfile.txt",true);
			         			//2、写入内容
			         			w.write(v+"*"+(x)+"+"+san+"=");
			         			w.write("\r\n");
			         			answer.write(no+"\r\n");
			         			//3、关闭文件流
			         			w.close();
			         			answer.close();
			         		} catch (IOException e) {
			         			System.out.println("文件写入错误："+e.getMessage());
			         		}
		                 break;
		             case 3:
		            	 int chushu;
		            	 if(v%x!=0){
		            		 chushu=v/x;
		            		 v=x*chushu;
		            	 }
		            	 no=v/x+san;
		            	 System.out.print(v+"÷"+x+"+"+san+"=");
		            	 try {
			         			//1、打开文件流
			         			Writer w=new FileWriter("e:/exercisefile.txt",true);
			         			Writer answer=new FileWriter("e:/answerfile.txt",true);
			         			//2、写入内容
			         			w.write(v+"÷"+x+"+"+san+"=");
			         			w.write("\r\n");
			         			answer.write(no+"\r\n");
			         			//3、关闭文件流
			         			w.close();
			         			answer.close();
			         		} catch (IOException e) {
			         			System.out.println("文件写入错误："+e.getMessage());
			         		}
		            	 break;
		             case 4:
		            	 no=v+l-san;
		            	 if (no>0){
		            	 System.out.print(v+"+"+l+"-"+san+"=");
		            	 try {
			         			//1、打开文件流
			         			Writer w=new FileWriter("e:/exercisefile.txt",true);
			         			Writer answer=new FileWriter("e:/answerfile.txt",true);
			         			//2、写入内容
			         			w.write(v+"+"+l+"-"+san+"=");
			         			w.write("\r\n");
			         			answer.write(no+"\r\n");
			         			//3、关闭文件流
			         			w.close();
			         			answer.close();
		         		} catch (IOException e) {
		         			System.out.println("文件写入错误："+e.getMessage());
		         		}
		                 break;}
		            	 else
		            	 {
		            		 no=san-v+l;
			            	 System.out.print(san+"-"+v+"+"+l+"=");
			            	 try {
				         			//1、打开文件流
				         			Writer w=new FileWriter("e:/exercisefile.txt",true);
				         			Writer answer=new FileWriter("e:/answerfile.txt",true);
				         			//2、写入内容
				         			w.write(san+"-"+v+"+"+l+"=");
				         			w.write("\r\n");
				         			answer.write(no+"\r\n");
				         			//3、关闭文件流
				         			w.close();
				         			answer.close();
			         		} catch (IOException e) {
			         			System.out.println("文件写入错误："+e.getMessage());
			         		}
			                 break;}
		             case 5:
		            	 no=v-l-san;
		            	 if(no>0){
		            	 System.out.print(v+"-"+l+"-"+san+"=");
		            	 try {
			         			//1、打开文件流
			         			Writer w=new FileWriter("e:/exercisefile.txt",true);
			         			Writer answer=new FileWriter("e:/answerfile.txt",true);
			         			//2、写入内容
			         			w.write(v+"-"+l+"-"+san+"=");
			         			w.write("\r\n");
			         			answer.write(no+"\r\n");
			         			//3、关闭文件流
			         			w.close();
			         			answer.close();
			         		} catch (IOException e) {
			         			System.out.println("文件写入错误："+e.getMessage());
			         		}
		                 break;}
		            	 else
		            	 {
		            		 while(l-v-san<0)
		    		         {
		    		             l=rn.nextInt(100);
		    		             v=rn.nextInt(100);
		    		             san=rn.nextInt(100);
		    		         }
		            		 System.out.print(l+"-"+v+"-"+san+"=");
		            		 no=l-v-san;
		            		 try {
				         			//1、打开文件流
				         			Writer w=new FileWriter("e:/exercisefile.txt",true);
				         			Writer answer=new FileWriter("e:/answerfile.txt",true);
				         			//2、写入内容
				         			w.write(v+"-"+l+"-"+san+"=");
				         			w.write("\r\n");
				         			answer.write(no+"\r\n");
				         			//3、关闭文件流
				         			w.close();
				         			answer.close();
				         		} catch (IOException e) {
				         			System.out.println("文件写入错误："+e.getMessage());
				         		}
			                 break;
		            	 }
		             case 6:
		            	 no=v*l-san;
		            	 if(no>0){
		            	 System.out.print(v+"*"+l+"-"+san+"=");
		            	 try {
			         			//1、打开文件流
			         			Writer w=new FileWriter("e:/exercisefile.txt",true);
			         			Writer answer=new FileWriter("e:/answerfile.txt",true);
			         			//2、写入内容
			         			w.write(v+"*"+l+"-"+san+"=");
			         			w.write("\r\n");
			         			answer.write(no+"\r\n");
			         			//3、关闭文件流
			         			w.close();
			         			answer.close();
			         		} catch (IOException e) {
			         			System.out.println("文件写入错误："+e.getMessage());
			         		}
		                 break;}
		            	 else{
		            		 System.out.print(san+"-"+v+"*"+l+"=");
			            	 try {
				         			//1、打开文件流
				         			Writer w=new FileWriter("e:/exercisefile.txt",true);
				         			Writer answer=new FileWriter("e:/answerfile.txt",true);
				         			//2、写入内容
				         			w.write(san+"-"+v+"*"+l+"=");
				         			w.write("\r\n");
				         			answer.write(no+"\r\n");
				         			//3、关闭文件流
				         			w.close();
				         			answer.close();
				         		} catch (IOException e) {
				         			System.out.println("文件写入错误："+e.getMessage());
				         		}
			                 break;}
		             case 7:
		            	 if(v%x!=0){
		            		 chushu=v/x;
		            		 v=x*chushu;
		            	 }
		            	 no=v/x-san;
		            	 if(no>0){
		            	 System.out.print(v+"÷"+x+"-"+san+"=");
		            	 try {
			         			//1、打开文件流
			         			Writer w=new FileWriter("e:/exercisefile.txt",true);
			         			Writer answer=new FileWriter("e:/answerfile.txt",true);
			         			//2、写入内容
			         			w.write(v+"÷"+x+"-"+san+"=");
			         			w.write("\r\n");
			         			answer.write(no+"\r\n");
			         			//3、关闭文件流
			         			w.close();
			         			answer.close();
			         		} catch (IOException e) {
			         			System.out.println("文件写入错误："+e.getMessage());
			         		}
		            	 break;}
		            	 else{
		            		 while(no<0)
		    		         {
		    		             san=rn.nextInt(100);
		    		             no=v/x-san;
		    		         }
		            		 System.out.print(v+"÷"+x+"-"+san+"=");
			            	 try {
				         			//1、打开文件流
				         			Writer w=new FileWriter("e:/exercisefile.txt",true);
				         			Writer answer=new FileWriter("e:/answerfile.txt",true);
				         			//2、写入内容
				         			w.write(v+"÷"+x+"-"+san+"=");
				         			w.write("\r\n");
				         			answer.write(no+"\r\n");
				         			//3、关闭文件流
				         			w.close();
				         			answer.close();
				         		} catch (IOException e) {
				         			System.out.println("文件写入错误："+e.getMessage());
				         		}
			            	 break;}
		            	 case 8:
				            	 no=v+l*san;
				            	 System.out.print(v+"+"+l+"*"+san+"=");
				            	 try {
					         			//1、打开文件流
					         			Writer w=new FileWriter("e:/exercisefile.txt",true);
					         			Writer answer=new FileWriter("e:/answerfile.txt",true);
					         			//2、写入内容
					         			w.write(v+"+"+l+"*"+san+"=");
					         			w.write("\r\n");
					         			answer.write(no+"\r\n");
					         			//3、关闭文件流
					         			w.close();
					         			answer.close();
				         		} catch (IOException e) {
				         			System.out.println("文件写入错误："+e.getMessage());
				         		}
				                 break;
				             case 9:
				            	 no=v-l*san;
				            	 if(no>0){
				            	 System.out.print(v+"-"+l+"*"+san+"=");
				            	 try {
					         			//1、打开文件流
					         			Writer w=new FileWriter("e:/exercisefile.txt",true);
					         			Writer answer=new FileWriter("e:/answerfile.txt",true);
					         			//2、写入内容
					         			w.write(v+"-"+l+"*"+san+"=");
					         			w.write("\r\n");
					         			answer.write(no+"\r\n");
					         			//3、关闭文件流
					         			w.close();
					         			answer.close();
					         		} catch (IOException e) {
					         			System.out.println("文件写入错误："+e.getMessage());
					         		}
				                 break;}
				            	 else
				            	 {
				            		 while(v-l*san<0)
				    		         {
				    		             l=rn.nextInt(100);
				    		             v=rn.nextInt(100);
				    		             san=rn.nextInt(100);
				    		         }
				            		 System.out.print(v+"-"+l+"*"+san+"=");
				            		 no=v-l*san;
				            		 try {
						         			//1、打开文件流
						         			Writer w=new FileWriter("e:/exercisefile.txt",true);
						         			Writer answer=new FileWriter("e:/answerfile.txt",true);
						         			//2、写入内容
						         			w.write(v+"-"+l+"*"+san+"=");
						         			w.write("\r\n");
						         			answer.write(no+"\r\n");
						         			//3、关闭文件流
						         			w.close();
						         			answer.close();
						         		} catch (IOException e) {
						         			System.out.println("文件写入错误："+e.getMessage());
						         		}
					                 break;
				            	 }
				             case 10:
				            	 no=v*l*san;
				            	 System.out.print(v+"*"+l+"*"+san+"=");
				            	 try {
					         			//1、打开文件流
					         			Writer w=new FileWriter("e:/exercisefile.txt",true);
					         			Writer answer=new FileWriter("e:/answerfile.txt",true);
					         			//2、写入内容
					         			w.write(v+"*"+l+"*"+san+"=");
					         			w.write("\r\n");
					         			answer.write(no+"\r\n");
					         			//3、关闭文件流
					         			w.close();
					         			answer.close();
					         		} catch (IOException e) {
					         			System.out.println("文件写入错误："+e.getMessage());
					         		}
				                 break;
				             case 11:
				            	 if(v%x!=0){
				            		 chushu=v/x;
				            		 v=x*chushu;
				            	 }
				            	 System.out.print(v+"÷"+x+"*"+san+"=");
				            	 no=v/l*san;
				            	 try {
					         			//1、打开文件流
					         			Writer w=new FileWriter("e:/exercisefile.txt",true);
					         			Writer answer=new FileWriter("e:/answerfile.txt",true);
					         			//2、写入内容
					         			w.write(v+"÷"+x+"*"+san+"=");
					         			w.write("\r\n");
					         			answer.write(no+"\r\n");
					         			//3、关闭文件流
					         			w.close();
					         			answer.close();
					         		} catch (IOException e) {
					         			System.out.println("文件写入错误："+e.getMessage());
					         		}
				            	 break;	 
				             case 12:
						            	 if(l%yi!=0){
						            		 chushu=l/yi;
						            		 l=yi*chushu;
						            	 }
						            	 no=v+l/san;
						            	 System.out.print(v+"+"+l+"÷"+yi+"=");
						            	 try {
							         			//1、打开文件流
							         			Writer w=new FileWriter("e:/exercisefile.txt",true);
							         			Writer answer=new FileWriter("e:/answerfile.txt",true);
							         			//2、写入内容
							         			w.write(v+"+"+l+"÷"+yi+"=");
							         			w.write("\r\n");
							         			answer.write(no+"\r\n");
							         			//3、关闭文件流
							         			w.close();
							         			answer.close();
						         		} catch (IOException e) {
						         			System.out.println("文件写入错误："+e.getMessage());
						         		}
						                 break;
						             case 13:
						            	 if(l%yi!=0){
						            		 chushu=l/yi;
						            		 l=yi*chushu;
						            	 }
						            	 no=v-l/yi;
						            	 if(no>0){
						            	 System.out.print(v+"-"+l+"÷"+yi+"=");
						            	 try {
							         			//1、打开文件流
							         			Writer w=new FileWriter("e:/exercisefile.txt",true);
							         			Writer answer=new FileWriter("e:/answerfile.txt",true);
							         			//2、写入内容
							         			w.write(v+"-"+l+"÷"+yi+"=");
							         			w.write("\r\n");
							         			answer.write(no+"\r\n");
							         			//3、关闭文件流
							         			w.close();
							         			answer.close();
							         		} catch (IOException e) {
							         			System.out.println("文件写入错误："+e.getMessage());
							         		}
						                 break;}
						            	 else
						            	 {
						            		 while(l-v/yi<0)
						    		         {
						    		             l=rn.nextInt(100);
						    		         }
						            		 System.out.print(l+"-"+v+"÷"+yi+"=");
						            		 no=l-v/san;
						            		 try {
								         			//1、打开文件流
								         			Writer w=new FileWriter("e:/exercisefile.txt",true);
								         			Writer answer=new FileWriter("e:/answerfile.txt",true);
								         			//2、写入内容
								         			w.write(v+"-"+l+"÷"+yi+"=");
								         			w.write("\r\n");
								         			answer.write(no+"\r\n");
								         			//3、关闭文件流
								         			w.close();
								         			answer.close();
								         		} catch (IOException e) {
								         			System.out.println("文件写入错误："+e.getMessage());
								         		}
							                 break;
						            	 }
						             case 14:
						            	 if(l%yi!=0){
						            		 chushu=l/yi;
						            		 l=yi*chushu;
						            	 }
						            	 no=v*l/yi;
						            	 System.out.print(v+"*"+l+"÷"+yi+"=");
						            	 try {
							         			//1、打开文件流
							         			Writer w=new FileWriter("e:/exercisefile.txt",true);
							         			Writer answer=new FileWriter("e:/answerfile.txt",true);
							         			//2、写入内容
							         			w.write(v+"*"+l+"÷"+yi+"=");
							         			w.write("\r\n");
							         			answer.write(no+"\r\n");
							         			//3、关闭文件流
							         			w.close();
							         			answer.close();
							         		} catch (IOException e) {
							         			System.out.println("文件写入错误："+e.getMessage());
							         		}
						                 break;
						             case 15:
						            	 int key=x*yi;
						            	 if(v%key!=0){
						            		 chushu=v/key;
						            		 v=key*chushu;
						            	 }
						            	 System.out.print(v+"÷"+x+"÷"+yi+"=");
						            	 no=v/x/yi;
						            	 try {
							         			//1、打开文件流
							         			Writer w=new FileWriter("e:/exercisefile.txt",true);
							         			Writer answer=new FileWriter("e:/answerfile.txt",true);
							         			//2、写入内容
							         			w.write(v+"÷"+x+"÷"+yi+"=");
							         			w.write("\r\n");
							         			answer.write(no+"\r\n");
							         			//3、关闭文件流
							         			w.close();
							         			answer.close();
							         		} catch (IOException e) {
							         			System.out.println("文件写入错误："+e.getMessage());
							         		}
						            	 break;
						             case 16:
						            	 System.out.print(v+"+"+l+"=");
						            	 no=v+l;
						            	 try {
							         			//1、打开文件流
							         			Writer w=new FileWriter("e:/exercisefile.txt",true);
							         			Writer answer=new FileWriter("e:/answerfile.txt",true);
							         			//2、写入内容
							         			w.write(v+"+"+l+"=");
							         			w.write("\r\n");
							         			answer.write(no+"\r\n");
							         			//3、关闭文件流
							         			w.close();
							         			answer.close();
						         		} catch (IOException e) {
						         			System.out.println("文件写入错误："+e.getMessage());
						         		}
						                 break;case 17:
							            	 no=v-l;
							            	 if(no>0)
							            	 {
							            		 System.out.print(v+"-"+l+"=");
								            	 try {
									         			//1、打开文件流
									         			Writer w=new FileWriter("e:/exercisefile.txt",true);
									         			Writer answer=new FileWriter("e:/answerfile.txt",true);
									         			//2、写入内容
									         			w.write(v+"-"+l+"=");
									         			w.write("\r\n");
									         			answer.write(no+"\r\n");
									         			//3、关闭文件流
									         			w.close();
									         			answer.close();
								         		} catch (IOException e) {
								         			System.out.println("文件写入错误："+e.getMessage());
								         		}
							            	 }
							            	 else
							            	 {
							            		 System.out.print(l+"-"+v+"=");
								            	 try {
									         			//1、打开文件流
									         			Writer w=new FileWriter("e:/exercisefile.txt",true);
									         			Writer answer=new FileWriter("e:/answerfile.txt",true);
									         			//2、写入内容
									         			w.write(l+"-"+v+"=");
									         			w.write("\r\n");
									         			answer.write((l-v)+"\r\n");
									         			//3、关闭文件流
									         			w.close();
									         			answer.close();
								         		} catch (IOException e) {
								         			System.out.println("文件写入错误："+e.getMessage());
								         		}
							            	 }
							            	 
							                 break;case 18:
								            	 no=v*l;
								            	 System.out.print(v+"*"+l+"=");
								            	 try {
									         			//1、打开文件流
									         			Writer w=new FileWriter("e:/exercisefile.txt",true);
									         			Writer answer=new FileWriter("e:/answerfile.txt",true);
									         			//2、写入内容
									         			w.write(v+"*"+l+"=");
									         			w.write("\r\n");
									         			answer.write(no+"\r\n");
									         			//3、关闭文件流
									         			w.close();
									         			answer.close();
								         		} catch (IOException e) {
								         			System.out.println("文件写入错误："+e.getMessage());
								         		}
								                 break;case 19:
									            	 if(v%x!=0){
									            		 chushu=v/x;
									            		 v=x*chushu;
									            	 }
									            	 no=v/x;
									            	 System.out.print(v+"÷"+x+"=");
									            	 try {
										         			//1、打开文件流
										         			Writer w=new FileWriter("e:/exercisefile.txt",true);
										         			Writer answer=new FileWriter("e:/answerfile.txt",true);
										         			//2、写入内容
										         			w.write(v+"÷"+x+"=");
										         			w.write("\r\n");
										         			answer.write(no+"\r\n");
										         			//3、关闭文件流
										         			w.close();
										         			answer.close();
									         		} catch (IOException e) {
									         			System.out.println("文件写入错误："+e.getMessage());
									         		}
									                 break;
		             }
		             
		             if( p%5==4 )
		             {
		              System.out.println();
		             }
		             else
		             {
		            	 System.out.print(" ");
		             }
		     }

	 }

}
