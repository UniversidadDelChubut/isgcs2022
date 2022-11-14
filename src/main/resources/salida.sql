--
-- PostgreSQL database dump
--

-- Dumped from database version 13.5 (Ubuntu 13.5-0ubuntu0.21.04.1)
-- Dumped by pg_dump version 13.5 (Ubuntu 13.5-0ubuntu0.21.04.1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: salida; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.salida (
    idproceso text NOT NULL,
    campo text,
    total numeric
);


ALTER TABLE public.salida OWNER TO postgres;

--
-- Data for Name: salida; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.salida (idproceso, campo, total) FROM stdin;
\.


--
-- PostgreSQL database dump complete
--

