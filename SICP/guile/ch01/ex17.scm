(define (cube x) (* x x x))

; page 37
(define (sum-integers a b)
 (if (> a b)
     0
     (+ a (sum-integers (+ a 1) b))))

; page 38
(define (sum-cubes a b)
 (if (> a b)
     0
     (+ (cube a) (sum-cubes (+ a 1) b))))

; page 38
(define (pi-sum a b)
 (if (> a b)
     0
     (+ (/ 1.0 (* a (+ a 2))) (pi-sum (+ a 4) b))))

; page 38
(define (sum term a next b)
 (if (> a b)
     0
     (+ (term a)
        (sum term (next a) next b))))

; page 39
(define (inc n) (+ n 1))

; page 39
(define (sum-cubes a b)
 (sum cube a inc b))

; page 39
(define (identity x) x)

; page 39
(define (sum-integers a b)
 (sum identity a inc b))

; page 39
(define (pi-sum a b)
 (define (pi-term x)
  (/ 1.0 (* x (+ x 2))))

 (define (pi-next x)
  (+ x 4))

 (sum pi-term a pi-next b))

; page 39
(define (integral f a b dx)
 (define (add-dx x) (+ x dx))
 (* (sum f (+ a (/ dx 2.0)) add-dx b)
  dx))

