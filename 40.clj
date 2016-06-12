;Write a function which separates the items of a sequence by an arbitrary value.
;(= (__ 0 [1 2 3]) [1 0 2 0 3])
;(= (apply str (__ ", " ["one" "two" "three"])) "one, two, three")
;(= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d])

(def answer
  (fn [v s]
      (reverse (drop 1 (reduce #(cons v (cons %2 %1)) [] s)))))


(println (= (answer 0 [1 2 3]) [1 0 2 0 3]))
(println (= (apply str (answer ", " ["one" "two" "three"])) "one, two, three"))
( println (= (answer :z [:a :b :c :d]) [:a :z :b :z :c :z :d]))
