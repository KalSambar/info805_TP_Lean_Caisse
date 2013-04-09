package info805.tp.chantrel.lean.caisse.test;

import static org.junit.Assert.*;
import info805.tp.chantrel.lean.caisse.metier.Caisse;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

public class TestCaisse {

	@Test
	public void testAppliquerReductionPaireCerises() {
		Caisse caisse = new Caisse();
		int nombreCerises = 0;
		int reductionAAppliquer = 20;
		double prix_cerises = 75.0;
		
		/* Premier test : nombreCerises = 0 et total_panier = 0*/
		caisse.appliquerReductionPaireCerises(nombreCerises, reductionAAppliquer);
		Assert.assertThat(caisse.getTotal_panier(), IsEqual.equalTo(0.0));
		
		/* Second test : nombreCerises = 1 et total_panier = 0*/
		nombreCerises = 1;
		caisse.setTotal_panier(prix_cerises);
		caisse.appliquerReductionPaireCerises(nombreCerises, reductionAAppliquer);
		Assert.assertThat(caisse.getTotal_panier(), IsEqual.equalTo(prix_cerises));
		
		/* Troisième test : nombreCerises = 2 et total_panier = 0*/
		nombreCerises = 2;
		caisse.setTotal_panier(prix_cerises * 2);
		caisse.appliquerReductionPaireCerises(nombreCerises, reductionAAppliquer);
		Assert.assertThat(caisse.getTotal_panier(), IsEqual.equalTo((prix_cerises * 2)-reductionAAppliquer));
		
		/* Quatrième test : nombreCerises = 4 et total_panier = 30*/
		nombreCerises = 4;
		caisse.setTotal_panier(30 + (prix_cerises * 4) - reductionAAppliquer);
		caisse.appliquerReductionPaireCerises(nombreCerises, reductionAAppliquer);
		Assert.assertThat(caisse.getTotal_panier(), IsEqual.equalTo((30 + (prix_cerises * 4) - reductionAAppliquer * 2)));
	}

	@Test
	public void testAppliquerReductionPaireBananes() {
		Caisse caisse = new Caisse();
		int nombreBananes = 0;
		int reductionAAppliquer = 150;
		double prix_bananes = 150.0;
		
		/* Premier test : nombreBananes = 0 et total_panier = 0*/
		caisse.appliquerReductionPaireCerises(nombreBananes, reductionAAppliquer);
		Assert.assertThat(caisse.getTotal_panier(), IsEqual.equalTo(0.0));
		
		/* Second test : nombreBananes = 1 et total_panier = 0*/
		nombreBananes = 1;
		caisse.setTotal_panier(prix_bananes);
		caisse.appliquerReductionPaireCerises(nombreBananes, reductionAAppliquer);
		Assert.assertThat(caisse.getTotal_panier(), IsEqual.equalTo(prix_bananes));
		
		/* Troisième test : nombreBananes = 2 et total_panier = 0*/
		nombreBananes = 2;
		caisse.setTotal_panier(prix_bananes * 2);
		caisse.appliquerReductionPaireCerises(nombreBananes, reductionAAppliquer);
		Assert.assertThat(caisse.getTotal_panier(), IsEqual.equalTo((prix_bananes * 2)-reductionAAppliquer));
		
		/* Quatrième test : nombreBananes = 4 et total_panier = 30*/
		nombreBananes = 4;
		caisse.setTotal_panier(30 + (prix_bananes * 4) - reductionAAppliquer);
		caisse.appliquerReductionPaireCerises(nombreBananes, reductionAAppliquer);
		Assert.assertThat(caisse.getTotal_panier(), IsEqual.equalTo((30 + (prix_bananes * 4) - reductionAAppliquer * 2)));
	}

	@Test
	public void testAppliquerReductionQuatrePommes() {
		fail("Not yet implemented");
	}

	@Test
	public void testAppliquerReductionTripleApples() {
		fail("Not yet implemented");
	}

	@Test
	public void testAppliquerReductionPaireMele() {
		Caisse caisse = new Caisse();
		int nombreMeles = 0;
		int reductionAAppliquer = 50;
		double prix_meles = 75.0;
		
		/* Premier test : nombreMeles = 0 et total_panier = 0*/
		caisse.appliquerReductionPaireCerises(nombreMeles, reductionAAppliquer);
		Assert.assertThat(caisse.getTotal_panier(), IsEqual.equalTo(0.0));
		
		/* Second test : nombreMeles = 1 et total_panier = 0*/
		nombreMeles = 1;
		caisse.setTotal_panier(prix_meles);
		caisse.appliquerReductionPaireCerises(nombreMeles, reductionAAppliquer);
		Assert.assertThat(caisse.getTotal_panier(), IsEqual.equalTo(prix_meles));
		
		/* Troisième test : nombreMeles = 2 et total_panier = 0*/
		nombreMeles = 2;
		caisse.setTotal_panier(prix_meles * 2);
		caisse.appliquerReductionPaireCerises(nombreMeles, reductionAAppliquer);
		Assert.assertThat(caisse.getTotal_panier(), IsEqual.equalTo((prix_meles * 2)-reductionAAppliquer));
		
		/* Quatrième test : nombreMeles = 4 et total_panier = 30*/
		nombreMeles = 4;
		caisse.setTotal_panier(30 + (prix_meles * 4) - reductionAAppliquer);
		caisse.appliquerReductionPaireCerises(nombreMeles, reductionAAppliquer);
		Assert.assertThat(caisse.getTotal_panier(), IsEqual.equalTo((30 + (prix_meles * 4) - reductionAAppliquer * 2)));
	}

	@Test
	public void testAppliquerReductionCinqFruits() {
		fail("Not yet implemented");
	}

}
