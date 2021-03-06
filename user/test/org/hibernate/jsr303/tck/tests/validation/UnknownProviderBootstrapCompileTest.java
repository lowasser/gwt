/*
 * Copyright 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.hibernate.jsr303.tck.tests.validation;

import org.hibernate.jsr303.tck.util.TckCompileTestCase;
import org.hibernate.jsr303.tck.util.client.NonTckTest;
import org.hibernate.jsr303.tck.util.client.NotSupported;
import org.hibernate.jsr303.tck.util.client.NotSupported.Reason;

/**
 * Test wrapper for {@link UnknownProviderBootstrapTest} methods that are
 * suppose to fail to compile.
 */
public class UnknownProviderBootstrapCompileTest extends TckCompileTestCase {

  @NonTckTest
  public void testThereMustBeOnePassingTest() {}

  @NotSupported(reason = Reason.CUSTOM_PROVIDERS)
  public void testUnknownProviderThrowsValidationException() {
    fail("Custom validation providers are not supported so an unknown provider should never occur");
  }
}