 class practice{
  public static void main(String args[]){   
     int x8,y8,rows8=10;
		
		for(x8=1;x8<=rows8;x++)
		{
		  for(y8=1;y8<=x8;y8++)
		  {
			  if(x8==rows8||y8==1||x8==y8)
			  System.out.print("#");
			  else
			  System.out.print("$");
				  
		  }
		  System.out.println( );
		}
    }
}