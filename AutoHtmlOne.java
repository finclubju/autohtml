/* repository - github.com/finclubju/autohtml
 * purpose    - blog page generator
 * author     - github.com/realspal
 */
import java.io.*;
class AutoHtmlOne
{
    public static void main(String args[])throws IOException
    {
        // introduction
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\f-------------------- AUTOHTML TOOL -- BLOG PAGE GENERATOR --------------------");
        System.out.println("default@AutoHtmlOne:~$ Hello! Press ENTER to continue.");
        String str=b.readLine().trim();
        // inputs
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("default@AutoHtmlOne:~$ (1/11) Enter output path name without extension :");
        System.out.print("default@AutoHtmlOne:~$ "); 
        String writefilename=b.readLine().toLowerCase().trim()+".html";
        System.out.println("default@AutoHtmlOne:~$ (2/11) Enter input file name without extension :");
        System.out.print("default@AutoHtmlOne:~$ "); 
        String inputfilename=b.readLine().toLowerCase().trim()+".txt";
        System.out.println("default@AutoHtmlOne:~$ (3/11) Enter heading in 3 to 10 words :");
        System.out.print("default@AutoHtmlOne:~$ "); 
        String heading=b.readLine().trim();
        System.out.println("default@AutoHtmlOne:~$ (4/11) Enter subheading in 20 to 30 words :");
        System.out.print("default@AutoHtmlOne:~$ "); 
        String subheading=b.readLine().trim();
        System.out.println("default@AutoHtmlOne:~$ (5/11) Enter author name :");
        System.out.print("default@AutoHtmlOne:~$ "); 
        String authorname=b.readLine().trim();
        System.out.println("default@AutoHtmlOne:~$ (6/11) Enter author LinkedIn username OR nil :");
        System.out.print("default@AutoHtmlOne:~$ "); 
        String biolink=b.readLine().toLowerCase().trim();
        if(biolink.equals("nil"))
        biolink="#!";
        else
        biolink="https://www.linkedin.com/in/"+biolink;
        System.out.println("default@AutoHtmlOne:~$ (7/11) Enter date in <Mon DD, YYYY> format :");
        System.out.print("default@AutoHtmlOne:~$ "); 
        String date=b.readLine().trim();
        System.out.println("default@AutoHtmlOne:~$ (8/11) Enter reading time in minutes :");
        System.out.print("default@AutoHtmlOne:~$ "); 
        String min=b.readLine().trim();
        System.out.println("default@AutoHtmlOne:~$ (9/11) Enter author image tag OR nil :");
        System.out.print("default@AutoHtmlOne:~$ "); 
        String authorimg=b.readLine().toLowerCase().trim();
        System.out.println("default@AutoHtmlOne:~$ (10/11) Enter article image number :");
        System.out.print("default@AutoHtmlOne:~$ "); 
        String articleimg=b.readLine().toLowerCase().trim();
        System.out.println("default@AutoHtmlOne:~$ (11/11) Enter article topic tag name :");
        System.out.print("default@AutoHtmlOne:~$ "); 
        String tagname=b.readLine().toLowerCase().trim();
        System.out.println("default@AutoHtmlOne:~$ Press ENTER to continue. Enter EXIT to stop.");
        str=b.readLine().trim();
        b.close();
        if(!(str.equalsIgnoreCase("EXIT") || writefilename.equals(".html") || inputfilename.equals(".txt")))
        {
            // initialising
            BufferedReader rd=new BufferedReader(new FileReader("autohtmlassets\\html-format-1.txt"));
            BufferedReader in=new BufferedReader(new FileReader("autohtmlassets\\"+inputfilename));
            BufferedWriter wr=new BufferedWriter(new FileWriter("autohtmlassets\\"+writefilename));
            // writing file
            // lines 1 to 13
            for(int i=1;i<=13;i++)
            {
                wr.write(rd.readLine());
                wr.newLine();
            }
            // line 14
            str=rd.readLine();
            wr.write("<meta name=\"description\" content=\""+subheading+"\" />");
            wr.newLine();
            // lines 15 to 16
            for(int i=15;i<=16;i++)
            {
                wr.write(rd.readLine());
                wr.newLine();
            }
            // line 17
            str=rd.readLine();
            wr.write("<title>"+heading+" | Blog by FinClub JU</title>");
            wr.newLine();
            // lines 18 to 23
            for(int i=18;i<=23;i++)
            {
                wr.write(rd.readLine());
                wr.newLine();
            }
            // line 24
            str=rd.readLine();
            wr.write("<meta property=\"og:title\" content=\""+heading+" | Blog by FinClub JU\" />");
            wr.newLine();
            // line 25
            str=rd.readLine();
            wr.write("<meta property=\"og:description\" content=\""+subheading+"\" />");
            wr.newLine();
            // lines 26 to 27
            for(int i=26;i<=27;i++)
            {
                wr.write(rd.readLine());
                wr.newLine();
            }
            // line 28
            str=rd.readLine();
            wr.write("<meta property=\"og:image\" content=\"../assets/social/img/s-img-"+articleimg+".jpg\" />");
            wr.newLine();
            // lines 29 to 32
            for(int i=29;i<=32;i++)
            {
                wr.write(rd.readLine());
                wr.newLine();
            }
            // line 33
            str=rd.readLine();
            wr.write("<meta name=\"twitter:title\" content=\""+heading+" | Blog by FinClub JU\">");
            wr.newLine();
            // line 34
            str=rd.readLine();
            wr.write("<meta name=\"twitter:description\" content=\""+subheading+"\">");
            wr.newLine();
            // line 35
            str=rd.readLine();
            wr.write("<meta name=\"twitter:image\" content=\"../assets/social/img/s-img-"+articleimg+".jpg\">");
            wr.newLine();
            // lines 36 to 97
            for(int i=36;i<=97;i++)
            {
                wr.write(rd.readLine());
                wr.newLine();
            }
            // line 98
            str=rd.readLine();
            if(authorimg.equals("nil"))
                wr.write("<img class=\"img-fluid rounded-circle\" height=\"50px\" width=\"50px\" src=\"../assets/sitelogo1.jpg\" alt=\"...\" />");
            else
                wr.write("<img class=\"img-fluid rounded-circle\" height=\"50px\" width=\"50px\" src=\"../assets/profile/authors/p-img-"+authorimg+".jpg\" alt=\"...\" />");
            wr.newLine();
            // line 99
            wr.write(rd.readLine());
            wr.newLine();
            // line 100
            str=rd.readLine();
            wr.write("<div class=\"fw-bold\">"+authorname+"</div>");
            wr.newLine();
            // line 101
            str=rd.readLine();
            wr.write("<div class=\"text-muted\">"+date+" &middot; "+min+" min read</div>");
            wr.newLine();
            // line 102
            wr.write(rd.readLine());
            wr.newLine();
            // line 103
            str=rd.readLine();
            if(!biolink.equals("#!"))
            wr.write("<div class=\"text-left\"><a class=\"fs-5 link-dark\" href=\""+biolink+"\" target=\"_blank\"><i class=\"bi-linkedin\" style=\"font-size:28px; color:#005ac2;\"></i></a></div>");
            wr.newLine();
            // lines 104 to 109
            for(int i=104;i<=109;i++)
            {
                wr.write(rd.readLine());
                wr.newLine();
            }
            // line 110
            str=rd.readLine();
            wr.write("<h1 class=\"fw-bolder mb-1\">"+heading+"</h1>");
            wr.newLine();
            // line 111
            wr.write(rd.readLine());
            wr.newLine();
            // line 112
            str=rd.readLine();
            wr.write("<div class=\"text-muted fst-normal fs-5 mb-2\" style=\"text-align: justify; text-justify: inter-word;\">"+subheading+"</div>");
            wr.newLine();
            // lines 113 to 114
            for(int i=113;i<=114;i++)
            {
                wr.write(rd.readLine());
                wr.newLine();
            }
            // line 115
            str=rd.readLine();
            wr.write("<a class=\"badge text-decoration-none link-light\" style=\"font-size:14px;background-color:#cc0000;\" href=\"#!\">"+tagname+"</a>");
            wr.newLine();
            // line 116
            wr.write(rd.readLine());
            wr.newLine();
            // line 117
            str=rd.readLine();
            wr.write("<figure class=\"mb-4\"><img class=\"img-fluid rounded\" src=\"../assets/blog/h-img-"+articleimg+".jpg\" alt=\"...\" /></figure>");
            wr.newLine();
            // lines 118 to 119
            for(int i=118;i<=119;i++)
            {
                wr.write(rd.readLine());
                wr.newLine();
            }
            // article body
            String line="";
            while((line=in.readLine())!=null)
            {
                if(line.startsWith(">>"))
                    wr.write("<h2 class=\"fw-bolder mb-4 mt-5\">"+line.substring(2)+"</h2>");
                else
                    wr.write("<p class=\"fs-5 mb-4\" style=\"text-align: justify; text-justify: inter-word;\">"+line+"</p>");
                wr.newLine();
            }
            // line 120 to 144 - omit
            for(int i=120;i<=144;i++)
                str=rd.readLine();
            // lines 145 to 178
            for(int i=145;i<=178;i++)
            {
                wr.write(rd.readLine());
                wr.newLine();
            }
            // closing
            rd.close();
            in.close();
            wr.close();
            System.out.println("default@AutoHtmlOne:~$ HTML file created.");
            System.out.println("------------------------------------------------------------------------------");
        }
    }
}