package what;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.activity.ActivityType;
import org.javacord.api.entity.user.UserStatus;

import java.util.Random;

public class Ok {
	
    static enum photoshopEvents {
    	
    	EVENT1("match the luminostiyt and colour and balance", ":frowning2: :frowning2:"), EVENT2("make it more blended", 
    			"BUT HOW DO I MAKE IT MORE BLENDED okie im gonna go scream at aftaab bye"),
        EVENT3("pee", "open ur mouth"), EVENT4("post tomorrow", "my account's dying :mask:");

        private final String content;
        private final String complaint;

        photoshopEvents(String content, String complaint) {
            this.content = content;
            this.complaint = complaint;
        }

        public String getContent() {
            return this.content;
        }

        public String getComplaint() {
            return this.complaint;
        }
    }

    private static void setupPhotoshop() {
        Random random = new Random();
        int randomNum = random.nextInt(photoshopEvents.values().length);
        photoshopEvent = photoshopEvents.values()[randomNum].getContent();
        photoshopComplain = photoshopEvents.values()[randomNum].getComplaint();
    }

    private static String photoshopEvent, photoshopComplain;

    public static int ILYAn = 0;
    public static int ILYAngela = 0;
    public static int ILYEric = 0;
    public static int ILYJosh = 0;
    public static int ILYParantap = 0;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	
        // Token
        DiscordApi api = new DiscordApiBuilder().setToken("ODkxMTk1MjM0MDE5NTk4MzU3.YU60PQ.qICseQy_VgrCdeJW7haLTdksYNk")
                .login().join();

        // things

        api.updateActivity(ActivityType.PLAYING, "Photoshop");
        api.updateStatus(UserStatus.DO_NOT_DISTURB);
        
        // saying hi
        setupPhotoshop(); 
        
        api.addMessageCreateListener(eventHi -> {
            if (eventHi.getMessageContent().toLowerCase().contains("hi angela".toLowerCase())
            		&& eventHi.getMessageAuthor().getId() != 891195234019598357L) {
                try {
                	Thread.sleep(1100);
                    eventHi.getChannel().sendMessage("hi");
                    Thread.sleep(700);
                    eventHi.getChannel().sendMessage("what do u want");
                    Thread.sleep(900);
                    eventHi.getChannel().sendMessage("im in photoshop rn");
                    Thread.sleep(900);
                    eventHi.getChannel().sendMessage("it looks so bad do i cry");
                    Thread.sleep(1000);
                    eventHi.getChannel().sendMessage("i need to " + photoshopEvent);
                    Thread.sleep(1000);
                    eventHi.getChannel().sendMessage(photoshopComplain);
                } catch (InterruptedException e) {
                }
            }
        });
        // saying i hate men
        api.addMessageCreateListener(eventMen -> {
            if (eventMen.getMessageContent().toLowerCase().contains("i hate men")) {
                try {
                    Thread.sleep(1100);
                    eventMen.getChannel().sendMessage("FR THO");
                    Thread.sleep(500);
                    eventMen.getChannel().sendMessage("U TELL EM");
                } catch (InterruptedException e) {
                }
            }
        });
        // saying vc
        api.addMessageCreateListener(eventVC -> {
            if (eventVC.getMessageContent().toLowerCase().contains("angela".toLowerCase()) 
            		&& (eventVC.getMessageContent().toLowerCase().contains("vc".toLowerCase()) || 
            		eventVC.getMessageContent().toLowerCase().contains("call".toLowerCase()))) {
                try {
                    Thread.sleep(1100);
                    eventVC.getChannel().sendMessage("sorry ;-;");
                    Thread.sleep(700);
                    eventVC.getChannel().sendMessage("my mom is yelling at me again");
                    Thread.sleep(450);
                    eventVC.getChannel().sendMessage("why am i notlovde");
                    Thread.sleep(400);
                    eventVC.getChannel().sendMessage("nitloved");
                    Thread.sleep(400);
                    eventVC.getChannel().sendMessage("notloved");
                } catch (InterruptedException e) {
                }
            }
        });
        // saying get on
        api.addMessageCreateListener(eventGetOn -> {
            if (eventGetOn.getMessageContent().toLowerCase().contains("angela".toLowerCase()) 
            		&& eventGetOn.getMessageContent().toLowerCase().contains("get on".toLowerCase())) {
                try {
                    Thread.sleep(1100);
                    eventGetOn.getChannel().sendMessage("ya one sec");
                    Thread.sleep(1000);
                    eventGetOn.getChannel().sendMessage("nvm");
                    Thread.sleep(600);
                    eventGetOn.getChannel().sendMessage("brother has computer rn");
                    Thread.sleep(500);
                    eventGetOn.getChannel().sendMessage("play without me");	
                } catch (InterruptedException e) {
                }
            }
        });
        // saying come back
        api.addMessageCreateListener(eventReturn -> {
            if (eventReturn.getMessageContent().toLowerCase().toLowerCase().contains("angela".toLowerCase()) 
            		&& eventReturn.getMessageContent().toLowerCase().contains("come back".toLowerCase())
            		&& eventReturn.getMessageAuthor().getId() != 891195234019598357L) {
                try {
                    Thread.sleep(1100);
                    eventReturn.getChannel().sendMessage("NO");
                    Thread.sleep(300);
                    eventReturn.getChannel().sendMessage("BITCH");
                    Thread.sleep(400);
                    eventReturn.getChannel().sendMessage("i hate you");
                    Thread.sleep(600);
                    eventReturn.getChannel().sendMessage("fucking slut");
                    Thread.sleep(700);
                    eventReturn.getChannel().sendMessage("swallow glass");
                } catch (InterruptedException e) {
                }
            }
        });
        
        // saying u need to do smth
        api.addMessageCreateListener(eventNeedTo -> {
            if (eventNeedTo.getMessageContent().toLowerCase().toLowerCase().contains("i need to".toLowerCase())
            	&& eventNeedTo.getMessageAuthor().getId() != 891195234019598357L) {
                try {
                    Thread.sleep(1100);
                    eventNeedTo.getChannel().sendMessage("ok");
                    Thread.sleep(600);
                    eventNeedTo.getChannel().sendMessage("go do that");
                } catch (InterruptedException e) {
                }
            }
        });
        
        // Natalie
        api.addMessageCreateListener(eventNatalie -> {
            if (eventNatalie.getMessageContent().toLowerCase().toLowerCase().contains("natalie".toLowerCase()) 
            		&& eventNatalie.getMessageAuthor().getId() != 891195234019598357L) {
                try {
                    Thread.sleep(1100);
                    eventNatalie.getChannel().sendMessage("OMG i love natalie <3");
                    Thread.sleep(600);
                    eventNatalie.getChannel().sendMessage("her eyes r so even");
                } catch (InterruptedException e) {
                }
            }
        });
	        
	     // boo hoo
	        api.addMessageCreateListener(eventBooHoo -> {
	            if (eventBooHoo.getMessageContent().toLowerCase().toLowerCase().contains("crying rn".toLowerCase()) 
	            		&& eventBooHoo.getMessageAuthor().getId() != 891195234019598357L) {
	                try {
	                    Thread.sleep(1100);
	                    eventBooHoo.getChannel().sendMessage("boo hoo bitch");
	                    Thread.sleep(600);
	                    eventBooHoo.getChannel().sendMessage("no imkidding im sorry");
	                } catch (InterruptedException e) {
	                }
	            }
	        });
	        
        // SLEEP
        api.addMessageCreateListener(eventSleep -> {
        if (eventSleep.getMessageContent().toLowerCase().contains("angela".toLowerCase())
        		&& eventSleep.getMessageContent().toLowerCase().contains("go".toLowerCase()) 
        		&& (eventSleep.getMessageContent().toLowerCase().contains("bed".toLowerCase()) 
        		|| eventSleep.getMessageContent().toLowerCase().contains("sleep".toLowerCase()))) {
            try {
                Thread.sleep(1100);
                eventSleep.getChannel().sendMessage("ya");
                Thread.sleep(900);
                eventSleep.getChannel().sendMessage("ure right");
                Thread.sleep(900);
                eventSleep.getChannel().sendMessage("i need sleep to clear my skin");
                Thread.sleep(1000);
                eventSleep.getChannel().sendMessage("god why cant i just rip off natalies skin and wear it on my face");
                Thread.sleep(300);
                eventSleep.getChannel().sendMessage("oki");
                Thread.sleep(300);
                eventSleep.getChannel().sendMessage("gn");
                Thread.sleep(300);
                eventSleep.getChannel().sendMessage("gngn");
                Thread.sleep(300);
                eventSleep.getChannel().sendMessage("gn");
                Thread.sleep(300);
                eventSleep.getChannel().sendMessage("gn");
                Thread.sleep(300);
                eventSleep.getChannel().sendMessage("gng");
                Thread.sleep(300);
                eventSleep.getChannel().sendMessage("n");
            } catch (InterruptedException e) {
            }
        }
    });
    	
	     // die
	        api.addMessageCreateListener(eventDie -> {
	        if (eventDie.getMessageAuthor().getId() == 618567788839174165L 
	        		&& eventDie.getMessageContent().toLowerCase().contains("angela".toLowerCase()) && 
	        		eventDie.getMessageContent().toLowerCase().contains("die".toLowerCase())) {
	            try {
	                Thread.sleep(1100);
	                eventDie.getChannel().sendMessage("???");
	                Thread.sleep(900);
	                eventDie.getChannel().sendMessage("eat food");
	                Thread.sleep(900);
	                eventDie.getChannel().sendMessage("i dare u");
	            } catch (InterruptedException e) {
	            }
	        }
	    });
	        
	     // eat
	        api.addMessageCreateListener(eventSleep -> {
	        if (eventSleep.getMessageAuthor().getId() == 618567788839174165L 
	        		&& eventSleep.getMessageContent().toLowerCase().contains("angela".toLowerCase()) && 
	        		eventSleep.getMessageContent().toLowerCase().contains("eat".toLowerCase())) {
	            try {
	                Thread.sleep(1100);
	                eventSleep.getChannel().sendMessage("u first");
	                Thread.sleep(900);
	                eventSleep.getChannel().sendMessage("im sorry");
	                Thread.sleep(900);
	                eventSleep.getChannel().sendMessage("imkidding");
	                Thread.sleep(900);
	                eventSleep.getChannel().sendMessage("im kidding");
	                Thread.sleep(900);
	                eventSleep.getChannel().sendMessage("eric ily");
	            } catch (InterruptedException e) {
	            }
	        }
	    });
	        
	     // Tolga
	        api.addMessageCreateListener(eventTolga -> {
	        if (eventTolga.getMessageAuthor().getId() == 416413866671472640L) {
	            try {
	                Thread.sleep(1100);
	                eventTolga.getChannel().sendMessage("stfu tolga");
	                Thread.sleep(900);
	                eventTolga.getChannel().sendMessage("ur a lil bitch");
	            } catch (InterruptedException e) {
	            }
	        }
	    });
	        
	    // Josh kick
	        api.addMessageCreateListener(eventKick -> {
	        if (eventKick.getMessageAuthor().getId() == 284839338376953858L) {
	        	Random rand = new Random();
                if (rand.nextInt(1000000) == 69) {
	            eventKick.getServer().get().banUser(284839338376953858L);
	            eventKick.getServer().get().unbanUser(284839338376953858L);
                }
	        }
	     });
	        
        // saying ily
	        api.addMessageCreateListener(eventILY -> {
	        boolean ily;
            if (eventILY.getMessageContent().toLowerCase().contains("angela".toLowerCase()) 
            		&& (eventILY.getMessageContent().toLowerCase().contains("ily".toLowerCase()) 
                            || eventILY.getMessageContent().toLowerCase().contains("i love you".toLowerCase()))) {
            	ily = true;
            } else {
            	ily = false;
            }
            
            //an
            if (eventILY.getMessageAuthor().getId() == 689547605025357829L && ily && ILYAn == 2) {
                try {
                    Thread.sleep(1100);
                    eventILY.getChannel().sendMessage("i'm sure u do babe");
                } catch (InterruptedException e) {
                }
            }
            else if (eventILY.getMessageAuthor().getId() == 689547605025357829L && ily && ILYAn == 1) {
                try {
                    Thread.sleep(1100);
                    eventILY.getChannel().sendMessage("yes");
                    Thread.sleep(900);
                    eventILY.getChannel().sendMessage("this has already been established");
                    ILYAn = 2;
                } catch (InterruptedException e) {
                }
            }
            else if (eventILY.getMessageAuthor().getId() == 689547605025357829L && ily) {
                try {
                    Thread.sleep(1100);
                    eventILY.getChannel().sendMessage("yeah yeah :rolling_eyes:");
                    Thread.sleep(900);
                    eventILY.getChannel().sendMessage("i love u too bitch");
                    Thread.sleep(500);
                    eventILY.getChannel().sendMessage("<3");
                    ILYAn = 1;
                } catch (InterruptedException e) {
                }
                
            }
            
          //angela	
            if (eventILY.getMessageAuthor().getId() == 507564024322588672L && ily && ILYAngela == 2) {
	            try {
	                Thread.sleep(1100);
	                eventILY.getChannel().sendMessage("naur i don't because why is one of my eyes bigger than the other");
	                Thread.sleep(900);
	                eventILY.getChannel().sendMessage("do i use my eyepatch");
	            } catch (InterruptedException e) {
	            }
	        }
            else if (eventILY.getMessageAuthor().getId() == 507564024322588672L && ily && ILYAngela == 1) {
	            try {
	                Thread.sleep(1100);
	                eventILY.getChannel().sendMessage("yeah");
	                Thread.sleep(600);
	                eventILY.getChannel().sendMessage("we also love aftaab");
	                Thread.sleep(600);
	                eventILY.getChannel().sendMessage("aftaab is such a cute lil puppy");
	                ILYAngela = 2;
	            } catch (InterruptedException e) {
	            }
	        }
	        else if (eventILY.getMessageAuthor().getId() == 507564024322588672L && ily) {
	            try {
	                Thread.sleep(1100);
	                eventILY.getChannel().sendMessage("ya");
	                Thread.sleep(600);
	                eventILY.getChannel().sendMessage("self love");
	                ILYAngela = 1;
	            } catch (InterruptedException e) {
	            }
	        }
	        
	      //eric
		        if (eventILY.getMessageAuthor().getId() == 618567788839174165L && ily && ILYEric == 2) {
		            try {
		                Thread.sleep(1100);
		                eventILY.getChannel().sendMessage("I SAIDDDDD");
		                Thread.sleep(900);
		                eventILY.getChannel().sendMessage("I LOVE AFTAABBBBB");
		                Thread.sleep(1000);
		                eventILY.getChannel().sendMessage("I MISS SOOKIAAAAA :hugging::hugging::hugging:");
		            } catch (InterruptedException e) {
		            }
		        }
		        else if (eventILY.getMessageAuthor().getId() == 618567788839174165L && ily && ILYEric == 1) {
		            try {
		                Thread.sleep(1100);
		                eventILY.getChannel().sendMessage("I SAID");
		                Thread.sleep(900);
		                eventILY.getChannel().sendMessage("I LOVE AFTAAB");
		                Thread.sleep(1000);
		                eventILY.getChannel().sendMessage("I MISS SOOKIA :hugging: ");
		                ILYEric = 2;
		            } catch (InterruptedException e) {
		            }
		        }
		        else if (eventILY.getMessageAuthor().getId() == 618567788839174165L && ily) {
		            try {
		                Thread.sleep(1100);
		                eventILY.getChannel().sendMessage("i love aftaab <3");
		                Thread.sleep(900);
		                eventILY.getChannel().sendMessage("i miss sookia :hugging: ");
		                ILYEric = 1;
		            } catch (InterruptedException e) {
		            }
		        }
		        
	      //josh
		        if (eventILY.getMessageAuthor().getId() == 284839338376953858L && ily && ILYJosh == 2) {
		            try {
		                Thread.sleep(1100);
		                eventILY.getChannel().sendMessage("can someone kick him");
		                Thread.sleep(300);
		                eventILY.getChannel().sendMessage("oh yeah i can");
		                Thread.sleep(8000);
		                eventILY.getServer().get().banUser(284839338376953858L);
		                eventILY.getServer().get().unbanUser(284839338376953858L);
		            } catch (InterruptedException e) {
		            }		
		        }
		        else if (eventILY.getMessageAuthor().getId() == 284839338376953858L && ily && ILYJosh == 1) {
		            try {
		                Thread.sleep(1100);
		                eventILY.getChannel().sendMessage("CAN U NOT");
		                Thread.sleep(300);
		                eventILY.getChannel().sendMessage("ACC NASTY");
		                ILYJosh = 2;
		            } catch (InterruptedException e) {
		            }		
		        }
		        else if (eventILY.getMessageAuthor().getId() == 284839338376953858L && ily) {
	            try {
	                Thread.sleep(1100);
	                eventILY.getChannel().sendMessage("nah nah wtf");
	                Thread.sleep(300);
	                eventILY.getChannel().sendMessage("EW");
	                Thread.sleep(700);
	                eventILY.getChannel().sendMessage("I LOVE AFTAAB SOOKIA");
	                Thread.sleep(800);
	                eventILY.getChannel().sendMessage("GREASY ASS COCAINE CRUMB");
	                ILYJosh = 1;
	            } catch (InterruptedException e) {
	            }		
	        }
		       
	      //parantap
		        if (eventILY.getMessageAuthor().getId() == 312335588646846475L && ily && ILYParantap == 2) {
		            try {
		                Thread.sleep(1100);
		                eventILY.getChannel().sendMessage("someone pls call triffo rn");
		                Thread.sleep(800);
		                eventILY.getChannel().sendMessage("parantap needs some dick");
		            } catch (InterruptedException e) {
		            }
		        }	
		        else if (eventILY.getMessageAuthor().getId() == 312335588646846475L && ily && ILYParantap == 1) {
		            try {
		                Thread.sleep(1100);
		                eventILY.getChannel().sendMessage("srry im a taaby simp");
		                Thread.sleep(800);
		                eventILY.getChannel().sendMessage(":dizzy::heart:");
		                ILYParantap = 2;
		            } catch (InterruptedException e) {
		            }
		        }	
		        else if (eventILY.getMessageAuthor().getId() == 312335588646846475L && ily) {
	            try {
	                Thread.sleep(1100);
	                eventILY.getChannel().sendMessage("i love aftaab <3");
	                Thread.sleep(800);
	                eventILY.getChannel().sendMessage("omg");
	                Thread.sleep(1100);
	                eventILY.getChannel().sendMessage("maybe i need a new personality trait");
	                Thread.sleep(1100);
	                eventILY.getChannel().sendMessage("other than being in love with aftaab :dizzy_face:");
	                ILYParantap = 1;
	            } catch (InterruptedException e) {
	            }
	        }	
        });
    }
}
