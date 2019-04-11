out_dir = out
out_run = run
main = Driver

all: ${out_dir} compile jar

jar:
	jar cfe ${out_run}.jar ${main} ${out_dir}/${main}.class

compile: ${out_dir} ${src}
	javac -sourcepath src/* -d ${out_dir}

${out_dir}:
	mkdir -p $@

clean:
	rm -rf ${out_dir} run.jar
