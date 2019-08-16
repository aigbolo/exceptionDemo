package com.example.demo.exception;

public enum ExceptionMessages {
    MissingNameException("E0000","ข้อมูลชื่อไม่สมบูรณ์ กลับไปกรอกมาใหม่"),
    MissingPhoneException("E0001","ขอเบอร์หน่อย"),
    UnknownException("E0002","ไม่รู้เหมือนกันว่า error อะไร");

    public final String code;
    public final String message;

    ExceptionMessages(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
