all: day*
	@for dir in $^ ; do cd $$dir ;make;cd .. ; done
clean: day*
	@for dir in $^ ; do cd $$dir ;make clean;cd .. ; done