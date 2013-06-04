# Makefile
# criado por: crisgc

PDFVIEWER = evince
CODES = ./codes/NumberToWords.java ./codes/RemoteMathOperations.java \
			 ./codes/NumberConversion.php ./codes/ConverterClient.java
IMGS = ./imgs/ufrj.eps ./imgs/calculadora.eps ./imgs/webservice-design.eps \
			 ./imgs/arquitetura.eps ./imgs/screenshot.eps
ARQS_TEX = arquivo.tex pacotes.tex  comandos.tex \
					 capa.tex introducao.tex arquitetura.tex codigos.tex conclusoes.tex

.PHONY: all
all: showpdf

# Regra geral para formar os .eps a partir de .jpg
%.eps: %.jpg
	convert $^ $@

%.eps: %.png
	convert $^ $@

./imgs/webservice-design.eps: ./imgs/webservice-design.png

./imgs/screenshot.eps: ./imgs/screenshot.png

.PHONY: showpdf
showpdf: arquivo.pdf
	$(PDFVIEWER) $^&

references.bib: ../../../../../Biblio/references.bib
	ln -s -T $< $@

# Compilação Latex
arquivo.pdf: arquivo.ps
	ps2pdf -sPAPERSIZE=a4 $< $@
arquivo.ps: arquivo.dvi
	dvips -t a4 -o $@ $<
arquivo.aux: $(ARQS_TEX) $(IMGS) $(CODES)
	latex $<
	bibtex $@
arquivo.dvi: arquivo.tex $(ARQS_TEX) $(IMGS) $(CODES)
	latex $<
	latex $<

.PHONY: clean
clean: 
	-rm *.log *.aux *.dvi *.bbl *.blg arquivo.pdf
