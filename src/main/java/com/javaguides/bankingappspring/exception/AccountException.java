/*1. Create custom exception named AccountException
2. using AccountException
3. Create ErrorDetails Class to hold error response = record class
4. Create GlobalExceptionalHandler to handle specific exceptions
 as well as generic exceptions*?
 */

package com.javaguides.bankingappspring.exception;

public class AccountException extends RuntimeException{

    public AccountException(String message){
        super(message);
    }
}
