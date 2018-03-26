package lesson7.asm;

import java.util.List;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		ClassReader cr = new ClassReader(MyTestClass.class.getName());
		ClassNode cn = new ClassNode();
		cr.accept(cn, ClassReader.SKIP_DEBUG);

		List<MethodNode> methods = cn.methods;
		for (MethodNode methodNode : methods) {
			System.out.println(methodNode.name);
		}

		List<FieldNode> fields = cn.fields;
		for (FieldNode fieldNode : fields) {
			System.out.println(fieldNode.name);
		}
	}

}
