package com.example.myapplication;

interface BookServices {

     Boolean inStock(int bookId);
     void lend(int bookId,int memberId);
}
