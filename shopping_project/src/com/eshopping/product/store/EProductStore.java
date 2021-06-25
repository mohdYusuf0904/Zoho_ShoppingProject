package com.eshopping.product.store;
import com.eshopping.product.ElectronicProduct;
import com.eshopping.product.ProductManager;
import com.eshopping.product.entities.Electronics;

public class EProductStore {

	private static EProductStore eproduct ;
	private ElectronicDetails ed;
	
	private EProductStore(ElectronicDetails ed) {
		
		this.ed = new ElectronicDetails();
	}

	public void loadProduct() {
		
		loadFridge();
		LoadLaptaps();
		LoadTelevision();
		LoadMobile();
		LoadWashingMachine();	
	}

	private void LoadWashingMachine() {
		
		ElectronicProduct washingMachine;
		double price[]= {16000,25000,35000};
		String brand[]= {
			"Panasonic",
			"Lg",
			"Haier"
		};
		
		for(int i=0;i<3;i++)
		{
			washingMachine = new Electronics.ElectronicBuilder("Washing machine", price[i])
							.setDescription(brand[i]+ "7 kg 5 Star AquaBeat Wash Fully Automatic Top Load Grey  (NA-F70LF1HRB)")
							.setBrand(brand[i])
							.setAdditionalDetails(ed.getWashingMachineAdditionDetails())
							.setBoxDetails(ed.getWashingMachineBoxDetails())
							.setWarrrantyDetails(ed.getWashingMachineWarrantyDetails())
							.getElectronicInstance();
		
			ProductManager.getInstance().addProducts(washingMachine);
			
			
			washingMachine = new Electronics.ElectronicBuilder("Washing machine", price[i])
							.setDescription(brand[i]+" 8 kg 5 Star AquaBeat Wash Fully Automatic Top Load BLUE  (NA-SDFLF1HRB)")
							.setBrand(brand[i])
							.setAdditionalDetails(ed.getWashingMachineAdditionDetails())
							.setBoxDetails(ed.getWashingMachineBoxDetails())
							.setWarrrantyDetails(ed.getWashingMachineWarrantyDetails())
							.getElectronicInstance();
			
			ProductManager.getInstance().addProducts(washingMachine);
			
			
			
			
			washingMachine = new Electronics.ElectronicBuilder("Washing machine", price[i])
							.setDescription(brand[i]+" 8/5 kg Smart Wi-Fi Enabled Inverter Technology Washer with Dryer with In-built Heater Grey  (80WDIWBedG)")
							.setBrand(brand[i])
							.setAdditionalDetails(ed.getWashingMachineAdditionDetails())
							.setBoxDetails(ed.getWashingMachineBoxDetails())
							.setWarrrantyDetails(ed.getWashingMachineWarrantyDetails())
							.getElectronicInstance();
		    
			ProductManager.getInstance().addProducts(washingMachine);
			
		
		}
		
	}

	private void LoadMobile() {
		
		ElectronicProduct mobile;
		double price[]= {16000,25000,34400};
		String brand[]= {"Samsung ","Apple "};
		for(int i=0;i<3;i++)
		{
		
					mobile = new Electronics.ElectronicBuilder(brand[i%2]+"Mobile", price[i])
							.setDescription(brand[i%2]+" F41 (Fusion Green, 128 GB)  (6 GB RAM)")
							.setBrand(brand[i%2])
							.setAdditionalDetails(ed.getMobileAdditionDetails())
							.setBoxDetails(ed.getMobileBoxDetails())
							.setWarrrantyDetails(ed.getMobileWarrantyDetails())
							.getElectronicInstance();
					ProductManager.getInstance().addProducts(mobile);
					
		
						mobile = new Electronics.ElectronicBuilder(brand[i%2]+"Mobile", price[i])
								.setDescription(brand[i%2]+"Xr (silver, 228 GB)  (6 GB RAM)")									.setBrand(brand[i%2])
								.setAdditionalDetails(ed.getMobileAdditionDetails())
								.setBoxDetails(ed.getMobileBoxDetails())
								.setWarrrantyDetails(ed.getMobileWarrantyDetails())
								.getElectronicInstance();
						
						ProductManager.getInstance().addProducts(mobile);
										
		}
	}

	private void LoadTelevision() {

		ElectronicProduct tv;
		String brand[]= {"one plus","Mi"};
		double price[] = {49000,35000};
		for(int i=0;i<2;i++)
		{
			
			tv = new Electronics.ElectronicBuilder("Television",price[i])
				.setDescription(brand[i]+" U1S 139 cm (55 inch) Ultra HD (4K) LED Smart Android TV  (55UC1A00)")
				.setBrand(brand[i])
				.setAdditionalDetails(ed.getTvAdditionDetails())
				.setBoxDetails(ed.getTvBoxDetails())
				.setWarrrantyDetails(ed.getTvWarrantyDetails()).getElectronicInstance();

			ProductManager.getInstance().addProducts(tv);
				
			tv = new Electronics.ElectronicBuilder("Television",price[i])
					.setDescription(brand[i]+" 4A Horizon Edition 80 cm (32 inch) HD Ready LED Smart Android TV")
					.setBrand(brand[i])
					.setAdditionalDetails(ed.getTvAdditionDetails())
					.setBoxDetails(ed.getTvBoxDetails())
					.setWarrrantyDetails(ed.getTvWarrantyDetails()).getElectronicInstance();
			
			ProductManager.getInstance().addProducts(tv);
			
			
		}
		
	}

	private void LoadLaptaps() {

		ElectronicProduct laptap;
		double price[]= {35000,65000};
		String brand[]= {"Hp","Asus"};
		
		for(int i=0;i<2;i++)
		{
			laptap = new Electronics.ElectronicBuilder(brand[i]+" Laptap",price[i])
					.setDescription(brand[i]+" Pavilion Gaming Ryzen 5 Quad Core 3550H - (8 GB/1 TB HDD/Windows 10 Home/4 GB Graphics/NVIDIA GeForce GTX 1650) (15.6 inch, Black, 2.04 kg)")
					.setBrand(brand[i])
					.setAdditionalDetails(ed.getAdditionDetails())
					.setBoxDetails(ed.getBoxDetails())
					.setWarrrantyDetails(ed.getWarrantyDetails()).getElectronicInstance();
			
			ProductManager.getInstance().addProducts(laptap);
		
			laptap = new Electronics.ElectronicBuilder(brand[i]+" Laptap",price[i])
					.setDescription(" Strix G15 Core i5 10th Gen - (8 GB/512 GB SSD/Windows 10 Home/4 GB Graphics/NVIDIA GeForce GTX 1650 Ti/144 Hz) G512LI-HN094T Gaming Laptop  (15.6 inch, Black Plastic, 2.3 kg)")
					.setBrand(brand[i])
					.setAdditionalDetails(ed.getAdditionDetails())
					.setBoxDetails(ed.getBoxDetails())
					.setWarrrantyDetails(ed.getWarrantyDetails()).getElectronicInstance();
				
			ProductManager.getInstance().addProducts(laptap);
					
			
		}
		
	}

	private void loadFridge() {

		ElectronicProduct fridge;
		double price[]= {
				35000,25000,18000
		};
		String brand[]= {
				"Panasonic ",
				"Lg ",
				"Haier "
				
			};
		for(int i=0;i<3;i++)
		{
			
			fridge = new Electronics.ElectronicBuilder(brand[i]+"Fridge",price[i])
			.setDescription(brand[i]+"190 L Direct Cool Double Door 4 Star Refrigerator with Base Drawer  (Blue Plumeria, GL-D201ABPY)")
			.setBrand(brand[i])
			.setAdditionalDetails(ed.getFridgeAdditionDetails())
			.setBoxDetails(ed.getFridgeBoxDetails())
			.setWarrrantyDetails(ed.getFridgeWarrantyDetails()).getElectronicInstance();
			ProductManager.getInstance().addProducts(fridge);


			fridge = new Electronics.ElectronicBuilder(brand[i]+"Fridge",price[i])
			.setDescription(brand[i]+" 198 L Direct Cool Single Door 4 Star Refrigerator with Base Drawer  (Camellia Purple, RR21T2H2XCR/HL)")
			.setBrand(brand[i])
			.setAdditionalDetails(ed.getFridgeAdditionDetails())
			.setBoxDetails(ed.getFridgeBoxDetails())
			.setWarrrantyDetails(ed.getFridgeWarrantyDetails()).getElectronicInstance();
			ProductManager.getInstance().addProducts(fridge);

			fridge = new Electronics.ElectronicBuilder(brand[i]+"Fridge",price[i])
			.setDescription(brand[i]+" 118 L Direct Cool Single Door 2 Star Refrigerator with Base Drawer  (Camellia Purple, RR21T2H2XCR/HL)")
			.setBrand(brand[i])
			.setAdditionalDetails(ed.getFridgeAdditionDetails())
			.setBoxDetails(ed.getFridgeBoxDetails())
			.setWarrrantyDetails(ed.getFridgeWarrantyDetails()).getElectronicInstance();
			ProductManager.getInstance().addProducts(fridge);

			
		}
		
	}
	
	
	public static EProductStore getInstance() {
		
		if(eproduct==null) {
			
			eproduct = new EProductStore(new ElectronicDetails());
			
		}
		
		return eproduct;
	
	}
	
}
