import java.util.*;
class KaunBanegaLakhpati
{
    Scanner sc=new Scanner(System.in);
    String name,choice,y,n,lifeline,prompt,line,life1,life2,life3;
    int ans,nolife,l1,l2,l3,count,ch;
    public KaunBanegaLakhpati()
    {
        ch=0;//for accepting the choice of lifeline
        count=0;// to continue or not
        name=" ";
        choice=" ";//for lifeline
        y="yes";
        n="no";
        ans=0;//to accept the answer of each question
        nolife=3;//number of lifelines left
        l1=1;//50-50 lifeline
        l2=1;//Audience poll lifeline
        l3=1;//Computer lifeline
        life1=" (1) 50/50  ";
        life2=" (2) Audience poll";
        life3=" (3) Ask the computer";
        prompt= " Would you like to use a lifeline?\n Answer in yes or no";
        line=" ";//yes or no for lifeline
    }

    public void intro()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Kaun Banega Crorepati!");
        System.out.println("Please enter your name");
        name=sc.nextLine();

        System.out.println(name+ " the rules are as follows:");
        System.out.println("1. There will be fifteen questions , there will be four options for each question and only one will be the correct answer");
        System.out.println("2. You will get three lifelines:");
        System.out.println("   (1) 50/50 -            Two wrong options will be eliminated");
        System.out.println("   (2) Audience poll -    The audience gives it opinion(int the form of votes)as the correct answer");
        System.out.println("   (3) Ask the computer-  The computer provides with the correct answer");
        System.out.println("3. Each lifeline can only be used once");
        System.out.println("We hope you are ready...............Let the game begin");
        for(int p=15;p>0;p++)//Delay loop to give wait effect on program
        {

        }
    }

    public void cont()//asks the user if he wants to continue
    {
        sc.nextLine();
        System.out.println("Do you want to continue to play the next question?\n Please enter yes or no");
        choice=sc.nextLine();
        if(choice.equalsIgnoreCase(y))
            count++;
        else if(choice.equalsIgnoreCase(n))
            count=0;
    }

    public void question1()
    {
        System.out.println("FIRST QUESTION");
        System.out.println("Teacher’s day is celebrated on the birth anniversary of : (Rs.1000)");
        System.out.println(" (1) Dr.Sarvepalli Radhakrishnan\t(2)Sarvepalli Veeraswami");
        System.out.println(" (3)Ramaswamy Venkataraman      \t(4)Radhakrishnan Nair Harshan");
        System.out.println(prompt);//asking for a lifeline in yes or no
        line=sc.nextLine();
        if(line.equalsIgnoreCase(y)&&nolife>0)
        {
            lifeline1();
            System.out.println("Enter the number of your answer");
            ans=sc.nextInt();
        }
        else if(line.equalsIgnoreCase(n))
        {
            System.out.println("Enter the number of your answer");
            ans=sc.nextInt();
        }
        else
        {
            System.out.println("Game terminates as input is invalid");
            System.exit(0);
        }

        if(ans==1)
            System.out.println("You have chosen the right answer!\n You win Rs.1000");
        else
        {
            System.out.println("Wrong answer\n Better luck next time!");
            System.out.println("The correct answer is :(1) Dr.Sarvepalli Radhakrishnan");
            System.exit(0);
        }
        cont();
    }

    public void lifeline1()
    {
        nolife--;
        System.out.println("Your lifelines are:");
        if(l1==1)
            System.out.println(life1);
        if(l2==1)
            System.out.println(life2);
        if(l3==1)
            System.out.println(life3);
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Your new options are :");
                System.out.println("(1) Dr.Sarvepalli Radhakrishnan\t(2)Sarvepalli Veeraswami");
                System.out.println("(3)                            \t(4)                     ");
                l1=0;
                break;
            case 2:
                System.out.println("The audience votes");
                System.out.println("(1) Dr.Sarvepalli Radhakrishnan = 80%\t(2)Sarvepalli Veeraswami = 10%");
                System.out.println("(3)Ramaswamy Venkataraman = 5%       \t(4)Radhakrishnan Nair Harshan = 5%");
                l2=0;
                break;
            case 3:
                System.out.println("Our expert computer's opinion would suggest you to go ahead with (1) Dr.Sarvepalli Radhakrishnan");
                l3=0;
                break;
            default:
                System.out.println("Wrong input");

        }
    }

    public void question2()
    {
        if(count==0)
            System.exit(0);
        else

        {
            System.out.println("SECOND QUESTION");
            System.out.println("The number of states in India (Rs.3000)");
            System.out.println("(1)29\t(2)27");
            System.out.println("(3)28\t(4) None of these");
            System.out.println(prompt);
            line=sc.nextLine();
            if(line.equalsIgnoreCase(y)&&nolife>0)
            {
                lifeline2();
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else if(line.equalsIgnoreCase(n))
            {
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else
            {
                System.out.println("Game terminates as input is invalid");
                System.exit(0);
            }

            if(ans==3)
                System.out.println("You have chosen the right answer!\n You win Rs.3000");
            else
            {
                System.out.println("Wrong answer\n Better luck next time!");
                System.out.println("The correct answer is :(3)28");
                System.exit(0);

            }
            cont();
        }

    }


    public void lifeline2()
    {
        nolife--;
        System.out.println("Your lifelines are:");
        if(l1==1)
            System.out.println(life1);
        if(l2==1)
            System.out.println(life2);
        if(l3==1)
            System.out.println(life3);
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Your new options are :");
                System.out.println("(1) 29\t(2)");
                System.out.println("(3) 28\t(4)");
                l1=0;
                break;
            case 2:
                System.out.println("The audience votes");
                System.out.println("(1)29 = 30%\t(2)27 = 5%");
                System.out.println("(3)28 = 60%\t(4)None of these = 5%");
                l2=0;
                break;
            case 3:
                System.out.println("Our expert computer's opinion would suggest you to go ahead with (3)28");
                l3=0;
                break;
            default:
                System.out.println("Wrong input");

        }
    }

    public void question3()
    {
        if(count==0)
            System.exit(0);
        else
        {
            System.out.println("THIRD QUESTION");
            System.out.println(".The largest hot desert in the world is (Rs.5000)");
            System.out.println("(1)Thar  \t(2)Kalahari");
            System.out.println("(3)Sahara\t(4)Sonoran");
            System.out.println(prompt);
            line=sc.nextLine();
            if(line.equalsIgnoreCase(y)&&nolife>0)
            {
                lifeline3();
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else if(line.equalsIgnoreCase(n))
            {
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else
            {
                System.out.println("Game terminates as input is invalid");
                System.exit(0);
            }

            if(ans==3)
                System.out.println("You have chosen the right answer!\n You win Rs.5000");
            else
            {
                System.out.println("Wrong answer\n Better luck next time!");
                System.out.println("The correct answer is :(3)Sahara");
                System.exit(0);

            }

        }
        cont();
    }

    public void lifeline3()
    {
        nolife--;
        System.out.println("Your lifelines are:");
        if(l1==1)
            System.out.println(life1);
        if(l2==1)
            System.out.println(life2);
        if(l3==1)
            System.out.println(life3);
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Your new options are :");
                System.out.println("(1)Thar \t(2)");
                System.out.println("(3)Sahara \t(4)");
                l1=0;
                break;
            case 2:
                System.out.println("The audience votes");
                System.out.println("(1)Thar = 25%\t(2)Kalahari = 5%");
                System.out.println("(3)Sahara = 65%\t(4)Sonoran = 5%");
                l2=0;
                break;
            case 3:
                System.out.println("Our expert computer's opinion would suggest you to go ahead with (3)Sahara");
                l3=0;
                break;
            default:
                System.out.println("Wrong input");

        }

    }

    public void question4()
    {
        if(count==0)
            System.exit(0);
        else
        {
            System.out.println("FOURTH QUESTION");
            System.out.println("The number of union territories in India(Rs.7000)");
            System.out.println("(1)7\t(2)8");
            System.out.println("(3)9\t(4)None of these");
            System.out.println(prompt);
            line=sc.nextLine();
            if(line.equalsIgnoreCase(y)&&nolife>0)
            {
                lifeline4();
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else if(line.equalsIgnoreCase(n))
            {
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else
            {
                System.out.println("Game terminates as input is invalid");
                System.exit(0);
            }

            if(ans==2)
                System.out.println("You have chosen the right answer!\n You win Rs.7000");
            else
            {
                System.out.println("Wrong answer\n Better luck next time!");
                System.out.println("The correct answer is :(2)8");
                System.exit(0);

            }
            cont();
        }
    }

    public void lifeline4()
    {
        nolife--;
        System.out.println("Your lifelines are:");
        if(l1==1)
            System.out.println(life1);
        if(l2==1)
            System.out.println(life2);
        if(l3==1)
            System.out.println(life3);
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Your new options are :");
                System.out.println("(1)7 \t(2)8");
                System.out.println("(3)  \t(4)");
                l1=0;
                break;
            case 2:
                System.out.println("The audience votes");
                System.out.println("(1)7= 30%\t(2)8= 60%");
                System.out.println("(3)9= 5%\t(4)None of these= 5%");
                l2=0;
                break;
            case 3:
                System.out.println("Our expert computer's opinion would suggest you to go ahead with (2)8");
                l3=0;
                break;
            default:
                System.out.println("Wrong input");

        }

    }

    public void question5()
    {
        if(count==0)
            System.exit(0);
        else
        {
            System.out.println("FIFTH QUESTION");
            System.out.println("Arrange the following festivals in the order in which they were held or will be held (Rs.10,000)");
            System.out.println("(1) Janmashtami (2) Rakshabandhan");
            System.out.println("(3) Dussehra (4) Diwali");

            System.out.println("(1)2,1,3,4\t(2)1,2,3,4");
            System.out.println("(3)3,4,1,2 \t (4)None of these");

            System.out.println(prompt);
            line=sc.nextLine();
            if(line.equalsIgnoreCase(y)&&nolife>0)
            {
                lifeline5();
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else if(line.equalsIgnoreCase(n))
            {
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else
            {
                System.out.println("Game terminates as input is invalid");
                System.exit(0);
            }

            if(ans==1)
                System.out.println("You have chosen the right answer!\n You win Rs.10,000");
            else
            {
                System.out.println("Wrong answer\n Better luck next time!");
                System.out.println("The correct answer is :(1)2,1,3,4");
                System.exit(0);

            }
            cont();
        }
    }

    public void lifeline5()
    {
        nolife--;
        System.out.println("Your lifelines are:");
        if(l1==1)
            System.out.println(life1);
        if(l2==1)
            System.out.println(life2);
        if(l3==1)
            System.out.println(life3);
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Your new options are :");
                System.out.println("(1)2,1,3,4 \t(2)");
                System.out.println("(3)  \t(4)None of these");
                l1=0;
                break;
            case 2:
                System.out.println("The audience votes");
                System.out.println("(1)2,1,3,4=75%\t(2)1,2,3,4=15 %");
                System.out.println("(3)3,4,1,2= 6%\t(4)None of these= 4%");
                l2=0;
                break;
            case 3:
                System.out.println("Our expert computer's opinion would suggest you to go ahead with (1)2,1,3,4");
                l3=0;
                break;
            default:
                System.out.println("Wrong input");

        }

    }

    public void question6()
    {
        if(count==0)
            System.exit(0);
        else
        {
            System.out.println("SIXTH QUESTION");
            System.out.println("The no. of lines in the Ashoka Chakra are (Rs.12,000)");

            System.out.println("(1)24\t(2)26");
            System.out.println("(3)25\t (4)27");

            System.out.println(prompt);
            line=sc.nextLine();
            if(line.equalsIgnoreCase(y)&&nolife>0)
            {
                lifeline6();
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else if(line.equalsIgnoreCase(n))
            {
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else
            {
                System.out.println("Game terminates as input is invalid");
                System.exit(0);
            }

            if(ans==1)
                System.out.println("You have chosen the right answer!\n You win Rs.12,000");
            else
            {
                System.out.println("Wrong answer\n Better luck next time!");
                System.out.println("The correct answer is :(1)24");
                System.exit(0);

            }
            cont();
        }
    }

    public void lifeline6()
    {
        nolife--;
        System.out.println("Your lifelines are:");
        if(l1==1)
            System.out.println(life1);
        if(l2==1)
            System.out.println(life2);
        if(l3==1)
            System.out.println(life3);
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Your new options are :");
                System.out.println("(1)24 \t(2)");
                System.out.println("(3)25 \t(4)");
                l1=0;
                break;
            case 2:
                System.out.println("The audience votes");
                System.out.println("(1)24=70%\t(2)26=20%");
                System.out.println("(3)25= 6%\t(4)27= 4%");
                l2=0;
                break;
            case 3:
                System.out.println("Our expert computer's opinion would suggest you to go ahead with (1)24");
                l3=0;
                break;
            default:
                System.out.println("Wrong input");

        }

    }

    public void question7()
    {
        if(count==0)
            System.exit(0);
        else
        {
            System.out.println("SEVENTH QUESTION");
            System.out.println("Which is the cleanest city in India? (Rs.15,000)");

            System.out.println("(1)Jaipur\t(2)Indore");
            System.out.println("(3)Hyderabad\t (4)Kolkata");

            System.out.println(prompt);
            line=sc.nextLine();
            if(line.equalsIgnoreCase(y)&&nolife>0)
            {
                lifeline7();
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else if(line.equalsIgnoreCase(n))
            {
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else
            {
                System.out.println("Game terminates as input is invalid");
                System.exit(0);
            }

            if(ans==2)
                System.out.println("You have chosen the right answer!\n You win Rs.15,000");
            else
            {
                System.out.println("Wrong answer\n Better luck next time!");
                System.out.println("The correct answer is :(2)Indore");
                System.exit(0);

            }
            cont();
        }
    }

    public void lifeline7()
    {
        nolife--;
        System.out.println("Your lifelines are:");
        if(l1==1)
            System.out.println(life1);
        if(l2==1)
            System.out.println(life2);
        if(l3==1)
            System.out.println(life3);
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Your new options are :");
                System.out.println("(1)Jaipur\t(2)Indore");
                System.out.println("(3)       \t(4)");
                l1=0;
                break;
            case 2:
                System.out.println("The audience votes");
                System.out.println("(1)Jaipur=15%\t(2)Indore=65%");
                System.out.println("(3)Hyderabad= 10%\t(4)Kolkata= 10%");
                l2=0;
                break;
            case 3:
                System.out.println("Our expert computer's opinion would suggest you to go ahead with (2)Indore");
                l3=0;
                break;
            default:
                System.out.println("Wrong input");

        }

    }

    public void question8()
    {
        if(count==0)
            System.exit(0);
        else
        {
            System.out.println("Which of these terms describes a hairstyle worn by girls and women(Rs.17,000)");

            System.out.println("(1)Dogtail\t(2)Pigtail");
            System.out.println("(3)Cattail\t (4)Goattail");

            System.out.println(prompt);
            line=sc.nextLine();
            if(line.equalsIgnoreCase(y)&&nolife>0)
            {
                lifeline8();
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else if(line.equalsIgnoreCase(n))
            {
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else
            {
                System.out.println("Game terminates as input is invalid");
                System.exit(0);
            }

            if(ans==2)
                System.out.println("You have chosen the right answer!\n You win Rs.17,000");
            else
            {
                System.out.println("Wrong answer\n Better luck next time!");
                System.out.println("The correct answer is :(2)Pigtail");
                System.exit(0);

            }
            cont();
        }
    }

    public void lifeline8()
    {
        nolife--;
        System.out.println("Your lifelines are:");
        if(l1==1)
            System.out.println(life1);
        if(l2==1)
            System.out.println(life2);
        if(l3==1)
            System.out.println(life3);
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Your new options are :");
                System.out.println("(1)       \t(2)Pigtail");
                System.out.println("(3)Cattail \t(4)      ");
                l1=0;
                break;
            case 2:
                System.out.println("The audience votes");
                System.out.println("(1)Dogtail=15%\t (2)Pigtail=65%");
                System.out.println("(3)Cattail= 6%\t(4)Goattail= 4%");
                l2=0;
                break;
            case 3:
                System.out.println("Our expert computer's opinion would suggest you to go ahead with (2)Pigtail");
                l3=0;
                break;
            default:
                System.out.println("Wrong input");

        }

    }

    public void question9()
    {
        if(count==0)
            System.exit(0);
        else
        {
            System.out.println("What is the capital of Arunachal Pradesh? (Rs.20,000)");

            System.out.println("(1)Itanagar\t(2)Dispur");
            System.out.println("(3)Imphal\t (4)Panaji");

            System.out.println(prompt);
            line=sc.nextLine();
            if(line.equalsIgnoreCase(y)&&nolife>0)
            {
                lifeline9();
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else if(line.equalsIgnoreCase(n))
            {
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else
            {
                System.out.println("Game terminates as input is invalid");
                System.exit(0);
            }

            if(ans==1)
                System.out.println("You have chosen the right answer!\n You win Rs.20,000");
            else
            {
                System.out.println("Wrong answer\n Better luck next time!");
                System.out.println("The correct answer is :(1)Itanagar");
                System.exit(0);

            }
            cont();
        }
    }

    public void lifeline9()
    {
        nolife--;
        System.out.println("Your lifelines are:");
        if(l1==1)
            System.out.println(life1);
        if(l2==1)
            System.out.println(life2);
        if(l3==1)
            System.out.println(life3);
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Your new options are :");
                System.out.println("(1)Itanagar \t(2)");
                System.out.println("(3)Imphal   \t(4)      ");
                l1=0;
                break;
            case 2:
                System.out.println("The audience votes");
                System.out.println("(1)Itanagar=65%\t(2)Dispur=25%");
                System.out.println("(3)Imphal  = 6%\t(4)Panaji= 4%");
                l2=0;
                break;
            case 3:
                System.out.println("Our expert computer's opinion would suggest you to go ahead with (1)Itanagar");
                l3=0;
                break;
            default:
                System.out.println("Wrong input");

        }

    }

    public void question10()
    {
        if(count==0)
            System.exit(0);
        else
        {
            System.out.println("‘ In 3 Idiots’, what does Rancho define as “Instruments that records analyse, summarize, organize, debate and explain information … ” ?(Rs.25,000)");

            System.out.println("(1)Machines\t(2)Computer");
            System.out.println("(3)Books   \t(4)Tape-recorder");

            System.out.println(prompt);
            line=sc.nextLine();
            if(line.equalsIgnoreCase(y)&&nolife>0)
            {
                lifeline10();
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else if(line.equalsIgnoreCase(n))
            {
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else
            {
                System.out.println("Game terminates as input is invalid");
                System.exit(0);
            }

            if(ans==3)
                System.out.println("You have chosen the right answer!\n You win Rs.25,000");
            else
            {
                System.out.println("Wrong answer\n Better luck next time!");
                System.out.println("The correct answer is :(3)Books");
                System.exit(0);

            }
            cont();
        }
    }

    public void lifeline10()
    {
        nolife--;
        System.out.println("Your lifelines are:");
        if(l1==1)
            System.out.println(life1);
        if(l2==1)
            System.out.println(life2);
        if(l3==1)
            System.out.println(life3);
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Your new options are :");
                System.out.println("(1)Machines \t(2)");
                System.out.println("(3)Books    \t(4)      ");
                l1=0;
                break;
            case 2:
                System.out.println("The audience votes");
                System.out.println("(1)Machines=5%\t(2)Computer=20%");
                System.out.println("(3)Books = 70%\t(4)Tape-recorder= 5%");
                l2=0;
                break;
            case 3:
                System.out.println("Our expert computer's opinion would suggest you to go ahead with (3)Books");
                l3=0;
                break;
            default:
                System.out.println("Wrong input");

        }

    }

    public void question11()
    {
        if(count==0)
            System.exit(0);
        else
        {
            System.out.println("Starting from the top and moving down, arrange these items according to the body parts they are applied on (Rs. 30,000)");
            System.out.println("(1)Surma\t(2)Alta");
            System.out.println("(3)Sindoor   \t(4)Bindiya");
            System.out.println("(1)3,4,1,2\t(2)3,4,2,1");
            System.out.println("(3)3,1,4,2   \t(4)3,1,2,4");
            System.out.println(prompt);
            line=sc.nextLine();
            if(line.equalsIgnoreCase(y)&&nolife>0)
            {
                lifeline11();
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else if(line.equalsIgnoreCase(n))
            {
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else
            {
                System.out.println("Game terminates as input is invalid");
                System.exit(0);
            }

            if(ans==1)
                System.out.println("You have chosen the right answer!\n You win Rs.30,000");
            else
            {
                System.out.println("Wrong answer\n Better luck next time!");
                System.out.println("The correct answer is :(1)3,4,1,2");
                System.exit(0);

            }
            cont();
        }
    }

    public void lifeline11()
    {
        nolife--;
        System.out.println("Your lifelines are:");
        if(l1==1)
            System.out.println(life1);
        if(l2==1)
            System.out.println(life2);
        if(l3==1)
            System.out.println(life3);
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Your new options are :");
                System.out.println("(1)3,4,1,2 \t(2)3,4,2,1");
                System.out.println("(3)    \t(4)      ");
                l1=0;
                break;
            case 2:
                System.out.println("The audience votes");
                System.out.println("(1)3,4,1,2=72%\t(2)3,4,2,1=15%");
                System.out.println("(3)3,1,4,2 = 5%\t(4)3,1,2,4= 8%");
                l2=0;
                break;
            case 3:
                System.out.println("Our expert computer's opinion would suggest you to go ahead with (1)3,4,1,2");
                l3=0;
                break;
            default:
                System.out.println("Wrong input");
        }
    }

    public void question12()
    {
        if(count==0)
            System.exit(0);
        else
        {
            System.out.println("The first satellite of India was:(Rs.40,000)");
            //cont();
            System.out.println("(1)Ramanujan\t(2)SARAL");
            System.out.println("(3)Aryabhata\t (4)Bhaskara - 1");

            System.out.println(prompt);
            line=sc.nextLine();
            if(line.equalsIgnoreCase(y)&&nolife>0)
            {
                lifeline12();
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else if(line.equalsIgnoreCase(n))
            {
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else
            {
                System.out.println("Game terminates as input is invalid");
                System.exit(0);
            }

            if(ans==3)
                System.out.println("You have chosen the right answer!\n You win Rs.40,000");
            else
            {
                System.out.println("Wrong answer\n Better luck next time!");
                System.out.println("The correct answer is :(3)Aryabhatta");
                System.exit(0);

            }
            cont();
        }
    }

    public void lifeline12()
    {
        nolife--;
        System.out.println("Your lifelines are:");
        if(l1==1)
            System.out.println(life1);
        if(l2==1)
            System.out.println(life2);
        if(l3==1)
            System.out.println(life3);
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Your new options are :");
                System.out.println("(1)       \t(2)SARAL");
                System.out.println("(3)Aryabhata \t(4)      ");
                l1=0;
                break;
            case 2:
                System.out.println("The audience votes");
                System.out.println("(1)Ramanujan= 15%\t (2)SARAL= 65%");
                System.out.println("(3)Aryabhata= 6%\t(4)Bhaskara - 1= 4%");
                l2=0;
                break;
            case 3:
                System.out.println("Our expert computer's opinion would suggest you to go ahead with (3)Arayabhata");
                l3=0;
                break;
            default:
                System.out.println("Wrong input");

        }
    }

    public void question13()
    {
        if(count==0)
            System.exit(0);
        else
        {
            System.out.println("The author of 'Life Of Pi' is(Rs.60,000)");

            System.out.println("(1)Pi Patel\t(2)Yann Martel");
            System.out.println("(3)Ang Lee\t (4)Richard Parker");

            System.out.println(prompt);
            line=sc.nextLine();
            if(line.equalsIgnoreCase(y)&&nolife>0)
            {
                lifeline13();
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else if(line.equalsIgnoreCase(n))
            {
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else
            {
                System.out.println("Game terminates as input is invalid");
                System.exit(0);
            }

            if(ans==2)
                System.out.println("You have chosen the right answer!\n You win Rs.60,000");
            else
            {
                System.out.println("Wrong answer\n Better luck next time!");
                System.out.println("The correct answer is :(2)Yann Martel");
                System.exit(0);

            }
            cont();
        }
    }

    public void lifeline13()
    {
        nolife--;
        System.out.println("Your lifelines are:");
        if(l1==1)
            System.out.println(life1);
        if(l2==1)
            System.out.println(life2);
        if(l3==1)
            System.out.println(life3);
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Your new options are :");
                System.out.println("(1)Pi Patel\t(2)Yann Martel");
                System.out.println("(3)        \t(4)      ");
                l1=0;
                break;
            case 2:
                System.out.println("The audience votes");
                System.out.println("(1)Pi Patel= 15%\t (2)Yann Martel= 65%");
                System.out.println("(3)Ang Lee= 6%  \t (4)Richard Parker= 4%");
                l2=0;
                break;
            case 3:
                System.out.println("Our expert computer's opinion would suggest you to go ahead with (2)Yann Martel");
                l3=0;
                break;
            default:
                System.out.println("Wrong input");

        }
    }

    public void question14()
    {
        if(count==0)
            System.exit(0);
        else
        {
            System.out.println("In which of these states is 'Elephant Falls' located? (Rs 1,00,000)");

            System.out.println("(1)Manipur\t(2)Meghalaya");
            System.out.println("(3)Mizoram\t(4)Nagaland");

            System.out.println(prompt);
            line=sc.nextLine();
            if(line.equalsIgnoreCase(y)&&nolife>0)
            {
                lifeline14();
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else if(line.equalsIgnoreCase(n))
            {
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else
            {
                System.out.println("Game terminates as input is invalid");
                System.exit(0);
            }

            if(ans==2)
                System.out.println("You have chosen the right answer!\n You win Rs.1,00,000");
            else
            {
                System.out.println("Wrong answer\n Better luck next time!");
                System.out.println("The correct answer is :(2)Meghalaya");
                System.exit(0);

            }
            cont();
        }
    }

    public void lifeline14()
    {
        nolife--;
        System.out.println("Your lifelines are:");
        if(l1==1)
            System.out.println(life1);
        if(l2==1)
            System.out.println(life2);
        if(l3==1)
            System.out.println(life3);
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Your new options are :");
                System.out.println("(1)        \t(2)Meghalaya");
                System.out.println("(3)Mizoram \t(4)      ");
                l1=0;
                break;
            case 2:
                System.out.println("The audience votes");
                System.out.println("(1)Manipur= 15%\t (2)Meghalaya= 65%");
                System.out.println("(3)Mizoram= 15%\t (4)Nagaland= 5%");
                l2=0;
                break;
            case 3:
                System.out.println("Our expert computer's opinion would suggest you to go ahead with (2)Meghalaya");
                l3=0;
                break;
            default:
                System.out.println("Wrong input");

        }
    }

    public void question15()
    {
        if(count==0)
            System.exit(0);
        else
        {
            System.out.println("Which is the southernmost place of India? (Rs 1,50,000)");

            System.out.println("(1)Kanyakumari \t(2)Port Blair");
            System.out.println("(3)Cape Comorin\t(4)Indira Point");
            System.out.println(prompt);
            line=sc.nextLine();
            if(line.equalsIgnoreCase(y)&&nolife>0)
            {
                lifeline15();
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else if(line.equalsIgnoreCase(n))
            {
                System.out.println("Enter the number of your answer");
                ans=sc.nextInt();
            }
            else
            {
                System.out.println("Game terminates as input is invalid");
                System.exit(0);
            }
            if(ans==4)
            {
                System.out.println("You have chosen the right answer!\n You win Rs.1,50,000");
                System.out.println("Heartfelt Congradulations to, "+ name+" on winning Kaun Banega Crorepati!");
            }
            else
            {
                System.out.println("Wrong answer\n Better luck next time!");
                System.out.println("The correct answer is :(4)Indira Point");
                System.exit(0);

            }

        }
    }

    public void lifeline15()
    {
        nolife--;
        System.out.println("Your lifelines are:");
        if(l1==1)
            System.out.println(life1);
        if(l2==1)
            System.out.println(life2);
        if(l3==1)
            System.out.println(life3);
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Your new options are :");
                System.out.println("(1)Kanyakumari\t(2)          ");
                System.out.println("(3)           \t(4)Indira Point ");
                l1=0;
                break;
            case 2:
                System.out.println("The audience votes");
                System.out.println("(1)Kanyakumari= 25% \t (2)Port Blair= 5%");
                System.out.println("(3)Cape Comorin= 5%\t (4)Indira Point= 65%");
                l2=0;
                break;
            case 3:
                System.out.println("Our expert computer's opinion would suggest you to go ahead with (4)Indira Point");
                l3=0;
                break;
            default:
                System.out.println("Wrong input");

        }
    }


    public static void main(String args[])
    {
        KaunBanegaLakhpati obj=new KaunBanegaLakhpati();
        obj.intro();
        obj.question1();
        obj.question2();
        obj.question3();
        obj.question4();
        obj.question5();
        obj.question6();
        obj.question7();
        obj.question8();
        obj.question9();
        obj.question10();
        obj.question11();
        obj.question12();
        obj.question13();
        obj.question14();
        obj.question15();
    }
}

