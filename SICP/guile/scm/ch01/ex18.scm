; page 41
; (lambda (x) (+ x 4))

; page 41
; (lambda (x) (/ 1.0 (* x (+ x 2))))

; page 41
(define (pi-sum a b)
 (sum (lambda (a) (/ 1.0 (* a (+ a 2))))
      a
      (lambda (a) (+ a 4))
      b))
