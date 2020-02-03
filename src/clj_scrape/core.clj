(ns clj-scrape.core
  (:gen-class)
  (:require [net.cgrand.enlive-html :as html]
            [org.httpkit.client :as http]))

(defn get-title []
  (-> @(http/get "https://example.com")
      (:body)
      (html/html-snippet)
      (html/select [:title])
      (first)
      (:content)
      (first)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (get-title)))
