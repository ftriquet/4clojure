;Write a function which reverses the interleave process into x number of subsequences
;(= (__ [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))
;(= (__ (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))
;(= (__ (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9)))

(def answer
  (fn [coll n]
    (reverse
      (loop [s    coll
             c    n
             res  '()]
        (if (= 0 c)
          res
          (recur (rest s) (dec c) (cons (flatten (partition-all 1 n s)) res)))))))

(println (= (answer [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6))))
(println (= (answer (range 9) 3) '((0 3 6) (1 4 7) (2 5 8))))
(println (= (answer (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9))))
