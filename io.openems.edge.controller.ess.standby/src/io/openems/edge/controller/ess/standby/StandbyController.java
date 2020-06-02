package io.openems.edge.controller.ess.standby;

import io.openems.edge.common.channel.Doc;
import io.openems.edge.controller.api.Controller;
import io.openems.edge.controller.ess.standby.statemachine.State;

public interface StandbyController extends Controller {

	public enum ChannelId implements io.openems.edge.common.channel.ChannelId {
		STATE_MACHINE(Doc.of(State.values()) //
				.text("Current State of State-Machine")), //
		;

		private final Doc doc;

		private ChannelId(Doc doc) {
			this.doc = doc;
		}

		@Override
		public Doc doc() {
			return this.doc;
		}
	}

}
