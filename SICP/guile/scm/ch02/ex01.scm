; page 56
(define (add-rat x y)
 (make-rat (+ (* (numer x) (denom y))
              (* (numer y) (denom x)))
           (* (denom x) (denom y))))
; ------------------------------------
(define (sub-rat x y)
 (make-rat (- (* (numer x) (denom y))
              (* (numer y) (denom x)))
           (* (denom x) (denom y))))
; ------------------------------------
(define (mul-rat x y)
 (make-rat (* (numer x) (numer y))
           (* (denom x) (denom y))))
; ------------------------------------
(define (div-rat x y)
 (make-rat (* (numer x) (denom y))
           (* (denom x) (numer y))))
; ------------------------------------
(define (equal-rat? x y)
 (= (* (numer x) (denom y))
    (* (numer y) (denom x))))
; ------------------------------------


; page 57
(define (make-rat n d) (cons n d))
; ------------------------------------
(define (numer x) (car x))
; ------------------------------------
(define (denom x) (cdr x))
; ------------------------------------


; page 58
(define (print-rat x)
 (newline)
 (display (numer x))
 (display "/")
 (display (denom x)))
; ------------------------------------
(define on-half (make-rat 1 2))
(define one-third (make-rat 1 3))
; (print-rat (add-rat one-half one-third))
; (print-rat (mul-rat one-half one-third))
; (print-rat (add-rat one-third one-third))
; ------------------------------------
(define (make-rat n d)
 (let ((g (gcd n d)))
  (cons (/ n g) (/ d g))))

; page 32 (Chapter 01)
(define (gcd a b)
  (if (= b 0)
    a
    (gcd b (remainder a b))))
; ------------------------------------


; page 59
(define (make-rat n d)
 (cons n d))
; ------------------------------------
(define (number x)
 (let ((g (gcd (car x) (cdr x))))
  (/ (car x) g)))
; ------------------------------------
(define (denom x)

 (let ((g (gcd (car x) (cdr x))))
  (/ (cdr x) g)))
; ------------------------------------


; page 68
;(define (append list1 list2)
;  (if (null? list1)
;      list2
;      (cons (car list1) (append (cdr list1) list2))))
; ------------------------------------

; page 68
(define (length items)
  (if (null? items)
      0
      (+ 1 (length (cdr items)))))

