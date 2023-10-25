package theoretical_Program;

class WhatsappDriver 
{
	public static void main(String[] args)
	{
		        Whatsappv3 whatsappv3=new Whatsappv3();
		        whatsappv3.chat();
		        whatsappv3.audioCall();
		        whatsappv3.videoCall();
	}

}

class Whatsappv1
{
	public void chat()
	{
		System.out.println("Hey! User You can chat");
	}
}
class Whatsappv2 extends Whatsappv1
{
	public void audioCall()
	{
		System.out.println("Hey! User You can make an audiocall now !!");
	}
}
class Whatsappv3 extends Whatsappv2
{
	public void videoCall()
	{
		System.out.println("Hey! User You can make a videocall now !!");
	}
}
