(defproject clj-scrape "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [enlive "1.1.6"]
                 [http-kit "2.4.0-alpha3"]]
  :main ^:skip-aot clj-scrape.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
