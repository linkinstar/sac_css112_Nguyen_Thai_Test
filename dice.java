
public class dice {
private int cdice;
private int vldice;
private String mguess;
private int point;
public dice(int mdice)
{
	cdice = mdice ;
}
public void cthrow()
{
	vldice =0;
	for(int i =0;i< cdice;i++)
	{
		vldice += (int)(Math.random()*6) +1;
	}
}
public int process(String pguess,int ppoint)
{
	point =ppoint;
	mguess = pguess;
	int midnum;
	midnum = (6*cdice) /2;
	switch ( mguess)
	{
	case "hi": 
	{
		if( vldice > midnum )
		{
			point += 1;
			System.out.println("Correct!! point +1");
		}else if( vldice < midnum)
		{
			point -= 1;
			System.out.println("Wrong!! point -1");
		}else point -= 1;
	}break;
	case "low":{
		if( vldice > midnum )
		{
			point -= 1;
			System.out.println("Wrong!! point -1");
		}else if( vldice < midnum)
		{
			point += 1;
			System.out.println("Correct!! point +1");
		}else {
			point -= 1;
		System.out.println("Wrong!! point -1");
		}
	}break;
	default: {
		int pnum= Integer.parseInt(mguess);
		if(vldice == pnum)
		{
			point +=5;
			System.out.println("Correct!! point +5");
		}else {point -= 1;
		System.out.println("Wrong!! point -1");
		}
	}break;
	}
	System.out.println("Player guess is : "+mguess);
	System.out.println("The mid value of the dice is  "+ midnum);
	System.out.println("The Value of the dice is "+ vldice);
	return point;
}
}
