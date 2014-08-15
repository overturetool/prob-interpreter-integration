/*
 * #%~
 * Integration of the ProB Solver for the VDM Interpreter
 * %%
 * Copyright (C) 2008 - 2014 Overture
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #~%
 */
package org.overture.interpreter.tests;

import java.io.File;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.overture.ast.lex.Dialect;

@RunWith(value = Parameterized.class)
public class ClassesPpTest extends CommonInterpreterTest
{

	public ClassesPpTest(Dialect dialect, String suiteName, File testSuiteRoot,
			File file)
	{
		super(dialect, file, suiteName, testSuiteRoot);
	}

	@Parameters()
	public static Collection<Object[]> getData()
	{
		String name = "Interpreter Class PP TestSuite";
		String root = "src\\test\\resources\\classes";

		Collection<Object[]> tests = TestSourceFinder.createTestCompleteFile(Dialect.VDM_PP, name, root, "vdmpp", "");
		return tests;
	}

	@Override
	protected String getPropertyId()
	{
		return "class.pp";
	}

}
