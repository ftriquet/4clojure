;Write a function which packs consecutive duplicates into sub-lists.
;(= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
;(= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
;(= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))

(def answer
  (fn [s]
    (reverse
      (loop [res  '()
             s    s]
        (if (empty? s)
          res
          (if (empty? res)
            (recur (cons (list (first s)) res) (rest s))
            (if (= (first s) (first (first res)))
              (recur (cons (cons (first s) (first res)) (rest res)) (rest s))
              (recur (cons (list (first s)) res) (rest s)))))))))

(println (= (answer [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3))))
(println (= (answer [:a :a :b :b :c]) '((:a :a) (:b :b) (:c))))
(println (= (answer [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4]))))
