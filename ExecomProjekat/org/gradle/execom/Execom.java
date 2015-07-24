/**
 * This class is generated by jOOQ
 */
package org.gradle.execom;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.gradle.execom.tables.Employee;
import org.gradle.execom.tables.Project;
import org.gradle.execom.tables.Projectinfo;
import org.gradle.execom.tables.Tagcloud;
import org.gradle.execom.tables.Tagcloudemp;
import org.gradle.execom.tables.Tagclouds;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Execom extends SchemaImpl {

	private static final long serialVersionUID = -1688965302;

	/**
	 * The reference instance of <code>execom</code>
	 */
	public static final Execom EXECOM = new Execom();

	/**
	 * No further instances allowed
	 */
	private Execom() {
		super("execom");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			Employee.EMPLOYEE,
			Project.PROJECT,
			Projectinfo.PROJECTINFO,
			Tagcloud.TAGCLOUD,
			Tagcloudemp.TAGCLOUDEMP,
			Tagclouds.TAGCLOUDS);
	}
}
