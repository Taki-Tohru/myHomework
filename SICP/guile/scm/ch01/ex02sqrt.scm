; page 15
(define (average x y)
  (/ (+ x y) 2))

; page 15
(define (improve guess x)
  (average guess (/ x guess)))

; page 15
(define (good-enough? guess x)
  (< (abs (- (square guess) x)) 0.001))

; page 15
(define (sqrt-iter guess x)
  (if (good-enough? guess x)
    	guess
	(sqrt-iter (improve guess x)
		   x)))

; page 16
(define (sqrt x)
  (sqrt-iter 1.0 x))
