package org.example;

public class BookImpl
{
    public static void main(String[] args)
    {
        Book obj = new Book();

        System.out.println(" Author name "+ obj.authorName);
        System.out.println(" title "+ obj.title);
        System.out.println("obj.yearOfPublication = " + obj.yearOfPublication);
        System.out.println("obj.numberISBN = " + obj.numberISBN);
    }
}
