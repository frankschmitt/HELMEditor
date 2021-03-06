/*******************************************************************************
 * Copyright C 2012, The Pistoia Alliance
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 ******************************************************************************/
package org.helm.editor.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import org.helm.editor.conversion.ConvertNotationDialog;
import org.helm.editor.editor.MacromoleculeEditor;

public class ConvertNotationAction extends AbstractAction {

	private MacromoleculeEditor _editor;
	private ConvertNotationDialog convertNotationDialog;

	public ConvertNotationAction(MacromoleculeEditor editor) {
		super("Convert Notation ...");
		_editor = editor;
		convertNotationDialog = new ConvertNotationDialog(_editor);
	}

	public void actionPerformed(ActionEvent arg0) {
		convertNotationDialog.setVisible(true);
	}

}
