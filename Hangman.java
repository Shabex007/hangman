import java.io.*;
class Hangman
{
    String word,clue;
    int option;
    PrintWriter p = new PrintWriter(System.out, true);
    private void clearScreen()
    {
        System.out.print('\u000C');
    }
    public void Hang1()
    {
        p.println("      _______   ");
        p.println("     |       |  ");
        p.println("     |          ");
        p.println("     |          ");
        p.println("     |          ");
        p.println("     |          ");
        p.println("     |          ");
        p.println("_____|_____     ");
    }
    public void Hang2()
    {
        p.println("      _______   ");
        p.println("     |       |  ");
        p.println("     |      ( ) ");
        p.println("     |          ");
        p.println("     |          ");
        p.println("     |          ");
        p.println("     |          ");
        p.println("_____|_____     ");
    }
    public void Hang3()
    {
        p.println("      _______   ");
        p.println("     |       |  ");
        p.println("     |      ( ) ");
        p.println("     |       |  ");
        p.println("     |       |  ");
        p.println("     |       |  ");
        p.println("     |          ");
        p.println("_____|_____     ");
    }
    public void Hang4()
    {
        p.println("      _______   ");
        p.println("     |       |  ");
        p.println("     |      ( ) ");
        p.println("     |       |  ");
        p.println("     |       |  ");
        p.println("     |       |  ");
        p.println("     |      /   ");
        p.println("_____|_____     ");
    }
    public void Hang5()
    {
        p.println("      _______   ");
        p.println("     |       |  ");
        p.println("     |      ( ) ");
        p.println("     |       |  ");
        p.println("     |       |  ");
        p.println("     |       |  ");
        p.println("     |      / \\");
        p.println("_____|_____     ");
    }
    public void Hang6()
    {
        p.println("      _______   ");
        p.println("     |       |  ");
        p.println("     |      ( ) ");
        p.println("     |       |  ");
        p.println("     |      /|  ");
        p.println("     |       |  ");
        p.println("     |      / \\");
        p.println("_____|_____     ");
    }
    public void Hang7()
    {
        p.println("      _______   ");
        p.println("     |       |  ");
        p.println("     |      ( ) ");
        p.println("     |       |  ");
        p.println("     |      /|\\");
        p.println("     |       |  ");
        p.println("     |      / \\");
        p.println("_____|_____     ");
    }
    public String[] Sports()
    {
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "He is an Argentine footballer who played for FC Barcelona and now plays for PSG and is captain of Argentina";
                word = "L I O N E L | M E S S I";
            }
            break;
            case 1:
            {
                clue = "First person to score 200 in ODIs";
                word = "S A C H I N | T E N D U L K A R";
            }
            break;
            case 2:
            {
                clue = "It is a South Asian team sport";
                word = "K B A D D I";
            }
            break;
            case 3:
            {
                clue = "It is a two-player board game";
                word = "C H E S S";
            }
            break;
            case 4:
            {
                clue = "It is a team sport in which two teams of six players are seperated by a net";
                word = "V O L L E Y B A L L ";
            }
            break;
            case 5:
            {
                clue = "Known as the wall";
                word = "R A H U L | D A V I D";
            }
            break;
            case 6:
            {
                clue = "World Table Tennis Champion";
                word = "Z H A N G | J I K E";
            }
            break;
            case 7:
            {
                clue = "A famous Sport";
                word = "F O O T B A L L";
            }
            break;
            case 8:
            {
                clue = "A game played on a hard board divided by a net";
                word = "T A B L E | T E N N I S";
            }
            break;
            case 9:
            {
                clue = "Grandmaster of chess";
                word = "V I S H W A N A T A N | A N A N D";
            }
            break;
        }
        return new String[] {word,clue};
    }
    public String[] Movies()
    {
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "";
                word = "";
            }
            break;
            case 1:
            {
                clue = "";
                word = "";
            }
            break;
            case 2:
            {
                clue = "";
                word = "";
            }
            break;
            case 3:
            {
                clue = "";
                word = "";
            }
            break;
            case 4:
            {
                clue = "";
                word = "";
            }
            break;
            case 5:
            {
                clue = "";
                word = "";
            }
            break;
            case 6:
            {
                clue = "";
                word = "";
            }
            break;
            case 7:
            {
                clue = "";
                word = "";
            }
            break;
            case 8:
            {
                clue = "";
                word = "";
            }
            break;
            case 9:
            {
                clue = "";
                word = "";
            }
            break;
        }
        return new String[] {word,clue};
    }
    public String[] Computers()
    {
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "The brain of the computer";
                word = "C P U";
            }
            break;
            case 1:
            {
                clue = "A screen that displays output from the computer";
                word = "M O N I T O R ";
            }
            break;
            case 2:
            {
                clue = "Used to type";
                word = "K E Y B O A R D";
            }
            break;
            case 3:
            {
                clue = "It is a family of computer networking technologies for LANs";
                word = "E T H E R N E T";
            }
            break;
            case 4:
            {
                clue = "It is an IDE for Java";
                word = "B L U E J";
            }
            break;
            case 5:
            {
                clue = "Application used for playing audio, video and viewing images";
                word = "W I N D O W S | M E D I A | P L A Y E R";
            }
            break;
            case 6:
            {
                clue = "It is a temporary form of computer data storage";
                word = "R A M";
            }
            break;
            case 7:
            {
                clue = "Full form of CPU";
                word = "C E N T R A L | P R O C E S S I N G | U N I T";
            }
            break;
            case 8:
            {
                clue = "It is used to listen to audio";
                word = "S P E A K E R";
            }
            break;
            case 9:
            {
                clue = "Clue Letters 'P' 'S'";
                word = "P R O C E S S O R";
            }
            break;
        }
        return new String[] {word,clue};
    }
    public String[] Food()
    {
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "South Indian Food";
                word = "M A S A L A | D O S A";
            }
            break;
            case 1:
            {
                clue = "Fruit which has same name as colour";
                word = "O R A N G E";
            }
            break;
            case 2:
            {
                clue = "Round Italian fast food";
                word = "P I Z Z A";
            }
            break;
            case 3:
            {
                clue = "It is a chinese food";
                word = "N O O D L E S";
            }
            break;
            case 4:
            {
                clue = "No clue for this one";
                word = "P I N E A P P L E";
            }
            break;
            case 5:
            {
                clue = "A bun between which a party is kept";
                word = "B U R G E R";
            }
            break;
            case 6:
            {
                clue = "Its is a chat";
                word = "P A N I | P U R I";
            }
            break;
            case 7:
            {
                clue = "Its a green fruit";
                word = "W A T E R | M E L O N";
            }
            break;
            case 8:
            {
                clue = "Consists of two or more slices of bread with fillings between them";
                word = "S A N D W I C H";
            }
            break;
            case 9:
            {
                clue = "No clue";
                word = "P A S T A";
            }
            break;
        }
        return new String[] {word,clue};
    }
    public String[] Countries()
    {
        option = (int)(Math.random()*10);
        switch(option)
        {
            case 0:
            {
                clue = "Means rich coast in spanish";
                word = "C O S T A | R I C A";
            }
            break;
            case 1:
            {
                clue = "No clue";
                word = "I N D I A";
            }
            break;
            case 2:
            {
                clue = "T&T";
                word = "T R I N I D A D | A N D | T O B A G O";
            }
            break;
            case 3:
            {
                clue = "Consits of nearly one thousand islands";
                word = "S O L O M O N | I S L A N D";
            }
            break;
            case 4:
            {
                clue = "Its Capital is Riyadh";
                word = "S A U D I | A R A B I A";
            }
            break;
            case 5:
            {
                clue = "The fastest man on earth is from this country";
                word = "J A M A I C A";
            }
            break;
            case 6:
            {
                clue = "3 Movies have been filmed using this country's name";
                word = "M A D A G A S C A R";
            }
            break;
            case 7:
            {
                clue = "Greatest World power";
                word = "U S A";
            }
            break;
            case 8:
            {
                clue = "Luckky : you are getting a free letter : 'Y'";
                word = "M A L A Y S I A";
            }
            break;
            case 9:
            {
                clue = "Famous for Kungfu";
                word = "C H I N A";
            }
            break;
        }
        return new String[] {word,clue};
    }
    public static void main(String args[])throws IOException
    {
        Hangman obj = new Hangman();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter p = new PrintWriter(System.out,true);
        p.println();
        p.println("\nLet's play Hangman by Mohammed Shabaaz");
        p.println();
        p.println("Enter your choise acording to the following topics. \nNOTE: Words are related to topics given below.");
        p.println();
        p.println("1.Sports");
        p.println("2.Movies");
        p.println("3.Computers");
        p.println("4.Food");
        p.println("5.Countries");
        p.println();
        int choise = Integer.parseInt(br.readLine());
        obj.clearScreen();
        String bothwordandclue[] = new String[2];
        if(choise==1)
        bothwordandclue = obj.Sports();
        else if(choise==2)
        bothwordandclue = obj.Movies();
        else if(choise==3)
        bothwordandclue = obj.Computers();
        else if(choise==4)
        bothwordandclue = obj.Food();
        else if(choise==5)
        bothwordandclue = obj.Countries();
        else
        p.println("Wrong Choise");
        int counter = 6;
        String guessword = bothwordandclue[0];
        String wordclue = bothwordandclue[1];
        int lengthofword = (int)(Math.round(((double)guessword.length()/2)));
        int checkguess = 0;
        String a;
        String guesses[] = new String[50];
        StringBuffer guessit = new StringBuffer();
        for(int i=0;i<lengthofword;i++)
        guessit = guessit.append("_ ");
        guessit.delete((2*lengthofword)-1,(2*lengthofword));
        int index = guessword.indexOf("|");
        while(index>=0)
        {
            guessit.setCharAt(index, '|');
            index = guessword.indexOf("|", index+1);
        }
        p.println(guessit + "\t\t\t\t\t The letters you have enterd so far");
        do
        {
            p.println();
            if(counter == 6)
            obj.Hang1();
            if(counter == 5)
            obj.Hang2();
            if(counter == 4)
            obj.Hang3();
            if(counter == 3)
            obj.Hang4();
            if(counter == 2)
            obj.Hang5();
            if(counter == 1)
            obj.Hang6();
            p.println();
            p.println("Enter your guess letter");
            String guessletter2 = br.readLine();
            String guessletter = guessletter2.toUpperCase();
            obj.clearScreen();
            for(int i = 0;i<lengthofword;i++)
            {
                if(guessletter.charAt(0)==guessword.charAt(2*i))
                {
                    guessit.setCharAt(2*i,guessletter.charAt(0));
                    checkguess=1;
                }
            }
            if(checkguess == 1)
            {
                p.println("Correct Guess. You have "+counter+" Chances left");
                p.println(guessit);
            }
            else
            {
                counter--;
                if(counter == 0)
                {
                    p.println("Wrong guess. You have hanged the man:(");
                    p.println(guessit);
                    obj.Hang7();
                }
                else
                {
                p.println("wrong Guess. You have "+counter+" Chances left");
                p.println(guessit);
                }
            }
            checkguess=0;
            if(counter == 0)
            p.println("\nSorry you lost the game\n\nThe correct word is " +guessword);
            a=guessit.toString();
            if(a.equals(guessword))
            {
                p.println("You guessed the word!!!!");
                counter=0;
            }
        }while(counter>0);
    }
}    