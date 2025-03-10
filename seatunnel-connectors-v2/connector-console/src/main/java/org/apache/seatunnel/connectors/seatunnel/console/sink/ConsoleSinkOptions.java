/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.connectors.seatunnel.console.sink;

import org.apache.seatunnel.api.configuration.Option;
import org.apache.seatunnel.api.configuration.Options;
import org.apache.seatunnel.api.options.SinkConnectorCommonOptions;

public class ConsoleSinkOptions extends SinkConnectorCommonOptions {

    public static final Option<Boolean> LOG_PRINT_DATA =
            Options.key("log.print.data")
                    .booleanType()
                    .defaultValue(true)
                    .withDescription(
                            "Flag to determine whether data should be printed in the logs.");

    public static final Option<Integer> LOG_PRINT_DELAY =
            Options.key("log.print.delay.ms")
                    .intType()
                    .defaultValue(0)
                    .withDescription(
                            "Delay in milliseconds between printing each data item to the logs.");
}
