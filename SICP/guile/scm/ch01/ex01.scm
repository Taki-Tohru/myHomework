; page 8
(define (square x) (* x x))

; page 8
(define (sum-of-squares x y)
 (+ (square x) (square y)))

; page 9
(define (f a)
 (sum-of-squares (+ a 1) (* a 2)))

; page 11
(define (abs x)
 (cond ((> x 0) x)
       ((= x 0) 0)
       ((< x 0) (-x))))

; page 12
(define (abs x)
 (cond ((< x 0) (- x))
       (else x)))

; page 12
(define (abs x)
 (if (< x 0)
     (- x)
     x))

; page 13
(define (>= x y)
 (or (> x y) (= x y)))

; page 13
(define (>= x y)
 (not (< x y)))

; me add
(define (<= x y)
 (not (> x y)))
