; page 21
(define (factorial n)
  (if (= n 1)
    1
    (* n (factorial (- n 1)))))

