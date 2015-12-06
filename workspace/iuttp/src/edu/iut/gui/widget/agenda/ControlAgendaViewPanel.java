package edu.iut.gui.widget.agenda;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerModel;

import edu.iut.app.ApplicationSession;

public class ControlAgendaViewPanel extends JPanel {

	CardLayout agendaViewLayout;
	JPanel contentPane;

	int selectedYear;
	int selectedMonth;
	int selectedDay;

	public ControlAgendaViewPanel(CardLayout layerLayout, final JPanel contentPane) {

		this.agendaViewLayout = layerLayout;
		this.contentPane = contentPane;
		/** EX3: REMPLACEMENT DU BOUTON NEXT */
		//Mise en page 
		setLayout(new GridLayout (20,1));
		//Label
		JLabel jour = new JLabel("Day :");
		JLabel mois = new JLabel("Month :");
		JLabel annee = new JLabel("Year :");
		//Ann�e courante
		Calendar c = Calendar.getInstance();
		int currentYear = c.get(Calendar.YEAR);
		//Spinner
		SpinnerModel model =new SpinnerNumberModel(currentYear,currentYear-5, currentYear+5,1);  
		JSpinner spinner = new JSpinner(model);
		this.add(annee);
		this.add(spinner);

		//Num�ros de mois
		String[] nMois = new String[12];
		for (int i=0; i<12 ; i++){
			String s = Integer.toString(i+1);
			nMois[i]= s ;
		}
		//ComboBox de num�ros de mois
		JComboBox month = new JComboBox(nMois);
		int currentMonth = c.get(Calendar.MONTH);
		month.setSelectedIndex(currentMonth);
		this.add(mois);
		this.add(month);

		//Num�ros de jours
		String[] nJours = new String[7];
		for (int i=0; i<7 ; i++){
			String s = Integer.toString(i+1);
			nJours[i]= s ;
		}
		//ComboBox de num�ros de jours
		JComboBox day = new JComboBox(nJours);
		int currentDay = c.get(Calendar.DAY_OF_WEEK);
		day.setSelectedIndex(currentDay-2);
		this.add(jour);
		this.add(day);
	}

	/**
	 * Obtenir l'ann�e s�lectionn�e
	 * @return Ann�e
	 */
	public int getYear() {
		return selectedYear;
	}
	/**
	 * Obtenir le mois s�lectionn�
	 * @return Mois
	 */
	public int getMonth() {
		return selectedMonth;
	}
	/**
	 * Obtenir le jour s�lectionn�
	 * @return Jour
	 */
	public int getDay() {
		return selectedDay;
	}
	

}
