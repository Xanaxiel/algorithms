(ns codelavida.core)

(defn my-last
  "Returns the last element in a collection"
  {:arglists '([coll])
   :static   true}
  [coll]
  (if (next coll)
    (recur (next coll))
    (first coll)))